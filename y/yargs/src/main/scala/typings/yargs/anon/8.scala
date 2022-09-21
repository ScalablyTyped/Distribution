package typings.yargs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def coerce(arg: Any): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}
object `8` {
  
  inline def apply(
    coerce: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): `8` = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce))
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setCoerce(
      value: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
  }
}
