package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray extends StObject {
  
  /** 多次 postMessage 的参数组成的数组 */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var data: js.Array[js.Any]
}
object DataArray {
  
  inline def apply(data: js.Array[js.Any]): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  extension [Self <: DataArray](x: Self) {
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
