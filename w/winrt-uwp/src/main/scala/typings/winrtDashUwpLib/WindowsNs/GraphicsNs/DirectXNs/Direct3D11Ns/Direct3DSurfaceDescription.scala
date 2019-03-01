package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Windows Runtime projection of the DXGI_SURFACE_DESC structure. Describes a IDirect3DSurface . */
trait Direct3DSurfaceDescription extends js.Object {
  /** Pixel format of the surface. */
  var format: winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXPixelFormat
  /** Height of the surface. */
  var height: scala.Double
  /** Multi-sampling parameters for the surface. */
  var multisampleDescription: Direct3DMultisampleDescription
  /** Width of the surface. */
  var width: scala.Double
}

object Direct3DSurfaceDescription {
  @scala.inline
  def apply(
    format: winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.DirectXPixelFormat,
    height: scala.Double,
    multisampleDescription: Direct3DMultisampleDescription,
    width: scala.Double
  ): Direct3DSurfaceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("multisampleDescription")(multisampleDescription)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Direct3DSurfaceDescription]
  }
}

