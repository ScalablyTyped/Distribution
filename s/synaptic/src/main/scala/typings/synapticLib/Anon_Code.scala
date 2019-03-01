package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: java.lang.String
  var link: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String, link: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Anon_Code]
  }
}

