package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the details about a change to the properties of a phone line. */
trait PhoneLineChangedTriggerDetails extends StObject {
  
  /** Gets a PhoneLineChangeKind value that indicates if the phone line was added, removed, or changed. */
  var changeType: PhoneLineChangeKind
  
  /**
    * Checks a phone line against a set of flags to see if any of the specified properties of the phone line have changed.
    * @param lineProperty A set of flags which indicate the phone line properties to query for changes.
    * @return Returns true if any of the properties indicated by the lineProperty parameter have changed on the phone line.
    */
  def hasLinePropertyChanged(lineProperty: PhoneLineProperties): Boolean
  
  /** Gets the ID of the phone line that was added, removed, or changed. */
  var lineId: String
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
  implicit class PhoneLineChangedTriggerDetailsMutableBuilder[Self <: PhoneLineChangedTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: PhoneLineChangeKind): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasLinePropertyChanged(value: PhoneLineProperties => Boolean): Self = StObject.set(x, "hasLinePropertyChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLineId(value: String): Self = StObject.set(x, "lineId", value.asInstanceOf[js.Any])
  }
}
