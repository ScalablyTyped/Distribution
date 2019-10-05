package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait onLaunchOptions extends js.Object {
  /** 启动小程序的路径 */
  var path: String
  /** 启动小程序的query参数 */
  var query: js.Object
  /** 来源信息。从另一个小程序、公众号或App进入小程序时返回。范泽返回{} */
  var referrerInfo: typings.weappDashApi.weappDashApiMod.wx.referrerInfo
  /** 启动小程序的场景值 */
  var scene: Double
  var shareTicket: String
}

object onLaunchOptions {
  @scala.inline
  def apply(path: String, query: js.Object, referrerInfo: referrerInfo, scene: Double, shareTicket: String): onLaunchOptions = {
    val __obj = js.Dynamic.literal(path = path, query = query, referrerInfo = referrerInfo, scene = scene, shareTicket = shareTicket)
  
    __obj.asInstanceOf[onLaunchOptions]
  }
}

