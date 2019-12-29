package typings.winrtDashUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEncodingQuality extends js.Object

/** Describes the level of quality of the audio encoding. The higher the quality, the better the audio fidelity, and the larger the resulting file. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends js.Object {
  /** Auto fills in the proper settings based on the current camera settings. So when Auto is used, settings that are manually modified are ignored. For example, if you create a preset profile using one the static create methods, such as CreateM4a , and specify Auto as the encoding quality, any changes you make to the properties will be overwritten with values based on the current camera settings. */
  @js.native
  sealed trait auto extends AudioEncodingQuality
  
  /** Stereo, Professional audio sampling rate (48 kHz), 192 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait high extends AudioEncodingQuality
  
  /** Mono, CD quality sampling rate (44.1 kHz), 96 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait low extends AudioEncodingQuality
  
  /** Stereo, CD quality sampling rate (44.1 kHz), 128 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait medium extends AudioEncodingQuality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncodingQuality with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 3 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 2 */ @js.native
  object medium extends TopLevel[medium with Double]
  
}

