package typings.yargs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coerce extends StObject {
  
  var default: Any
  
  def coerce(arg: Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}
object Coerce {
  
  inline def apply(
    coerce: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any,
    default: Any
  ): Coerce = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coerce]
  }
  
  extension [Self <: Coerce](x: Self) {
    
    inline def setCoerce(
      value: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
