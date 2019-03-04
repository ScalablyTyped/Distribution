package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.DirectXNs.Direct3D11Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Windows Runtime projection of the DXGI_SAMPLE_DESC structure. Describes multi-sampling parameters for a IDirect3DSurface . */
trait Direct3DMultisampleDescription extends js.Object {
  /** The number of multisamples per pixel. */
  var count: scala.Double
  /** The image quality level. The higher the quality, the lower the performance. */
  var quality: scala.Double
}

object Direct3DMultisampleDescription {
  @scala.inline
  def apply(count: scala.Double, quality: scala.Double): Direct3DMultisampleDescription = {
    val __obj = js.Dynamic.literal(count = count, quality = quality)
  
    __obj.asInstanceOf[Direct3DMultisampleDescription]
  }
}

