package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SaveFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
  @JSName("success")
  var success_SaveFileOptions: js.UndefOr[js.Function1[/* res */ SavedFileData, scala.Unit]] = js.undefined
  /** 需要保存的文件的临时路径 */
  var tempFilePath: java.lang.String
}

