package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Field. */
trait Field extends StObject {
  
  /** The name of the field. */
  var field_name: js.UndefOr[String] = js.undefined
  
  /** The type of the field. */
  var field_type: js.UndefOr[String] = js.undefined
}
object Field {
  
  inline def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    inline def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    inline def setField_type(value: String): Self = StObject.set(x, "field_type", value.asInstanceOf[js.Any])
    
    inline def setField_typeUndefined: Self = StObject.set(x, "field_type", js.undefined)
  }
}
