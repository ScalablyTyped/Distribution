package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageSuccessCallbackResultFile extends js.Object {
  /**
    * 本地文件路径
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 本地文件大小，单位：B
    */
  var size: js.UndefOr[Double] = js.undefined
}

object ChooseImageSuccessCallbackResultFile {
  @scala.inline
  def apply(path: String = null, size: js.UndefOr[Double] = js.undefined): ChooseImageSuccessCallbackResultFile = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageSuccessCallbackResultFile]
  }
}

