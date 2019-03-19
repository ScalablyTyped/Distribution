package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /**
    * 按照传入的 digestAlgorithm 计算得出的的文件摘要
    */
  var digest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 文件大小，单位：B
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(
    digest: java.lang.String = null,
    errMsg: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest)
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

