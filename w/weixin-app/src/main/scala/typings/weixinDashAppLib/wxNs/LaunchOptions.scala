package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region App里的onLaunch、onShow回调参数

trait LaunchOptions extends js.Object {
  /**
  		 * 打开小程序的路径
  		 */
  var path: java.lang.String
  /**
  		 * 打开小程序的query
  		 */
  var query: js.Object
  /**
  		 * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
  		 */
  var referrerInfo: weixinDashAppLib.Anon_AppId
  /**
  		 * 打开小程序的[场景值](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/app-service/scene.html)
  		 */
  var scene: scala.Double
  /**
  		 * shareTicket，详见 获取更多[转发信息](https://mp.weixin.qq.com/debug/wxadoc/dev/api/share.html#获取更多转发信息)
  		 */
  var shareTicket: java.lang.String
}

