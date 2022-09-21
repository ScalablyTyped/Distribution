package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
trait ConditionalType extends StObject {
  
  var checkType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var extendsType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var falseType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var trueType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "conditional" */ String]
}
object ConditionalType {
  
  inline def apply(
    checkType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    extendsType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    falseType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    trueType: ToSerialized[typings.typedoc.modelsTypesMod.SomeType],
    `type`: ToSerialized[/* "conditional" */ String]
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
  
  extension [Self <: ConditionalType](x: Self) {
    
    inline def setCheckType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setCheckTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "checkType", js.Array(value*))
    
    inline def setExtendsType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setExtendsTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "extendsType", js.Array(value*))
    
    inline def setFalseType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setFalseTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "falseType", js.Array(value*))
    
    inline def setTrueType(value: ToSerialized[typings.typedoc.modelsTypesMod.SomeType]): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setTrueTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "trueType", js.Array(value*))
    
    inline def setType(value: ToSerialized[/* "conditional" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
