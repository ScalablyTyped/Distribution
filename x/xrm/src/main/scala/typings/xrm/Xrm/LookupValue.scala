package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Lookup value.
  */
@js.native
trait LookupValue extends StObject {
  
  /**
    * Type of the entity.
    */
  var entityType: String = js.native
  
  /**
    * The identifier.
    */
  var id: String = js.native
  
  /**
    * The name
    */
  var name: js.UndefOr[String] = js.native
}
object LookupValue {
  
  @scala.inline
  def apply(entityType: String, id: String): LookupValue = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupValue]
  }
  
  @scala.inline
  implicit class LookupValueMutableBuilder[Self <: LookupValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
