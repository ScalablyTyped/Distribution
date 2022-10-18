package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppiumXCUIProcessArguments extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var env: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object AppiumXCUIProcessArguments {
  
  inline def apply(): AppiumXCUIProcessArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppiumXCUIProcessArguments]
  }
  
  extension [Self <: AppiumXCUIProcessArguments](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
  }
}
