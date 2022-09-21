package typings.yargs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
}
object Default {
  
  inline def apply(default: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
