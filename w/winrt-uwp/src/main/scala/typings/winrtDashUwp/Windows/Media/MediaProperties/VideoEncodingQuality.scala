package typings.winrtDashUwp.Windows.Media.MediaProperties

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
  
  /* 0 */ val auto: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.auto with Double = js.native
  /* 1 */ val hd1080p: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.hd1080p with Double = js.native
  /* 2 */ val hd720p: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.hd720p with Double = js.native
  /* 4 */ val ntsc: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc with Double = js.native
  /* 5 */ val pal: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.pal with Double = js.native
  /* 7 */ val qvga: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.qvga with Double = js.native
  /* 6 */ val vga: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.vga with Double = js.native
  /* 3 */ val wvga: typings.winrtDashUwp.Windows.Media.MediaProperties.VideoEncodingQuality.wvga with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoEncodingQuality with Double] = js.native
}

