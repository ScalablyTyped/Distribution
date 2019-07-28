package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToMiniProgramOptions extends js.Object {
  /**
    * 要打开的uni-app appId
    */
  var appId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要打开的uni-app版本
    */
  var envVersion: js.UndefOr[String] = js.undefined
  /**
    * 需要传递给目标uni-app的数据
    */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 打开的页面路径，如果为空则打开首页
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(
    appId: String = null,
    complete: () => Unit = null,
    envVersion: String = null,
    extraData: js.Any = null,
    fail: () => Unit = null,
    path: String = null,
    success: () => Unit = null
  ): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion)
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
}

