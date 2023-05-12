package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@vue/compiler-sfc.@vue/compiler-sfc.ImportBinding, 'source' | 'imported'> */
trait Import extends StObject {
  
  var imported: String
  
  var source: String
}
object Import {
  
  inline def apply(imported: String, source: String): Import = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
    
    inline def setImported(value: String): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
