package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialAppState extends StObject
/** The state of the application on the remote device. */
@JSGlobal("Windows.Media.DialProtocol.DialAppState")
@js.native
object DialAppState extends StObject {
  
  /** An error occurred while attempting to retrieve the state. */
  @js.native
  sealed trait networkFailure extends DialAppState
  
  /** The app is running on the remote device. */
  @js.native
  sealed trait running extends DialAppState
  
  /** The app is stopped on the remote device. */
  @js.native
  sealed trait stopped extends DialAppState
  
  /** The state cannot be determined. */
  @js.native
  sealed trait unknown extends DialAppState
}
