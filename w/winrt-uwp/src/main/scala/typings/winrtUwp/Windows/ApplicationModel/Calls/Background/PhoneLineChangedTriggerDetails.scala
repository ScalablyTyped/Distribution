package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a change to the properties of a phone line. */
@js.native
trait PhoneLineChangedTriggerDetails extends js.Object {
  /** Gets a PhoneLineChangeKind value that indicates if the phone line was added, removed, or changed. */
  var changeType: PhoneLineChangeKind = js.native
  /** Gets the ID of the phone line that was added, removed, or changed. */
  var lineId: String = js.native
  /**
    * Checks a phone line against a set of flags to see if any of the specified properties of the phone line have changed.
    * @param lineProperty A set of flags which indicate the phone line properties to query for changes.
    * @return Returns true if any of the properties indicated by the lineProperty parameter have changed on the phone line.
    */
  def hasLinePropertyChanged(lineProperty: PhoneLineProperties): Boolean = js.native
}

object PhoneLineChangedTriggerDetails {
  @scala.inline
  def apply(
    changeType: PhoneLineChangeKind,
    hasLinePropertyChanged: PhoneLineProperties => Boolean,
    lineId: String
  ): PhoneLineChangedTriggerDetails = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], hasLinePropertyChanged = js.Any.fromFunction1(hasLinePropertyChanged), lineId = lineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneLineChangedTriggerDetails]
  }
  @scala.inline
  implicit class PhoneLineChangedTriggerDetailsOps[Self <: PhoneLineChangedTriggerDetails] (val x: Self) extends AnyVal {
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
    def setChangeType(value: PhoneLineChangeKind): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasLinePropertyChanged(value: PhoneLineProperties => Boolean): Self = this.set("hasLinePropertyChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setLineId(value: String): Self = this.set("lineId", value.asInstanceOf[js.Any])
  }
  
}

