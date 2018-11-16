package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

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
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  /** Stereo, Professional audio sampling rate (48 kHz), 192 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  /** Mono, CD quality sampling rate (44.1 kHz), 96 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  /** Stereo, CD quality sampling rate (44.1 kHz), 128 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait medium
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  val auto: auto with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val medium: medium with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality with java.lang.String
  ] = js.native
}

