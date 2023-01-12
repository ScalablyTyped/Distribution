package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  var set: js.UndefOr[Any] = js.undefined
}
object Set {
  
  inline def apply(): Set = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Set]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
    
    inline def setSet(value: Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
