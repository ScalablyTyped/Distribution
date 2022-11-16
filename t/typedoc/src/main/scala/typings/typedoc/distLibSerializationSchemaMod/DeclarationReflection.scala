package typings.typedoc.distLibSerializationSchemaMod

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.ContainerReflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.DeclarationReflection, 'type' | 'signatures' | 'indexSignature' | 'defaultValue' | 'overwrites' | 'inheritedFrom' | 'implementationOf' | 'extendedTypes' | 'extendedBy' | 'implementedTypes' | 'implementedBy' | 'getSignature' | 'setSignature' | 'typeParameters'> */
trait DeclarationReflection extends StObject {
  
  var categories: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
  ]
  
  var children: ToSerialized[
    js.UndefOr[
      js.Array[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
    ]
  ]
  
  var comment: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]
  
  var defaultValue: ToSerialized[js.UndefOr[String]]
  
  var extendedBy: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]]
  
  var extendedTypes: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]
  
  var flags: ReflectionFlags
  
  var getSignature: ToSerialized[
    js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
  ]
  
  var groups: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
  ]
  
  var id: ToSerialized[Double]
  
  var implementationOf: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]
  
  var implementedBy: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]]
  
  var implementedTypes: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]
  
  var indexSignature: ToSerialized[
    js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
  ]
  
  var inheritedFrom: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]
  
  var kind: ToSerialized[ReflectionKind]
  
  var kindString: ToSerialized[js.UndefOr[String]]
  
  var name: ToSerialized[String]
  
  /** Will not be present if name === originalName */
  var originalName: js.UndefOr[String] = js.undefined
  
  var overwrites: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]
  
  var setSignature: ToSerialized[
    js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
  ]
  
  var signatures: ToSerialized[
    js.UndefOr[
      js.Array[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
    ]
  ]
  
  var sources: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
  ]
  
  var `type`: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]
  
  var typeParameters: ToSerialized[
    js.UndefOr[
      js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
    ]
  ]
}
object DeclarationReflection {
  
  inline def apply(
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): DeclarationReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationReflection]
  }
  
  extension [Self <: DeclarationReflection](x: Self) {
    
    inline def setCategories(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
        ]
    ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setChildren(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
          ]
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setComment(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDefaultValue(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setExtendedBy(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]]): Self = StObject.set(x, "extendedBy", value.asInstanceOf[js.Any])
    
    inline def setExtendedByUndefined: Self = StObject.set(x, "extendedBy", js.undefined)
    
    inline def setExtendedByVarargs(value: typings.typedoc.distLibModelsTypesMod.ReferenceType*): Self = StObject.set(x, "extendedBy", js.Array(value*))
    
    inline def setExtendedTypes(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]): Self = StObject.set(x, "extendedTypes", value.asInstanceOf[js.Any])
    
    inline def setExtendedTypesUndefined: Self = StObject.set(x, "extendedTypes", js.undefined)
    
    inline def setExtendedTypesVarargs(value: typings.typedoc.distLibModelsTypesMod.SomeType*): Self = StObject.set(x, "extendedTypes", js.Array(value*))
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetSignature(
      value: ToSerialized[
          js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
        ]
    ): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    inline def setGetSignatureUndefined: Self = StObject.set(x, "getSignature", js.undefined)
    
    inline def setGroups(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
        ]
    ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplementationOf(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "implementationOf", value.asInstanceOf[js.Any])
    
    inline def setImplementationOfUndefined: Self = StObject.set(x, "implementationOf", js.undefined)
    
    inline def setImplementedBy(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]]): Self = StObject.set(x, "implementedBy", value.asInstanceOf[js.Any])
    
    inline def setImplementedByUndefined: Self = StObject.set(x, "implementedBy", js.undefined)
    
    inline def setImplementedByVarargs(value: typings.typedoc.distLibModelsTypesMod.ReferenceType*): Self = StObject.set(x, "implementedBy", js.Array(value*))
    
    inline def setImplementedTypes(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]): Self = StObject.set(x, "implementedTypes", value.asInstanceOf[js.Any])
    
    inline def setImplementedTypesUndefined: Self = StObject.set(x, "implementedTypes", js.undefined)
    
    inline def setImplementedTypesVarargs(value: typings.typedoc.distLibModelsTypesMod.SomeType*): Self = StObject.set(x, "implementedTypes", js.Array(value*))
    
    inline def setIndexSignature(
      value: ToSerialized[
          js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
        ]
    ): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    inline def setIndexSignatureUndefined: Self = StObject.set(x, "indexSignature", js.undefined)
    
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
    
    inline def setSetSignature(
      value: ToSerialized[
          js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
        ]
    ): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    inline def setSetSignatureUndefined: Self = StObject.set(x, "setSignature", js.undefined)
    
    inline def setSignatures(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
          ]
        ]
    ): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection*): Self = StObject.set(x, "signatures", js.Array(value*))
    
    inline def setSources(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
        ]
    ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: typings.typedoc.distLibModelsSourcesFileMod.SourceReference*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
          ]
        ]
    ): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
    
    inline def setTypeParametersVarargs(value: typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection*): Self = StObject.set(x, "typeParameters", js.Array(value*))
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
