package typings.swcCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalPassOption extends StObject {
  
  /**
    * Name of environment variables to inline.
    *
    * Defaults to `["NODE_ENV", "SWC_ENV"]`
    */
  var envs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Global variables.
    *
    * e.g. `{ __DEBUG__: true }`
    */
  var vars: js.UndefOr[StringDictionary[String]] = js.undefined
}
object GlobalPassOption {
  
  inline def apply(): GlobalPassOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalPassOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalPassOption] (val x: Self) extends AnyVal {
    
    inline def setEnvs(value: js.Array[String]): Self = StObject.set(x, "envs", value.asInstanceOf[js.Any])
    
    inline def setEnvsUndefined: Self = StObject.set(x, "envs", js.undefined)
    
    inline def setEnvsVarargs(value: String*): Self = StObject.set(x, "envs", js.Array(value*))
    
    inline def setVars(value: StringDictionary[String]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}
