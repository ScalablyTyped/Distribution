package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VideoEncodingQuality extends StObject
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
@js.native
object VideoEncodingQuality extends StObject {
  
  @js.native
  sealed trait auto
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait hD1080p
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait hD720p
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait ntsc
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait pal
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait qvga
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait vga
    extends StObject
       with VideoEncodingQuality
  
  @js.native
  sealed trait wvga
    extends StObject
       with VideoEncodingQuality
}
