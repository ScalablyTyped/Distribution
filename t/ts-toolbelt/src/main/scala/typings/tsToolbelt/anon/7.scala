package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[K /* <: Key */, A /* <: Any */] extends StObject {
  
  var R: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ P in K ]: A} */ js.Any
  
  var W: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: A} */ js.Any
}
object `7` {
  
  inline def apply[K /* <: Key */, A /* <: Any */](
    R: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ P in K ]: A} */ js.Any,
    W: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: A} */ js.Any
  ): `7`[K, A] = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
    __obj.asInstanceOf[`7`[K, A]]
  }
  
  extension [Self <: `7`[?, ?], K /* <: Key */, A /* <: Any */](x: Self & (`7`[K, A])) {
    
    inline def setR(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ P in K ]: A} */ js.Any
    ): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    
    inline def setW(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: A} */ js.Any
    ): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
  }
}
