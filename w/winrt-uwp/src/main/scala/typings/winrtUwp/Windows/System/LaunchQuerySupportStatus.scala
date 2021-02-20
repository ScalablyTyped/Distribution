package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LaunchQuerySupportStatus extends StObject
/** Specifies whether an app is available that supports activation. */
@JSGlobal("Windows.System.LaunchQuerySupportStatus")
@js.native
object LaunchQuerySupportStatus extends StObject {
  
  /** No app is installed to handle the activation. */
  @js.native
  sealed trait appNotInstalled extends LaunchQuerySupportStatus
  
  /** An app that handles the activation is installed but not available because it is being updated by the store or it was installed on a removable device that is not available. */
  @js.native
  sealed trait appUnavailable extends LaunchQuerySupportStatus
  
  /** An app that handles the activation is available and may be activated. */
  @js.native
  sealed trait available extends LaunchQuerySupportStatus
  
  /** The app does not handle the activation. */
  @js.native
  sealed trait notSupported extends LaunchQuerySupportStatus
  
  /** An unknown error was encountered while determining whether an app supports the activation. */
  @js.native
  sealed trait unknown extends LaunchQuerySupportStatus
}
