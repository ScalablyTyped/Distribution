package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoEncodingQuality extends js.Object

@JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
@js.native
object VideoEncodingQuality extends js.Object {
  @js.native
  sealed trait auto
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait hD1080p
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait hD720p
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait ntsc
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait pal
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait qvga
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait vga
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  @js.native
  sealed trait wvga
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 1 */ val hD1080p: hD1080p with scala.Double = js.native
  /* 2 */ val hD720p: hD720p with scala.Double = js.native
  /* 4 */ val ntsc: ntsc with scala.Double = js.native
  /* 5 */ val pal: pal with scala.Double = js.native
  /* 7 */ val qvga: qvga with scala.Double = js.native
  /* 6 */ val vga: vga with scala.Double = js.native
  /* 3 */ val wvga: wvga with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality with scala.Double
  ] = js.native
}

