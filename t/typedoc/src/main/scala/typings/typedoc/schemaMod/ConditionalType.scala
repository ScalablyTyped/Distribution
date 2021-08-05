package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait ConditionalType
  extends StObject
     with SomeType {
  
  var checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  
  var extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  
  var falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  
  var trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
  
  var `type`: ModelToObject[String] | String
}
object ConditionalType {
  
  inline def apply(
    checkType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    extendsType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    falseType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    trueType: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type,
    `type`: ModelToObject[String] | String
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
  
  extension [Self <: ConditionalType](x: Self) {
    
    inline def setCheckType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setCheckTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "checkType", js.Array(value :_*))
    
    inline def setExtendsType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setExtendsTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "extendsType", js.Array(value :_*))
    
    inline def setFalseType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setFalseTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "falseType", js.Array(value :_*))
    
    inline def setTrueType(
      value: ModelToObject[typings.typedoc.typesAbstractMod.Type] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setTrueTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "trueType", js.Array(value :_*))
    
    inline def setType(value: ModelToObject[String] | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
