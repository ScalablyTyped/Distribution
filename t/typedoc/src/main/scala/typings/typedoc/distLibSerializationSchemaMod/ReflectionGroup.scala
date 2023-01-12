package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionGroup, 'title' | 'categories'> */
trait ReflectionGroup extends StObject {
  
  var categories: ToSerialized[
    js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
  ]
  
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models.DeclarationReflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  
  var title: ToSerialized[String]
}
object ReflectionGroup {
  
  inline def apply(title: ToSerialized[String]): ReflectionGroup = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReflectionGroup] (val x: Self) extends AnyVal {
    
    inline def setCategories(
      value: ToSerialized[
          js.UndefOr[js.Array[typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory]]
        ]
    ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setChildren(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models.DeclarationReflection>[number]['id'] */ js.Any
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models.DeclarationReflection>[number]['id'] */ js.Any)*
    ): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setTitle(value: ToSerialized[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
