package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10`[U /* <: Any */, M /* <: Any */] extends StObject {
  
  var `1`: U & M
}
object `10` {
  
  inline def apply[U /* <: Any */, M /* <: Any */](`1`: U & M): `10`[U, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`[U, M]]
  }
  
  extension [Self <: `10`[?, ?], U /* <: Any */, M /* <: Any */](x: Self & (`10`[U, M])) {
    
    inline def set1(value: U & M): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
