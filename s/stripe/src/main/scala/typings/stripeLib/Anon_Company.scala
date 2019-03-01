package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Company extends js.Object {
  var company: Anon_Additional
  var individual: Anon_Additional
}

object Anon_Company {
  @scala.inline
  def apply(company: Anon_Additional, individual: Anon_Additional): Anon_Company = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("individual")(individual)
    __obj.asInstanceOf[Anon_Company]
  }
}

