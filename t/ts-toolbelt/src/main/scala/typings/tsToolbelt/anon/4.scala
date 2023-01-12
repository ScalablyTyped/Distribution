package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var `0`: typings.tsToolbelt.tsToolbeltInts.`0`
  
  @JSName("+")
  var Plussign: typings.tsToolbelt.tsToolbeltInts.`0`
  
  @JSName("-")
  var _dash: typings.tsToolbelt.tsToolbeltInts.`1`
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(0)
    __obj.updateDynamic("+")(0)
    __obj.updateDynamic("-")(1)
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def set0(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def setPlussign(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
    
    inline def set_dash(value: typings.tsToolbelt.tsToolbeltInts.`1`): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
  }
}
