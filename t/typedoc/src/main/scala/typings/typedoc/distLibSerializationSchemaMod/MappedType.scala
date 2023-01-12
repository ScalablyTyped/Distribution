package typings.typedoc.distLibSerializationSchemaMod

import typings.typedoc.typedocStrings.Plussign
import typings.typedoc.typedocStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.MappedType, 'type' | 'parameter' | 'parameterType' | 'templateType' | 'readonlyModifier' | 'optionalModifier' | 'nameType'> */
trait MappedType extends StObject {
  
  var nameType: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]
  
  var optionalModifier: ToSerialized[js.UndefOr[`-_` | Plussign]]
  
  var parameter: ToSerialized[String]
  
  var parameterType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var readonlyModifier: ToSerialized[js.UndefOr[`-_` | Plussign]]
  
  var templateType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "mapped" */ String]
}
object MappedType {
  
  inline def apply(
    parameter: ToSerialized[String],
    parameterType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    templateType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "mapped" */ String]
  ): MappedType = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], parameterType = parameterType.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MappedType] (val x: Self) extends AnyVal {
    
    inline def setNameType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    inline def setNameTypeUndefined: Self = StObject.set(x, "nameType", js.undefined)
    
    inline def setOptionalModifier(value: ToSerialized[js.UndefOr[`-_` | Plussign]]): Self = StObject.set(x, "optionalModifier", value.asInstanceOf[js.Any])
    
    inline def setOptionalModifierUndefined: Self = StObject.set(x, "optionalModifier", js.undefined)
    
    inline def setParameter(value: ToSerialized[String]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    inline def setReadonlyModifier(value: ToSerialized[js.UndefOr[`-_` | Plussign]]): Self = StObject.set(x, "readonlyModifier", value.asInstanceOf[js.Any])
    
    inline def setReadonlyModifierUndefined: Self = StObject.set(x, "readonlyModifier", js.undefined)
    
    inline def setTemplateType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "mapped" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
