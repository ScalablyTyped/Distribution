package typings.swcWasm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstModulesConfig extends StObject {
  
  var globals: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.undefined
}
object ConstModulesConfig {
  
  inline def apply(): ConstModulesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstModulesConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstModulesConfig] (val x: Self) extends AnyVal {
    
    inline def setGlobals(value: StringDictionary[StringDictionary[String]]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
  }
}
