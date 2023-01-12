package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[TData] extends StObject {
  
  var data: js.UndefOr[TData] = js.undefined
}
object `0` {
  
  inline def apply[TData](): `0`[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], TData] (val x: Self & `0`[TData]) extends AnyVal {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
