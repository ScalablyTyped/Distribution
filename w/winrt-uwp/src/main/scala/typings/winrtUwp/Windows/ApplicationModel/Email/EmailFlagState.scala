package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailFlagState extends StObject
/** Defines the flag state of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailFlagState")
@js.native
object EmailFlagState extends StObject {
  
  /** The email was flagged for follow up and the flag has been cleared. */
  @js.native
  sealed trait cleared
    extends StObject
       with EmailFlagState
  
  /** The email was flagged for follow up and has been marked completed. */
  @js.native
  sealed trait completed
    extends StObject
       with EmailFlagState
  
  /** The email has been flagged for follow up. */
  @js.native
  sealed trait flagged
    extends StObject
       with EmailFlagState
  
  /** The email has not been flagged for follow up. */
  @js.native
  sealed trait unflagged
    extends StObject
       with EmailFlagState
}
