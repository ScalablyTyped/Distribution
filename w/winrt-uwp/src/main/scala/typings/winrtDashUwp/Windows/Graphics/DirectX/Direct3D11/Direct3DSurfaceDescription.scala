package typings.winrtDashUwp.Windows.Graphics.DirectX.Direct3D11

import typings.winrtDashUwp.Windows.Graphics.DirectX.DirectXPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Windows Runtime projection of the DXGI_SURFACE_DESC structure. Describes a IDirect3DSurface . */
trait Direct3DSurfaceDescription extends js.Object {
  /** Pixel format of the surface. */
  var format: DirectXPixelFormat
  /** Height of the surface. */
  var height: Double
  /** Multi-sampling parameters for the surface. */
  var multisampleDescription: Direct3DMultisampleDescription
  /** Width of the surface. */
  var width: Double
}

object Direct3DSurfaceDescription {
  @scala.inline
  def apply(
    format: DirectXPixelFormat,
    height: Double,
    multisampleDescription: Direct3DMultisampleDescription,
    width: Double
  ): Direct3DSurfaceDescription = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], multisampleDescription = multisampleDescription.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Direct3DSurfaceDescription]
  }
}

