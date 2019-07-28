package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoEncodingQuality extends js.Object

@JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
@js.native
object VideoEncodingQuality extends js.Object {
  @js.native
  sealed trait auto extends VideoEncodingQuality
  
  @js.native
  sealed trait hD1080p extends VideoEncodingQuality
  
  @js.native
  sealed trait hD720p extends VideoEncodingQuality
  
  @js.native
  sealed trait ntsc extends VideoEncodingQuality
  
  @js.native
  sealed trait pal extends VideoEncodingQuality
  
  @js.native
  sealed trait qvga extends VideoEncodingQuality
  
  @js.native
  sealed trait vga extends VideoEncodingQuality
  
  @js.native
  sealed trait wvga extends VideoEncodingQuality
  
  /* 0 */ val auto: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.auto with Double = js.native
  /* 1 */ val hD1080p: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.hD1080p with Double = js.native
  /* 2 */ val hD720p: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.hD720p with Double = js.native
  /* 4 */ val ntsc: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.ntsc with Double = js.native
  /* 5 */ val pal: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.pal with Double = js.native
  /* 7 */ val qvga: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.qvga with Double = js.native
  /* 6 */ val vga: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.vga with Double = js.native
  /* 3 */ val wvga: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality.wvga with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoEncodingQuality with Double] = js.native
}

