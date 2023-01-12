package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldScale
  extends StObject
     with ScaledValueRef[Any] {
  
  var field: typings.vegaTypings.typesSpecEncodeMod.Field
  
  var scale: typings.vegaTypings.typesSpecEncodeMod.Field
}
object FieldScale {
  
  inline def apply(
    field: typings.vegaTypings.typesSpecEncodeMod.Field,
    scale: typings.vegaTypings.typesSpecEncodeMod.Field
  ): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldScale] (val x: Self) extends AnyVal {
    
    inline def setField(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typings.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
