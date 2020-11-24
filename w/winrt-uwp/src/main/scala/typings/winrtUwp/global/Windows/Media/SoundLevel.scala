package typings.winrtUwp.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the sound level of the capture or render stream. */
@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.SoundLevel with Double] = js.native
  
  /* 2 */ val full: typings.winrtUwp.Windows.Media.SoundLevel.full with Double = js.native
  
  /* 1 */ val low: typings.winrtUwp.Windows.Media.SoundLevel.low with Double = js.native
  
  /* 0 */ val muted: typings.winrtUwp.Windows.Media.SoundLevel.muted with Double = js.native
}
