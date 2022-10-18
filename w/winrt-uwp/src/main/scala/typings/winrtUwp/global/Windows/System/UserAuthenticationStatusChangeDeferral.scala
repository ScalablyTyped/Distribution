package typings.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a user authentication status change deferral returned by the UserAuthenticationStatusChangingEventArgs.GetDeferral method. */
/* note: abstract class */ @JSGlobal("Windows.System.UserAuthenticationStatusChangeDeferral")
@js.native
open class UserAuthenticationStatusChangeDeferral ()
  extends StObject
     with typings.winrtUwp.Windows.System.UserAuthenticationStatusChangeDeferral {
  
  /** Reports that the application has completed its user authentication status change deferral. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}
