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
  
  /* 2 */ val ignore: typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.ignore with Double = js.native
  /* 0 */ val premultiplied: typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.premultiplied with Double = js.native
  /* 1 */ val straight: typings.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.straight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapAlphaMode with Double] = js.native
}

