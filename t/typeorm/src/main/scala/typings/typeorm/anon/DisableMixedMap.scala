package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableMixedMap extends StObject {
  
  var disableMixedMap: js.UndefOr[Boolean] = js.undefined
  
  var relations: js.UndefOr[js.Array[String]] = js.undefined
}
object DisableMixedMap {
  
  inline def apply(): DisableMixedMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableMixedMap]
  }
  
  extension [Self <: DisableMixedMap](x: Self) {
    
    inline def setDisableMixedMap(value: Boolean): Self = StObject.set(x, "disableMixedMap", value.asInstanceOf[js.Any])
    
    inline def setDisableMixedMapUndefined: Self = StObject.set(x, "disableMixedMap", js.undefined)
    
    inline def setRelations(value: js.Array[String]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setRelationsVarargs(value: String*): Self = StObject.set(x, "relations", js.Array(value :_*))
  }
}
