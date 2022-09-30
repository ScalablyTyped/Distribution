package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1U1`[U1 /* <: Any */] extends StObject {
  
  var `1`: U1
}
object `1U1` {
  
  inline def apply[U1 /* <: Any */](`1`: U1): `1U1`[U1] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1U1`[U1]]
  }
  
  extension [Self <: `1U1`[?], U1 /* <: Any */](x: Self & `1U1`[U1]) {
    
    inline def set1(value: U1): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
