package typings
package uniDashAppLib.AppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageNotFoundOption extends js.Object {
  /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
  var isEntryPage: scala.Boolean
  /** 不存在页面的路径 */
  var path: java.lang.String
  /** 打开不存在页面的 query */
  var query: uniDashAppLib.AnyObject
}

object PageNotFoundOption {
  @scala.inline
  def apply(isEntryPage: scala.Boolean, path: java.lang.String, query: uniDashAppLib.AnyObject): PageNotFoundOption = {
    val __obj = js.Dynamic.literal(isEntryPage = isEntryPage, path = path, query = query)
  
    __obj.asInstanceOf[PageNotFoundOption]
  }
}

