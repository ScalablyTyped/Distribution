package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callsignature extends js.Object {
  var `call-signature`: String
  var `index-signature`: String
  var parameter: String
  var `property-declaration`: String
  var `variable-declaration`: String
}

object Callsignature {
  @scala.inline
  def apply(
    `call-signature`: String,
    `index-signature`: String,
    parameter: String,
    `property-declaration`: String,
    `variable-declaration`: String
  ): Callsignature = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("call-signature")(`call-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("index-signature")(`index-signature`.asInstanceOf[js.Any])
    __obj.updateDynamic("property-declaration")(`property-declaration`.asInstanceOf[js.Any])
    __obj.updateDynamic("variable-declaration")(`variable-declaration`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callsignature]
  }
}

