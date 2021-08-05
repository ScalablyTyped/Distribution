package typings.typedoc.anon

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReflectionGroup> */
trait PartialReflectionGroup extends StObject {
  
  var categories: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory]
  ] = js.undefined
  
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  
  var kind: js.UndefOr[ModelToObject[ReflectionKind] | ReflectionKind] = js.undefined
  
  var title: js.UndefOr[ModelToObject[String] | String] = js.undefined
}
object PartialReflectionGroup {
  
  inline def apply(): PartialReflectionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReflectionGroup]
  }
  
  extension [Self <: PartialReflectionGroup](x: Self) {
    
    inline def setCategories(value: ModelToObject[js.UndefOr[js.Array[ReflectionCategory]]] | js.Array[ReflectionCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: (ReflectionCategory | _ModelToObject[js.Any])*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setChildren(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setKind(value: ModelToObject[ReflectionKind] | ReflectionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKindVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "kind", js.Array(value :_*))
    
    inline def setTitle(value: ModelToObject[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "title", js.Array(value :_*))
  }
}
