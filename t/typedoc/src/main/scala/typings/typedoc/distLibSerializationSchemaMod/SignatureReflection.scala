package typings.typedoc.distLibSerializationSchemaMod

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SignatureReflection, 'parameters' | 'type' | 'overwrites' | 'inheritedFrom' | 'implementationOf'> */
trait SignatureReflection extends StObject {
  
  var comment: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]
  
  var flags: ReflectionFlags
  
  var id: ToSerialized[Double]
  
  var implementationOf: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]
  
  var inheritedFrom: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]
  
  var kind: ToSerialized[ReflectionKind]
  
  var kindString: ToSerialized[js.UndefOr[String]]
  
  var name: ToSerialized[String]
  
  /** Will not be present if name === originalName */
  var originalName: js.UndefOr[String] = js.undefined
  
  var overwrites: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]
  
  var parameters: ToSerialized[
    js.UndefOr[
      js.Array[typings.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection]
    ]
  ]
  
  var `type`: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]
  
  var typeParameter: js.UndefOr[
    ModelToObject[
      js.UndefOr[
        js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
      ]
    ]
  ] = js.undefined
}
object SignatureReflection {
  
  inline def apply(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): SignatureReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureReflection]
  }
  
  extension [Self <: SignatureReflection](x: Self) {
    
    inline def setComment(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplementationOf(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "implementationOf", value.asInstanceOf[js.Any])
    
    inline def setImplementationOfUndefined: Self = StObject.set(x, "implementationOf", js.undefined)
    
    inline def setInheritedFrom(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setOverwrites(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "overwrites", value.asInstanceOf[js.Any])
    
    inline def setOverwritesUndefined: Self = StObject.set(x, "overwrites", js.undefined)
    
    inline def setParameters(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection]
          ]
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: typings.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameter(
      value: ModelToObject[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
          ]
        ]
    ): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterUndefined: Self = StObject.set(x, "typeParameter", js.undefined)
    
    inline def setTypeParameterVarargs(value: typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection*): Self = StObject.set(x, "typeParameter", js.Array(value*))
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
