package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoEncodingQuality with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 1 */ @js.native
  object hd1080p extends TopLevel[hd1080p with Double]
  
  /* 2 */ @js.native
  object hd720p extends TopLevel[hd720p with Double]
  
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

