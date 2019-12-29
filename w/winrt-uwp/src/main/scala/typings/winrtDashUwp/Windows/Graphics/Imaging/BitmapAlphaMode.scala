package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapAlphaMode extends js.Object

/** Specifies the alpha mode of pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
@js.native
object BitmapAlphaMode extends js.Object {
  /** The alpha value is ignored. */
  @js.native
  sealed trait ignore extends BitmapAlphaMode
  
  /** The alpha value has been premultiplied. Each color is first scaled by the alpha value. */
  @js.native
  sealed trait premultiplied extends BitmapAlphaMode
  
  /** The alpha value has not been premultiplied. The alpha channel indicates the transparency of the color. */
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

