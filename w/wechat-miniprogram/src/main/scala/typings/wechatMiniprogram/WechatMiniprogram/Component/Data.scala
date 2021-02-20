package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[D /* <: DataOption */] extends StObject {
  
  /** 组件的内部数据，和 `properties` 一同用于组件的模板渲染 */
  var data: js.UndefOr[D] = js.native
}
object Data {
  
  @scala.inline
  def apply[D /* <: DataOption */](): Data[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data[D]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[_], D /* <: DataOption */] (val x: Self with Data[D]) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
