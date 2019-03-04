package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 云开发
// 文档：https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/getting-started.html
trait Cloud extends js.Object {
  /**
  		 * 接受一个 name 参数，指定需引用的集合名称
  		 */
  def collection(name: java.lang.String): js.Object
  /**
  		 * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
  		 */
  def database(options: weixinDashAppLib.Anon_Env): js.Object
  /**
  		 * 初始化方法（全局只需一次）
  		 */
  def init(options: InitCloudOptions): scala.Unit
}

object Cloud {
  @scala.inline
  def apply(
    collection: js.Function1[java.lang.String, js.Object],
    database: js.Function1[weixinDashAppLib.Anon_Env, js.Object],
    init: js.Function1[InitCloudOptions, scala.Unit]
  ): Cloud = {
    val __obj = js.Dynamic.literal(collection = collection, database = database, init = init)
  
    __obj.asInstanceOf[Cloud]
  }
}

