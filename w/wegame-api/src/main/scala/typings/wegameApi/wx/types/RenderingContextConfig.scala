package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingContextConfig extends js.Object {
  /**
    * 表示是否抗锯齿
    */
  var antialias: js.UndefOr[Boolean] = js.native
  /**
    * 抗锯齿样本数。最小值为 2，最大不超过系统限制数量，仅 iOS 支持
    */
  var antialiasSamples: js.UndefOr[Double] = js.native
  /**
    * 表示是否绘图完成后是否保留绘图缓冲区
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
}

object RenderingContextConfig {
  @scala.inline
  def apply(): RenderingContextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingContextConfig]
  }
  @scala.inline
  implicit class RenderingContextConfigOps[Self <: RenderingContextConfig] (val x: Self) extends AnyVal {
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
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    @scala.inline
    def setAntialiasSamples(value: Double): Self = this.set("antialiasSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntialiasSamples: Self = this.set("antialiasSamples", js.undefined)
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
  }
  
}

