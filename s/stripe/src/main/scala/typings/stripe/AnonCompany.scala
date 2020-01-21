package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompany extends js.Object {
  var company: AnonAdditional
  var individual: AnonAdditional
}

object AnonCompany {
  @scala.inline
  def apply(company: AnonAdditional, individual: AnonAdditional): AnonCompany = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompany]
  }
}

