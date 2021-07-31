package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface GeoJSON<T> {
//     type: T;
//     coordinates: [];
// }
trait CreateCollectionSuccess extends StObject {
  
  var errMsg: String
}
object CreateCollectionSuccess {
  
  @scala.inline
  def apply(errMsg: String): CreateCollectionSuccess = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionSuccess]
  }
  
  @scala.inline
  implicit class CreateCollectionSuccessMutableBuilder[Self <: CreateCollectionSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
