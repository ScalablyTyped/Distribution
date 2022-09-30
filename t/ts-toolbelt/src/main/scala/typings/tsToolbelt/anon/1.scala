package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `0`: typings.tsToolbelt.tsToolbeltInts.`0`
  
  var `1`: typings.tsToolbelt.tsToolbeltInts.`1`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(0)
    __obj.updateDynamic("1")(1)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def set0(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: typings.tsToolbelt.tsToolbeltInts.`1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
