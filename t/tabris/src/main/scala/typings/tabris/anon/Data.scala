package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TData] extends StObject {
  
  var data: js.UndefOr[TData] = js.undefined
}
object Data {
  
  inline def apply[TData](): Data[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data[TData]]
  }
  
  extension [Self <: Data[?], TData](x: Self & Data[TData]) {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
