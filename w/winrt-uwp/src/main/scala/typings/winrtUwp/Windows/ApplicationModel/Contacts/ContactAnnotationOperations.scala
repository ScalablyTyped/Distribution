package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAnnotationOperations extends js.Object

/** Specifies the types of operations you can perform with a Contact . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAnnotationOperations")
@js.native
object ContactAnnotationOperations extends js.Object {
  /** Make and audio call. */
  @js.native
  sealed trait audioCall extends ContactAnnotationOperations
  
  /** Get the contact profile. */
  @js.native
  sealed trait contactProfile extends ContactAnnotationOperations
  
  /** Send an SMS/MMS message. */
  @js.native
  sealed trait message extends ContactAnnotationOperations
  
  /** None */
  @js.native
  sealed trait none extends ContactAnnotationOperations
  
  /** Access social media feeds. */
  @js.native
  sealed trait socialFeeds extends ContactAnnotationOperations
  
  /** Make a video call. */
  @js.native
  sealed trait videoCall extends ContactAnnotationOperations
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactAnnotationOperations with Double] = js.native
  /* 3 */ @js.native
  object audioCall extends TopLevel[audioCall with Double]
  
  /* 1 */ @js.native
  object contactProfile extends TopLevel[contactProfile with Double]
  
  /* 2 */ @js.native
  object message extends TopLevel[message with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object socialFeeds extends TopLevel[socialFeeds with Double]
  
  /* 4 */ @js.native
  object videoCall extends TopLevel[videoCall with Double]
  
}

