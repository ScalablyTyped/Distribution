package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var `0`: `1`
  
  var `1`: `3`
}
object `13` {
  
  inline def apply(`0`: `1`, `1`: `3`): `13` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def set0(value: `1`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: `3`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
