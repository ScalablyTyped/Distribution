package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialAppLaunchResult extends StObject
/** The result of attempting to launch an app on a remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppLaunchResult")
@js.native
object DialAppLaunchResult extends StObject {
  
  /** The app failed to launch. */
  @js.native
  sealed trait failedToLaunch extends DialAppLaunchResult
  
  /** The app successfully launched. */
  @js.native
  sealed trait launched extends DialAppLaunchResult
  
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure extends DialAppLaunchResult
  
  /** The app was not found. */
  @js.native
  sealed trait notFound extends DialAppLaunchResult
}
