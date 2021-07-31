package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldScale
  extends StObject
     with ScaledValueRef[js.Any] {
  
  var field: typings.vegaTypings.encodeMod.Field
  
  var scale: typings.vegaTypings.encodeMod.Field
}
object FieldScale {
  
  @scala.inline
  def apply(field: typings.vegaTypings.encodeMod.Field, scale: typings.vegaTypings.encodeMod.Field): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
  
  @scala.inline
  implicit class FieldScaleMutableBuilder[Self <: FieldScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
