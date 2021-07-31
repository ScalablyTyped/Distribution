package typings.webdriver.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.webdriver.anon.BufferUsageReportingInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeOptions extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var binary: js.UndefOr[String] = js.undefined
  
  var debuggerAddress: js.UndefOr[String] = js.undefined
  
  var detach: js.UndefOr[Boolean] = js.undefined
  
  var excludeSwitches: js.UndefOr[js.Array[String]] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var localState: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var minidumpPath: js.UndefOr[String] = js.undefined
  
  var mobileEmulation: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var perfLoggingPrefs: js.UndefOr[BufferUsageReportingInterval] = js.undefined
  
  var prefs: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  
  var windowTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ChromeOptions {
  
  @scala.inline
  def apply(): ChromeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOptions]
  }
  
  @scala.inline
  implicit class ChromeOptionsMutableBuilder[Self <: ChromeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setDebuggerAddress(value: String): Self = StObject.set(x, "debuggerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerAddressUndefined: Self = StObject.set(x, "debuggerAddress", js.undefined)
    
    @scala.inline
    def setDetach(value: Boolean): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachUndefined: Self = StObject.set(x, "detach", js.undefined)
    
    @scala.inline
    def setExcludeSwitches(value: js.Array[String]): Self = StObject.set(x, "excludeSwitches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeSwitchesUndefined: Self = StObject.set(x, "excludeSwitches", js.undefined)
    
    @scala.inline
    def setExcludeSwitchesVarargs(value: String*): Self = StObject.set(x, "excludeSwitches", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setLocalState(value: StringDictionary[js.Any]): Self = StObject.set(x, "localState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalStateUndefined: Self = StObject.set(x, "localState", js.undefined)
    
    @scala.inline
    def setMinidumpPath(value: String): Self = StObject.set(x, "minidumpPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinidumpPathUndefined: Self = StObject.set(x, "minidumpPath", js.undefined)
    
    @scala.inline
    def setMobileEmulation(value: StringDictionary[js.Any]): Self = StObject.set(x, "mobileEmulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileEmulationUndefined: Self = StObject.set(x, "mobileEmulation", js.undefined)
    
    @scala.inline
    def setPerfLoggingPrefs(value: BufferUsageReportingInterval): Self = StObject.set(x, "perfLoggingPrefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfLoggingPrefsUndefined: Self = StObject.set(x, "perfLoggingPrefs", js.undefined)
    
    @scala.inline
    def setPrefs(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    
    @scala.inline
    def setWindowTypes(value: js.Array[String]): Self = StObject.set(x, "windowTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTypesUndefined: Self = StObject.set(x, "windowTypes", js.undefined)
    
    @scala.inline
    def setWindowTypesVarargs(value: String*): Self = StObject.set(x, "windowTypes", js.Array(value :_*))
  }
}
