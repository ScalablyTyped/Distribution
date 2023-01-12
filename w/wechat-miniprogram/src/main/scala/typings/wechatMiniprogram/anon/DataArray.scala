package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray extends StObject {
  
  /** 多次 postMessage 的参数组成的数组 */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var data: js.Array[Any]
}
object DataArray {
  
  inline def apply(data: js.Array[Any]): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataArray] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
