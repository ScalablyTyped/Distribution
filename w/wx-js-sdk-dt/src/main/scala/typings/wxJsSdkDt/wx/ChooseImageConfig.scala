package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.LocalIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageConfig extends js.Object {
  /**
    * 照片数，默认9
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * 可以指定是原图还是压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  /**
    * 可以指定来源是相册还是相机，默认二者都有
    */
  var sourceType: js.UndefOr[js.Array[String]] = js.native
  /**
    * 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
    */
  def success(res: LocalIds): Unit = js.native
}

object ChooseImageConfig {
  @scala.inline
  def apply(success: LocalIds => Unit): ChooseImageConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageConfig]
  }
  @scala.inline
  implicit class ChooseImageConfigOps[Self <: ChooseImageConfig] (val x: Self) extends AnyVal {
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
    def setSuccess(value: LocalIds => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = this.set("sizeType", js.Array(value :_*))
    @scala.inline
    def setSizeType(value: js.Array[String]): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setSourceTypeVarargs(value: String*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: js.Array[String]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
  
}

