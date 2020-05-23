package typings.weixinApp.wx

import typings.weixinApp.anon.ErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveImageToPhotosAlbumOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
    */
  var filePath: String
  @JSName("success")
  def success_MSaveImageToPhotosAlbumOptions(res: ErrMsg): Unit
}

object SaveImageToPhotosAlbumOptions {
  @scala.inline
  def apply(
    filePath: String,
    success: ErrMsg => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
}

