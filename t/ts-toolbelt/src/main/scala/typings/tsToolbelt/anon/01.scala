package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `01` extends StObject {
  
  var `0`: typings.tsToolbelt.anon.`0`
  
  var `1`: typings.tsToolbelt.anon.`1`
}
object `01` {
  
  inline def apply(`0`: `0`, `1`: `1`): `01` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`01`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `01`] (val x: Self) extends AnyVal {
    
    inline def set0(value: `0`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: `1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
