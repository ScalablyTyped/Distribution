package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[U /* <: Any */, M /* <: Any */] extends StObject {
  
  var `0`: U & M
}
object `9` {
  
  inline def apply[U /* <: Any */, M /* <: Any */](`0`: U & M): `9`[U, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`[U, M]]
  }
  
  extension [Self <: `9`[?, ?], U /* <: Any */, M /* <: Any */](x: Self & (`9`[U, M])) {
    
    inline def set0(value: U & M): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
  }
}
