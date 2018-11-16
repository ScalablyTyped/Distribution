package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectXAlphaMode extends js.Object

/** Identifies the alpha value, transparency behavior, of a surface. This is a managed version of the DXGI_APLAHA_MODE enumeration. */
@JSGlobal("Windows.Graphics.DirectX.DirectXAlphaMode")
@js.native
object DirectXAlphaMode extends js.Object {
  /** Indicates to ignore the transparency behavior. */
  @js.native
  sealed trait ignore
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXAlphaMode
  
  /** Indicates that the transparency behavior is premultiplied. Each color is first scaled by the alpha value. The alpha value itself is the same in both straight and premultiplied alpha. Typically, no color channel value is greater than the alpha channel value. If a color channel value in a premultiplied format is greater than the alpha channel, the standard source-over blending math results in an additive blend. */
  @js.native
  sealed trait premultiplied
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXAlphaMode
  
  /** Indicates that the transparency behavior is not premultiplied. The alpha channel indicates the transparency of the color. */
  @js.native
  sealed trait straight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXAlphaMode
  
  /** Indicates that the transparency behavior is not specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXAlphaMode
  
  val ignore: ignore with java.lang.String = js.native
  val premultiplied: premultiplied with java.lang.String = js.native
  val straight: straight with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXAlphaMode with java.lang.String
  ] = js.native
}

