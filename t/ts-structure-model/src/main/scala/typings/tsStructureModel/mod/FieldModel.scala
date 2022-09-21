package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldModel extends StObject {
  
  var annotations: js.Array[Annotation]
  
  var name: String
  
  var optional: Boolean
  
  var `type`: TypeModel
  
  var valueConstraint: Constraint
}
object FieldModel {
  
  inline def apply(
    annotations: js.Array[Annotation],
    name: String,
    optional: Boolean,
    `type`: TypeModel,
    valueConstraint: Constraint
  ): FieldModel = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], valueConstraint = valueConstraint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldModel]
  }
  
  extension [Self <: FieldModel](x: Self) {
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeModel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueConstraint(value: Constraint): Self = StObject.set(x, "valueConstraint", value.asInstanceOf[js.Any])
  }
}
