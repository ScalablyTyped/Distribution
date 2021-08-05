package typings.weappApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  end of wx namespace
trait Page extends StObject {
  
  /**
    * setData 函数用于将数据从逻辑层发送到视图层，
    * 同时改变对应的 this.data 的值。
    * 注意：
    *    1. 直接修改 this.data 无效，无法改变页面的状态，还会造成数据不一致。
    *    2. 单次设置的数据不能超过1024kB，请尽量避免一次设置过多的数据。
    */
  def setData(data: js.Any): Unit
}
object Page {
  
  @JSImport("weapp-api", "Page")
  @js.native
  val ^ : PageConstructor = js.native
  
  extension [Self <: Page](x: Self) {
    
    inline def setSetData(value: js.Any => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
