package typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Windows Runtime projection of the DXGI_SAMPLE_DESC structure. Describes multi-sampling parameters for a IDirect3DSurface . */
trait Direct3DMultisampleDescription extends js.Object {
  /** The number of multisamples per pixel. */
  var count: Double
  /** The image quality level. The higher the quality, the lower the performance. */
  var quality: Double
}

object Direct3DMultisampleDescription {
  @scala.inline
  def apply(count: Double, quality: Double): Direct3DMultisampleDescription = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Direct3DMultisampleDescription]
  }
}

