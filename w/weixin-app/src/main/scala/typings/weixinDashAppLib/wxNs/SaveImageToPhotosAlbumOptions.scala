package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveImageToPhotosAlbumOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var filePath: java.lang.String
  @JSName("success")
  def success_MSaveImageToPhotosAlbumOptions(res: weixinDashAppLib.Anon_ErrMsg): scala.Unit
}

object SaveImageToPhotosAlbumOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    success: js.Function1[weixinDashAppLib.Anon_ErrMsg, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): SaveImageToPhotosAlbumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filePath")(filePath)
    __obj.updateDynamic("success")(success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[SaveImageToPhotosAlbumOptions]
  }
}

