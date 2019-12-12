package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.auto
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD1080p
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD720p
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.pal
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.qvga
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.vga
import typings.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.wvga
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoEncodingQuality with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 1 */ @js.native
  object hD1080p extends TopLevel[hD1080p with Double]
  
  /* 2 */ @js.native
  object hD720p extends TopLevel[hD720p with Double]
  
  /* 4 */ @js.native
  object ntsc extends TopLevel[ntsc with Double]
  
  /* 5 */ @js.native
  object pal extends TopLevel[pal with Double]
  
  /* 7 */ @js.native
  object qvga extends TopLevel[qvga with Double]
  
  /* 6 */ @js.native
  object vga extends TopLevel[vga with Double]
  
  /* 3 */ @js.native
  object wvga extends TopLevel[wvga with Double]
  
}

