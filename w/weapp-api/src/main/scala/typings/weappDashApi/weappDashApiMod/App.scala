package typings.weappDashApi.weappDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  /**
    * getCurrentPage() 函数用户获取当前页面的实例。
    */
  def getCurrentPage(): Page
}

object App {
  @scala.inline
  def apply(getCurrentPage: () => Page): App = {
    val __obj = js.Dynamic.literal(getCurrentPage = js.Any.fromFunction0(getCurrentPage))
  
    __obj.asInstanceOf[App]
  }
}

