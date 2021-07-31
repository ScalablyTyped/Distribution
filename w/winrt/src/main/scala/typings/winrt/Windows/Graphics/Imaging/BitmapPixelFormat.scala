package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapPixelFormat extends StObject
@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends StObject {
  
  @js.native
  sealed trait bgra8
    extends StObject
       with BitmapPixelFormat
  
  @js.native
  sealed trait rgba16
    extends StObject
       with BitmapPixelFormat
  
  @js.native
  sealed trait rgba8
    extends StObject
       with BitmapPixelFormat
  
  @js.native
  sealed trait unknown
    extends StObject
       with BitmapPixelFormat
}
