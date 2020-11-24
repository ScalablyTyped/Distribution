package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapPixelFormat extends js.Object
@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends js.Object {
  
  @js.native
  sealed trait bgra8 extends BitmapPixelFormat
  
  @js.native
  sealed trait rgba16 extends BitmapPixelFormat
  
  @js.native
  sealed trait rgba8 extends BitmapPixelFormat
  
  @js.native
  sealed trait unknown extends BitmapPixelFormat
}
