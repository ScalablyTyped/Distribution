package typings.tsToolbelt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `0`: typings.tsToolbelt.tsToolbeltInts.`1`
  
  var `1`: typings.tsToolbelt.tsToolbeltInts.`0`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(1)
    __obj.updateDynamic("1")(0)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def set0(value: typings.tsToolbelt.tsToolbeltInts.`1`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: typings.tsToolbelt.tsToolbeltInts.`0`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
