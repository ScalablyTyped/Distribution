package typings.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapAlphaMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
@js.native
object BitmapAlphaMode extends js.Object {
  @js.native
  sealed trait ignore extends BitmapAlphaMode
  
  @js.native
  sealed trait premultiplied extends BitmapAlphaMode
  
  @js.native
  sealed trait straight extends BitmapAlphaMode
  
}

