package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0U`[A /* <: Any */, U /* <: Any */] extends StObject {
  
  var `0`: U
  
  var `1`: A
}
object `0U` {
  
  inline def apply[A /* <: Any */, U /* <: Any */](`0`: U, `1`: A): `0U`[A, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0U`[A, U]]
  }
  
  extension [Self <: `0U`[?, ?], A /* <: Any */, U /* <: Any */](x: Self & (`0U`[A, U])) {
    
    inline def set0(value: U): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: A): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
