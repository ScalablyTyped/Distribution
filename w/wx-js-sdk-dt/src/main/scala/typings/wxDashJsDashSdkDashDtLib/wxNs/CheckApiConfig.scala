package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 判断当前客户端版本是否支持指定 JS 接口, checkJsApi 接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用 checkJsApi 来检测
  */
trait CheckApiConfig extends js.Object {
  /**
    * 需要检测的JS接口列表
    */
  var jsApiList: js.Array[java.lang.String]
  /**
    * 以键值对的形式返回，可用的 api 值 true，不可用为 false
    * 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
    */
  def success(res: wxDashJsDashSdkDashDtLib.Anon_ErrMsg): scala.Unit
}

