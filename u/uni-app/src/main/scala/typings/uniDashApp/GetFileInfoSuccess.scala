package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoSuccess extends js.Object {
  /**
    * 按照传入的 digestAlgorithm 计算得出的的文件摘要
    */
  var digest: js.UndefOr[String] = js.undefined
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.undefined
  /**
    * 文件大小，单位：B
    */
  var size: js.UndefOr[Double] = js.undefined
}

object GetFileInfoSuccess {
  @scala.inline
  def apply(digest: String = null, errMsg: String = null, size: Int | Double = null): GetFileInfoSuccess = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoSuccess]
  }
}

