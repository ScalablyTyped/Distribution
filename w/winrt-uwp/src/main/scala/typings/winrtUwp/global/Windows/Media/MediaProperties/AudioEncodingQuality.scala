package typings.winrtUwp.global.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the level of quality of the audio encoding. The higher the quality, the better the audio fidelity, and the larger the resulting file. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality with Double] = js.native
  
  /* 0 */ val auto: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.auto with Double = js.native
  
  /* 1 */ val high: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.high with Double = js.native
  
  /* 3 */ val low: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.low with Double = js.native
  
  /* 2 */ val medium: typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingQuality.medium with Double = js.native
}
