package typings.tsToolbelt.anon

import typings.tsToolbelt.outAnyKeyMod.Key
import typings.tsToolbelt.outObjectEitherMod.EitherLoose
import typings.tsToolbelt.outObjectEitherMod.EitherStrict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0EitherLoose`[O /* <: js.Object */, K /* <: Key */] extends StObject {
  
  var `0`: EitherLoose[O, K]
  
  var `1`: EitherStrict[O, K]
}
object `0EitherLoose` {
  
  inline def apply[O /* <: js.Object */, K /* <: Key */](`0`: EitherLoose[O, K], `1`: EitherStrict[O, K]): `0EitherLoose`[O, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0EitherLoose`[O, K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0EitherLoose`[?, ?], O /* <: js.Object */, K /* <: Key */] (val x: Self & (`0EitherLoose`[O, K])) extends AnyVal {
    
    inline def set0(value: EitherLoose[O, K]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: EitherStrict[O, K]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
