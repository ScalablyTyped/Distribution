package typings.typedoc.schemaMod

import typings.typedoc.kindMod.ReflectionKind
import typings.typedoc.typeParameterMod.VarianceModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TypeParameterReflection, 'type' | 'default' | 'varianceModifier'> */
trait TypeParameterReflection
  extends StObject
     with __ModelToObject[Any] {
  
  var default: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]
  
  var comment: ToSerialized[js.UndefOr[typings.typedoc.commentMod.Comment]]
  
  var flags: ReflectionFlags
  
  var id: ToSerialized[Double]
  
  var kind: ToSerialized[ReflectionKind]
  
  var kindString: ToSerialized[js.UndefOr[String]]
  
  var name: ToSerialized[String]
  
  /** Will not be present if name === originalName */
  var originalName: js.UndefOr[String] = js.undefined
  
  var `type`: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]
  
  var varianceModifier: ToSerialized[js.UndefOr[VarianceModifier]]
}
object TypeParameterReflection {
  
  inline def apply(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): TypeParameterReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameterReflection]
  }
  
  extension [Self <: TypeParameterReflection](x: Self) {
    
    inline def setComment(value: ToSerialized[js.UndefOr[typings.typedoc.commentMod.Comment]]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCommentVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "comment", js.Array(value*))
    
    inline def setDefault(value: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    inline def setKindStringVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "kindString", js.Array(value*))
    
    inline def setKindVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "kind", js.Array(value*))
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setType(value: ToSerialized[js.UndefOr[typings.typedoc.modelsTypesMod.SomeType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setVarianceModifier(value: ToSerialized[js.UndefOr[VarianceModifier]]): Self = StObject.set(x, "varianceModifier", value.asInstanceOf[js.Any])
    
    inline def setVarianceModifierUndefined: Self = StObject.set(x, "varianceModifier", js.undefined)
    
    inline def setVarianceModifierVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "varianceModifier", js.Array(value*))
  }
}
