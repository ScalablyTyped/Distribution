package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
