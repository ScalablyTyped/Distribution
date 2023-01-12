package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductsListData extends StObject {
  
  var apiResult: String
}
object ProductsListData {
  
  inline def apply(apiResult: String): ProductsListData = {
    val __obj = js.Dynamic.literal(apiResult = apiResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductsListData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductsListData] (val x: Self) extends AnyVal {
    
    inline def setApiResult(value: String): Self = StObject.set(x, "apiResult", value.asInstanceOf[js.Any])
  }
}
