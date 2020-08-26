package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callsignature extends js.Object {
  var `call-signature`: String = js.native
  var `index-signature`: String = js.native
  var parameter: String = js.native
  var `property-declaration`: String = js.native
  var `variable-declaration`: String = js.native
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
  @scala.inline
  implicit class CallsignatureOps[Self <: Callsignature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setCall-signature`(value: String): Self = this.set("call-signature", value.asInstanceOf[js.Any])
    @scala.inline
    def `setIndex-signature`(value: String): Self = this.set("index-signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def `setProperty-declaration`(value: String): Self = this.set("property-declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def `setVariable-declaration`(value: String): Self = this.set("variable-declaration", value.asInstanceOf[js.Any])
  }
  
}

