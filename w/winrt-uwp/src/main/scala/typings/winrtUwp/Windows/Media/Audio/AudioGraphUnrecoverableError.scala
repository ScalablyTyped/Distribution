package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioGraphUnrecoverableError extends StObject
/** Defines unrecoverable errors for the audio graph. */
@JSGlobal("Windows.Media.Audio.AudioGraphUnrecoverableError")
@js.native
object AudioGraphUnrecoverableError extends StObject {
  
  /** The audio device has been lost. */
  @js.native
  sealed trait audioDeviceLost
    extends StObject
       with AudioGraphUnrecoverableError
  
  /** The audio session has been disconnected. */
  @js.native
  sealed trait audioSessionDisconnected
    extends StObject
       with AudioGraphUnrecoverableError
  
  /** No unrecoverable errors were found. */
  @js.native
  sealed trait none
    extends StObject
       with AudioGraphUnrecoverableError
  
  /** An unknown failure occurred during creation of the audio graph. */
  @js.native
  sealed trait unknownFailure
    extends StObject
       with AudioGraphUnrecoverableError
}
