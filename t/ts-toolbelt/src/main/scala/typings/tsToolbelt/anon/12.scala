package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var `0`: `1`
  
  var `1`: `2`
}
object `12` {
  
  inline def apply(`0`: `1`, `1`: `2`): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def set0(value: `1`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: `2`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
