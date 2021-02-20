package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataKey extends StObject {
  
  var data: String | js.Object = js.native
  
  var key: String = js.native
}
object DataKey {
  
  @scala.inline
  def apply(data: String | js.Object, key: String): DataKey = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
  
  @scala.inline
  implicit class DataKeyMutableBuilder[Self <: DataKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
