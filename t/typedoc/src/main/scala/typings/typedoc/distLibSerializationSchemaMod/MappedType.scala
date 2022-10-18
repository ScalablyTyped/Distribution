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
    nameType: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]],
    optionalModifier: ToSerialized[js.UndefOr[`-_` | Plussign]],
    parameter: ToSerialized[String],
    parameterType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    readonlyModifier: ToSerialized[js.UndefOr[`-_` | Plussign]],
    templateType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "mapped" */ String]
  ): MappedType = {
    val __obj = js.Dynamic.literal(nameType = nameType.asInstanceOf[js.Any], optionalModifier = optionalModifier.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameterType = parameterType.asInstanceOf[js.Any], readonlyModifier = readonlyModifier.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedType]
  }
  
  extension [Self <: MappedType](x: Self) {
    
    inline def setNameType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    inline def setOptionalModifier(value: ToSerialized[js.UndefOr[`-_` | Plussign]]): Self = StObject.set(x, "optionalModifier", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: ToSerialized[String]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    inline def setReadonlyModifier(value: ToSerialized[js.UndefOr[`-_` | Plussign]]): Self = StObject.set(x, "readonlyModifier", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "mapped" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
