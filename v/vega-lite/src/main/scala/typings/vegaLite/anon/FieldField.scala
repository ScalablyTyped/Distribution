package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldField extends StObject {
  
  var field: typings.vegaTypings.typesSpecEncodeMod.Field
}
object FieldField {
  
  inline def apply(field: typings.vegaTypings.typesSpecEncodeMod.Field): FieldField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldField]
  }
  
  extension [Self <: FieldField](x: Self) {
    
    inline def setField(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
