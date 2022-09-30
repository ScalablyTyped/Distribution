package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `0`: typings.tsToolbelt.tsToolbeltInts.`1`
  
  @JSName("+")
  var Plussign: typings.tsToolbelt.tsToolbeltInts.`0`
  
  @JSName("-")
  var _dash: typings.tsToolbelt.tsToolbeltInts.`0`
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(1)
    __obj.updateDynamic("+")(0)
    __obj.updateDynamic("-")(0)
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def set0(value: typings.tsToolbelt.tsToolbeltInts.`1`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def setPlussign(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
    
    inline def set_dash(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
  }
}
