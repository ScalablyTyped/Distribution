package typings.winrtUwp.Windows.Graphics.DirectX.Direct3D11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Windows Runtime projection of the DXGI_SAMPLE_DESC structure. Describes multi-sampling parameters for a IDirect3DSurface . */
@js.native
trait Direct3DMultisampleDescription extends js.Object {
  /** The number of multisamples per pixel. */
  var count: Double = js.native
  /** The image quality level. The higher the quality, the lower the performance. */
  var quality: Double = js.native
}

object Direct3DMultisampleDescription {
  @scala.inline
  def apply(count: Double, quality: Double): Direct3DMultisampleDescription = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direct3DMultisampleDescription]
  }
  @scala.inline
  implicit class Direct3DMultisampleDescriptionOps[Self <: Direct3DMultisampleDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
  
}

