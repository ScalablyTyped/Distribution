package typings.typedoc.distLibSerializationSchemaMod

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ContainerReflection, 'children' | 'groups' | 'categories' | 'sources'> */
trait ContainerReflection extends StObject {
  
  var categories: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
  ]
  
  var children: ToSerialized[
    js.UndefOr[
      js.Array[typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection]
    ]
  ]
  
  var comment: ToSerialized[js.UndefOr[typings.typedoc.distLibModelsCommentsCommentMod.Comment]]
  
  var flags: ReflectionFlags
  
  var groups: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
  ]
  
  var id: ToSerialized[Double]
  
  var kind: ToSerialized[ReflectionKind]
  
  var kindString: ToSerialized[js.UndefOr[String]]
  
  var name: ToSerialized[String]
  
  /** Will not be present if name === originalName */
  var originalName: js.UndefOr[String] = js.undefined
  
  var sources: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
  ]
}
object ContainerReflection {
  
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
    flags: ReflectionFlags,
    groups: ToSerialized[
      js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
    ],
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    kindString: ToSerialized[js.UndefOr[String]],
    name: ToSerialized[String],
    sources: ToSerialized[
      js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
    ]
  ): ContainerReflection = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerReflection]
  }
  
  extension [Self <: ContainerReflection](x: Self) {
    
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
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGroups(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
        ]
    ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setSources(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
        ]
    ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
  }
}
