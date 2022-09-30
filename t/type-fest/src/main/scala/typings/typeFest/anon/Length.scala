package typings.typeFest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  val length: /* import warning: importer.ImportType#apply Failed type conversion: infer L */ js.Any
}
object Length {
  
  inline def apply(length: /* import warning: importer.ImportType#apply Failed type conversion: infer L */ js.Any): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setLength(value: /* import warning: importer.ImportType#apply Failed type conversion: infer L */ js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
