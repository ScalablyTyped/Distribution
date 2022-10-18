package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReflectionCategory, 'title'> */
trait ReflectionCategory extends StObject {
  
  var children: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/models.DeclarationReflection>[number]['id'] */ js.Any
    ]
  ] = js.undefined
  
  var title: ToSerialized[String]
}
object ReflectionCategory {
  
  inline def apply(title: ToSerialized[String]): ReflectionCategory = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionCategory]
  }
  
  extension [Self <: ReflectionCategory](x: Self) {
    
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
