package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseImageSuccessCallbackResultFile extends js.Object {
  /**
    * 本地文件路径
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 本地文件大小，单位：B
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object ChooseImageSuccessCallbackResultFile {
  @scala.inline
  def apply(path: java.lang.String = null, size: scala.Int | scala.Double = null): ChooseImageSuccessCallbackResultFile = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseImageSuccessCallbackResultFile]
  }
}

