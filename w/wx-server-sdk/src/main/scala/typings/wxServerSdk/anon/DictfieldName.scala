package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictfieldName
  extends StObject
     with /* fieldName */ StringDictionary[js.Any] {
  
  var _id: js.Any
}
object DictfieldName {
  
  inline def apply(_id: js.Any): DictfieldName = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictfieldName]
  }
  
  extension [Self <: DictfieldName](x: Self) {
    
    inline def set_id(value: js.Any): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
