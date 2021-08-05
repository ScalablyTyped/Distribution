package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCollectionResult extends StObject {
  
  var _id: String | Double
}
object AddCollectionResult {
  
  inline def apply(_id: String | Double): AddCollectionResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCollectionResult]
  }
  
  extension [Self <: AddCollectionResult](x: Self) {
    
    inline def set_id(value: String | Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
