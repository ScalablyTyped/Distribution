package typings.typedoc.distLibSerializationSchemaMod

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsTypeParameterMod.VarianceModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeParameterReflection, 'type' | 'default' | 'varianceModifier'> */
trait TypeParameterReflection extends StObject {
  
  var default: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]
  
  var comment: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]
  
  var flags: ReflectionFlags
  
  var id: ToSerialized[Double]
  
  var kind: ToSerialized[ReflectionKind]
  
  var kindString: ToSerialized[js.UndefOr[String]]
  
  var name: ToSerialized[String]
  
  /** Will not be present if name === originalName */
  var originalName: js.UndefOr[String] = js.undefined
  
  var `type`: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]
  
  var varianceModifier: ToSerialized[js.UndefOr[VarianceModifier]]
}
object TypeParameterReflection {
  
  inline def apply(
    comment: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]],
    default: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]],
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    kindString: ToSerialized[js.UndefOr[String]],
    name: ToSerialized[String],
    `type`: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]],
    varianceModifier: ToSerialized[js.UndefOr[VarianceModifier]]
  ): TypeParameterReflection = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], varianceModifier = varianceModifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterReflection]
  }
  
  extension [Self <: TypeParameterReflection](x: Self) {
    
    inline def setComment(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVarianceModifier(value: ToSerialized[js.UndefOr[VarianceModifier]]): Self = StObject.set(x, "varianceModifier", value.asInstanceOf[js.Any])
  }
}
