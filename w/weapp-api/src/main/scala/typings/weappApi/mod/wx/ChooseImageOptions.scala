package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseImageOptions extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  
  /** 最多可以选择的图片张数，默认9 */
  var count: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  
  /** original 原图，compressed 压缩图，默认二者都有 */
  var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.native
  
  /** album 从相册选图，camera 使用相机，默认二者都有 */
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.native
  
  /** 成功则返回图片的本地文件路径列表 tempFilePaths */
  def success(res: TempFilesData): Unit = js.native
}
object ChooseImageOptions {
  
  @scala.inline
  def apply(success: TempFilesData => Unit): ChooseImageOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseImageOptions]
  }
  
  @scala.inline
  implicit class ChooseImageOptionsOps[Self <: ChooseImageOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: TempFilesData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: ImageSizeType*): Self = this.set("sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSizeType(value: js.Array[ImageSizeType]): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: ImageSourceType*): Self = this.set("sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: js.Array[ImageSourceType]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
  }
}
