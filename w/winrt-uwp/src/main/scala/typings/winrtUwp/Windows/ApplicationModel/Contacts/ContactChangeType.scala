package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactChangeType extends StObject
/** Specifies the type of change that occurred for a ContactChanged event. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeType")
@js.native
object ContactChangeType extends StObject {
  
  /** Change tracking was lost. Call Reset to reestablish continuity with the ContactStore . */
  @js.native
  sealed trait changeTrackingLost
    extends StObject
       with ContactChangeType
  
  /** A contact was created. */
  @js.native
  sealed trait created
    extends StObject
       with ContactChangeType
  
  /** A contact was deleted. */
  @js.native
  sealed trait deleted
    extends StObject
       with ContactChangeType
  
  /** A contact was modified. */
  @js.native
  sealed trait modified
    extends StObject
       with ContactChangeType
}
