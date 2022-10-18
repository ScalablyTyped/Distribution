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
    categories: ToSerialized[
      js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
    ],
    children: ToSerialized[
      js.UndefOr[
        js.Array[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
      ]
    ],
    comment: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]],
    defaultValue: ToSerialized[js.UndefOr[String]],
    extendedBy: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]],
    extendedTypes: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]],
    flags: ReflectionFlags,
    getSignature: ToSerialized[
      js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
    ],
    groups: ToSerialized[
      js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
    ],
    id: ToSerialized[Double],
    implementationOf: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]],
    implementedBy: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]],
    implementedTypes: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]],
    indexSignature: ToSerialized[
      js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
    ],
    inheritedFrom: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]],
    kind: ToSerialized[ReflectionKind],
    kindString: ToSerialized[js.UndefOr[String]],
    name: ToSerialized[String],
    overwrites: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]],
    setSignature: ToSerialized[
      js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
    ],
    signatures: ToSerialized[
      js.UndefOr[
        js.Array[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
      ]
    ],
    sources: ToSerialized[
      js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
    ],
    `type`: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]],
    typeParameters: ToSerialized[
      js.UndefOr[
        js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
      ]
    ]
  ): DeclarationReflection = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], extendedBy = extendedBy.asInstanceOf[js.Any], extendedTypes = extendedTypes.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getSignature = getSignature.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationOf = implementationOf.asInstanceOf[js.Any], implementedBy = implementedBy.asInstanceOf[js.Any], implementedTypes = implementedTypes.asInstanceOf[js.Any], indexSignature = indexSignature.asInstanceOf[js.Any], inheritedFrom = inheritedFrom.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overwrites = overwrites.asInstanceOf[js.Any], setSignature = setSignature.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationReflection]
  }
  
  extension [Self <: DeclarationReflection](x: Self) {
    
    inline def setCategories(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
        ]
    ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setChildren(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
          ]
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setComment(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setExtendedBy(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]]): Self = StObject.set(x, "extendedBy", value.asInstanceOf[js.Any])
    
    inline def setExtendedTypes(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]): Self = StObject.set(x, "extendedTypes", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetSignature(
      value: ToSerialized[
          js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
        ]
    ): Self = StObject.set(x, "getSignature", value.asInstanceOf[js.Any])
    
    inline def setGroups(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
        ]
    ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplementationOf(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "implementationOf", value.asInstanceOf[js.Any])
    
    inline def setImplementedBy(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.ReferenceType]]]): Self = StObject.set(x, "implementedBy", value.asInstanceOf[js.Any])
    
    inline def setImplementedTypes(value: ToSerialized[js.UndefOr[js.Array[typings.typedoc.distLibModelsTypesMod.SomeType]]]): Self = StObject.set(x, "implementedTypes", value.asInstanceOf[js.Any])
    
    inline def setIndexSignature(
      value: ToSerialized[
          js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
        ]
    ): Self = StObject.set(x, "indexSignature", value.asInstanceOf[js.Any])
    
    inline def setInheritedFrom(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setOverwrites(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.ReferenceType]]): Self = StObject.set(x, "overwrites", value.asInstanceOf[js.Any])
    
    inline def setSetSignature(
      value: ToSerialized[
          js.UndefOr[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
        ]
    ): Self = StObject.set(x, "setSignature", value.asInstanceOf[js.Any])
    
    inline def setSignatures(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection]
          ]
        ]
    ): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSources(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
        ]
    ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(
      value: ToSerialized[
          js.UndefOr[
            js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
          ]
        ]
    ): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
