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
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    name: ToSerialized[String]
  ): ContainerReflection = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerReflection]
  }
  
  extension [Self <: ContainerReflection](x: Self) {
    
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
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGroups(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup]]
        ]
    ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: typings.typedoc.distLibModelsReflectionGroupMod.ReflectionGroup*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setKindStringUndefined: Self = StObject.set(x, "kindString", js.undefined)
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setSources(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsSourcesFileMod.SourceReference]]
        ]
    ): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: typings.typedoc.distLibModelsSourcesFileMod.SourceReference*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
