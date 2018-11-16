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
  
  val auto: auto with java.lang.String = js.native
  val hD1080p: hD1080p with java.lang.String = js.native
  val hD720p: hD720p with java.lang.String = js.native
  val ntsc: ntsc with java.lang.String = js.native
  val pal: pal with java.lang.String = js.native
  val qvga: qvga with java.lang.String = js.native
  val vga: vga with java.lang.String = js.native
  val wvga: wvga with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality with java.lang.String
  ] = js.native
}

