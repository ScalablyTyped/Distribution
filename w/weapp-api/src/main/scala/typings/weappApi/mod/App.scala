package typings.weappApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  /**
    * getCurrentPage() 函数用户获取当前页面的实例。
    */
  def getCurrentPage(): Page = js.native
}
object App {
  
  @JSImport("weapp-api", "App")
  @js.native
  val ^ : AppConstructor = js.native
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentPage(value: () => Page): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
  }
}
