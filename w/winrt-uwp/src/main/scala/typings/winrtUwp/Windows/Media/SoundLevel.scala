package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoundLevel extends StObject
/** Specifies the sound level of the capture or render stream. */
@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends StObject {
  
  /** The sound level is at full volume. */
  @js.native
  sealed trait full extends SoundLevel
  
  /** The sound level is low. */
  @js.native
  sealed trait low extends SoundLevel
  
  /** The sound level is muted. */
  @js.native
  sealed trait muted extends SoundLevel
}
