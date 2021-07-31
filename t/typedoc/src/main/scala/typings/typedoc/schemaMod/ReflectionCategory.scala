package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionCategory, 'title'> */
trait ReflectionCategory
  extends StObject
     with __ModelToObject[js.Any] {
  
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models/reflections/abstract.Reflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  
  var title: ModelToObject[String] | String
}
object ReflectionCategory {
  
  @scala.inline
  def apply(title: ModelToObject[String] | String): ReflectionCategory = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionCategory]
  }
  
  @scala.inline
  implicit class ReflectionCategoryMutableBuilder[Self <: ReflectionCategory] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: ModelToObject[String] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "title", js.Array(value :_*))
  }
}
