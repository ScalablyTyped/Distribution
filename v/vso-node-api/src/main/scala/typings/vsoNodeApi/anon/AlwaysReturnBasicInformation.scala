package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlwaysReturnBasicInformation extends js.Object {
  var alwaysReturnBasicInformation: scala.Double = js.native
  var includeDeletedSubscriptions: scala.Double = js.native
  var includeFilterDetails: scala.Double = js.native
  var includeInvalidSubscriptions: scala.Double = js.native
  var none: scala.Double = js.native
}

object AlwaysReturnBasicInformation {
  @scala.inline
  def apply(
    alwaysReturnBasicInformation: scala.Double,
    includeDeletedSubscriptions: scala.Double,
    includeFilterDetails: scala.Double,
    includeInvalidSubscriptions: scala.Double,
    none: scala.Double
  ): AlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(alwaysReturnBasicInformation = alwaysReturnBasicInformation.asInstanceOf[js.Any], includeDeletedSubscriptions = includeDeletedSubscriptions.asInstanceOf[js.Any], includeFilterDetails = includeFilterDetails.asInstanceOf[js.Any], includeInvalidSubscriptions = includeInvalidSubscriptions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysReturnBasicInformation]
  }
  @scala.inline
  implicit class AlwaysReturnBasicInformationOps[Self <: AlwaysReturnBasicInformation] (val x: Self) extends AnyVal {
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
    def setAlwaysReturnBasicInformation(value: scala.Double): Self = this.set("alwaysReturnBasicInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDeletedSubscriptions(value: scala.Double): Self = this.set("includeDeletedSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeFilterDetails(value: scala.Double): Self = this.set("includeFilterDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeInvalidSubscriptions(value: scala.Double): Self = this.set("includeInvalidSubscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

