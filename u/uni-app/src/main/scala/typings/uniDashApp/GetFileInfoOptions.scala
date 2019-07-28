package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileInfoOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 计算文件摘要的算法，默认值 md5，有效值：md5，sha1
    */
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 本地路径
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetFileInfoSuccess, Unit]] = js.undefined
}

object GetFileInfoOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    digestAlgorithm: String = null,
    fail: () => Unit = null,
    filePath: String = null,
    success: /* result */ GetFileInfoSuccess => Unit = null
  ): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetFileInfoOptions]
  }
}

