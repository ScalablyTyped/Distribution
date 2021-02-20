package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataArray extends StObject {
  
  /** 多次 postMessage 的参数组成的数组 */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var data: js.Array[_] = js.native
}
object DataArray {
  
  @scala.inline
  def apply(data: js.Array[_]): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  @scala.inline
  implicit class DataArrayMutableBuilder[Self <: DataArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
