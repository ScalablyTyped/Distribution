package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  var set: js.UndefOr[js.Any] = js.undefined
}
object Set {
  
  inline def apply(): Set = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Set]
  }
  
  extension [Self <: Set](x: Self) {
    
    inline def setSet(value: js.Any): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
