package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirefoxOptions extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var binary: js.UndefOr[String] = js.undefined
  
  var debuggerAddress: js.UndefOr[String] = js.undefined
  
  var log: js.UndefOr[FirefoxLogObject] = js.undefined
  
  var prefs: js.UndefOr[StringDictionary[js.Array[String] | String | Double | Boolean]] = js.undefined
  
  var profile: js.UndefOr[String] = js.undefined
}
object FirefoxOptions {
  
  inline def apply(): FirefoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirefoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirefoxOptions] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setDebuggerAddress(value: String): Self = StObject.set(x, "debuggerAddress", value.asInstanceOf[js.Any])
    
    inline def setDebuggerAddressUndefined: Self = StObject.set(x, "debuggerAddress", js.undefined)
    
    inline def setLog(value: FirefoxLogObject): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setPrefs(value: StringDictionary[js.Array[String] | String | Double | Boolean]): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
    
    inline def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
