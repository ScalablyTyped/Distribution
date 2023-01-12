package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
trait ConditionalType extends StObject {
  
  var checkType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var extendsType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var falseType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var trueType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "conditional" */ String]
}
object ConditionalType {
  
  inline def apply(
    checkType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    extendsType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    falseType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    trueType: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "conditional" */ String]
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalType] (val x: Self) extends AnyVal {
    
    inline def setCheckType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setExtendsType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setTrueType(value: ToSerialized[typings.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "conditional" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
