package typings.typedoc.schemaMod

import typings.typedoc.abstractMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionGroup, 'title' | 'kind' | 'categories'> */
trait ReflectionGroup
  extends StObject
     with __ModelToObject[js.Any] {
  
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]
  ] = js.undefined
  
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  
  var kind: ModelToObject[ReflectionKind] | ReflectionKind
  
  var title: ModelToObject[String] | String
}
object ReflectionGroup {
  
  @scala.inline
  def apply(kind: ModelToObject[ReflectionKind] | ReflectionKind, title: ModelToObject[String] | String): ReflectionGroup = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionGroup]
  }
  
  @scala.inline
  implicit class ReflectionGroupMutableBuilder[Self <: ReflectionGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]]] | js.Array[typings.typedoc.reflectionCategoryMod.ReflectionCategory]
    ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: (typings.typedoc.reflectionCategoryMod.ReflectionCategory | _ModelToObject[js.Any])*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setChildren(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: ModelToObject[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "title", js.Array(value :_*))
  }
}
