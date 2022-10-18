package typings.typedoc.distLibSerializationSchemaMod

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {-readonly [ K2 in never ]: typedoc.typedoc/dist/lib/serialization/schema.ToSerialized<typedoc.typedoc/dist/lib/models.ReferenceReflection[K2]>} */ trait ReferenceReflection
  extends StObject
     with DeclarationReflection {
  
  /**
    * -1 if the reference refers to a symbol that does not exist in the documentation.
    * Otherwise, the reflection ID.
    */
  var target: Double
}
object ReferenceReflection {
  
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
    target: Double,
    `type`: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsTypesMod.SomeType]],
    typeParameters: ToSerialized[
      js.UndefOr[
        js.Array[typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection]
      ]
    ]
  ): ReferenceReflection = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], extendedBy = extendedBy.asInstanceOf[js.Any], extendedTypes = extendedTypes.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getSignature = getSignature.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implementationOf = implementationOf.asInstanceOf[js.Any], implementedBy = implementedBy.asInstanceOf[js.Any], implementedTypes = implementedTypes.asInstanceOf[js.Any], indexSignature = indexSignature.asInstanceOf[js.Any], inheritedFrom = inheritedFrom.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overwrites = overwrites.asInstanceOf[js.Any], setSignature = setSignature.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceReflection]
  }
  
  extension [Self <: ReferenceReflection](x: Self) {
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
