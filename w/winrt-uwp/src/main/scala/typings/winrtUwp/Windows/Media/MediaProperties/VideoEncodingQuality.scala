package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoEncodingQuality extends js.Object

/** Determines the video encoding format. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
@js.native
object VideoEncodingQuality extends js.Object {
  /** Auto fills in the proper settings based on the current camera settings. So when Auto is used, settings that are manually modified are ignored. For example, if you create a preset profile using one the static create methods, such as CreateWmv , and specify Auto as the encoding quality, any changes you make to the properties will be overwritten with values based on the current camera settings. */
  @js.native
  sealed trait auto extends VideoEncodingQuality
  
  /** HD1080p format. */
  @js.native
  sealed trait hd1080p extends VideoEncodingQuality
  
  /** HD720p format. */
  @js.native
  sealed trait hd720p extends VideoEncodingQuality
  
  /** Ntsc format. */
  @js.native
  sealed trait ntsc extends VideoEncodingQuality
  
  /** Pal format. */
  @js.native
  sealed trait pal extends VideoEncodingQuality
  
  /** Qvga format. */
  @js.native
  sealed trait qvga extends VideoEncodingQuality
  
  /** Vga format. */
  @js.native
  sealed trait vga extends VideoEncodingQuality
  
  /** Wvga format. */
  @js.native
  sealed trait wvga extends VideoEncodingQuality
  
}

