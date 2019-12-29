package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapAlphaMode with Double] = js.native
  /* 2 */ @js.native
  object ignore extends TopLevel[ignore with Double]
  
  /* 0 */ @js.native
  object premultiplied extends TopLevel[premultiplied with Double]
  
  /* 1 */ @js.native
  object straight extends TopLevel[straight with Double]
  
}

