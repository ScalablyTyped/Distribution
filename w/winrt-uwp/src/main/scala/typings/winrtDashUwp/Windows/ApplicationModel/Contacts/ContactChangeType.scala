package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactChangeType extends js.Object

/** Specifies the type of change that occurred for a ContactChanged event. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeType")
@js.native
object ContactChangeType extends js.Object {
  /** Change tracking was lost. Call Reset to reestablish continuity with the ContactStore . */
  @js.native
  sealed trait changeTrackingLost extends ContactChangeType
  
  /** A contact was created. */
  @js.native
  sealed trait created extends ContactChangeType
  
  /** A contact was deleted. */
  @js.native
  sealed trait deleted extends ContactChangeType
  
  /** A contact was modified. */
  @js.native
  sealed trait modified extends ContactChangeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactChangeType with Double] = js.native
  /* 3 */ @js.native
  object changeTrackingLost extends TopLevel[changeTrackingLost with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 2 */ @js.native
  object deleted extends TopLevel[deleted with Double]
  
  /* 1 */ @js.native
  object modified extends TopLevel[modified with Double]
  
}

