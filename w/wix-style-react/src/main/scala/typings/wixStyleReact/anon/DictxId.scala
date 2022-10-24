package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictxId
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var id: Any
  
  var label: Any
}
object DictxId {
  
  inline def apply(id: Any, label: Any): DictxId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxId]
  }
  
  extension [Self <: DictxId](x: Self) {
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
