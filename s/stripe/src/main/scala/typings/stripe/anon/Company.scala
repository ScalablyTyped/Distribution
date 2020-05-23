package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  var company: Additional
  var individual: Additional
}

object Company {
  @scala.inline
  def apply(company: Additional, individual: Additional): Company = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
}

