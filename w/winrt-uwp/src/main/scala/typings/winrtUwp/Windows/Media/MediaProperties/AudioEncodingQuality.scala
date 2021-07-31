package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncodingQuality extends StObject
/** Describes the level of quality of the audio encoding. The higher the quality, the better the audio fidelity, and the larger the resulting file. */
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends StObject {
  
  /** Auto fills in the proper settings based on the current camera settings. So when Auto is used, settings that are manually modified are ignored. For example, if you create a preset profile using one the static create methods, such as CreateM4a , and specify Auto as the encoding quality, any changes you make to the properties will be overwritten with values based on the current camera settings. */
  @js.native
  sealed trait auto
    extends StObject
       with AudioEncodingQuality
  
  /** Stereo, Professional audio sampling rate (48 kHz), 192 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait high
    extends StObject
       with AudioEncodingQuality
  
  /** Mono, CD quality sampling rate (44.1 kHz), 96 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait low
    extends StObject
       with AudioEncodingQuality
  
  /** Stereo, CD quality sampling rate (44.1 kHz), 128 kilobits per second (kbps) data transfer rate. */
  @js.native
  sealed trait medium
    extends StObject
       with AudioEncodingQuality
}
