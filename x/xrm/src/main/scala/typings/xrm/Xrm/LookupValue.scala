package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Lookup value.
  */
trait LookupValue extends StObject {
  
  /**
    * Type of the entity.
    */
  var entityType: String
  
  /**
    * The identifier.
    */
  var id: String
  
  /**
    * The name
    */
  var name: js.UndefOr[String] = js.undefined
}
object LookupValue {
  
  inline def apply(entityType: String, id: String): LookupValue = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupValue]
  }
  
  extension [Self <: LookupValue](x: Self) {
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
