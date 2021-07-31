package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCollectionResult extends StObject {
  
  var _id: String | Double
}
object AddCollectionResult {
  
  @scala.inline
  def apply(_id: String | Double): AddCollectionResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCollectionResult]
  }
  
  @scala.inline
  implicit class AddCollectionResultMutableBuilder[Self <: AddCollectionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: String | Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
