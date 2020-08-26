package typings.weappApi.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  /**
    * getCurrentPage() 函数用户获取当前页面的实例。
    */
  def getCurrentPage(): Page = js.native
}

@JSImport("weapp-api", "App")
@js.native
object App extends TopLevel[AppConstructor]

