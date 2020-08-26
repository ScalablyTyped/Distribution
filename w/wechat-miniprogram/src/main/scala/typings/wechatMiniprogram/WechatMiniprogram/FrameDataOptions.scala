package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 视频帧数据，若取不到则返回 null。当缓存区满的时候可能暂停取不到数据。 */
@js.native
trait FrameDataOptions extends js.Object {
  /** 帧数据 */
  var data: ArrayBuffer = js.native
  /** 帧数据高度 */
  var height: Double = js.native
  /** 帧原始 dts */
  var pkDts: Double = js.native
  /** 帧原始 pts */
  var pkPts: Double = js.native
  /** 帧数据宽度 */
  var width: Double = js.native
}

object FrameDataOptions {
  @scala.inline
  def apply(data: ArrayBuffer, height: Double, pkDts: Double, pkPts: Double, width: Double): FrameDataOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pkDts = pkDts.asInstanceOf[js.Any], pkPts = pkPts.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameDataOptions]
  }
  @scala.inline
  implicit class FrameDataOptionsOps[Self <: FrameDataOptions] (val x: Self) extends AnyVal {
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPkDts(value: Double): Self = this.set("pkDts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPkPts(value: Double): Self = this.set("pkPts", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

