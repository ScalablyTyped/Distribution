package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the details about a change to the properties of a phone line. */
trait PhoneLineChangedTriggerDetails extends js.Object {
  /** Gets a PhoneLineChangeKind value that indicates if the phone line was added, removed, or changed. */
  var changeType: PhoneLineChangeKind
  /** Gets the ID of the phone line that was added, removed, or changed. */
  var lineId: String
  /**
    * Checks a phone line against a set of flags to see if any of the specified properties of the phone line have changed.
    * @param lineProperty A set of flags which indicate the phone line properties to query for changes.
    * @return Returns true if any of the properties indicated by the lineProperty parameter have changed on the phone line.
    */
  def hasLinePropertyChanged(lineProperty: PhoneLineProperties): Boolean
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
}

