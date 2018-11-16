package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 计算文件摘要的算法，默认值 md5，有效值：md5，sha1 */
  var digestAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /** 本地文件路径 */
  var filePath: java.lang.String
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, scala.Unit]] = js.undefined
}

