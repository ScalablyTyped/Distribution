package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyStrings.browser
import typings.tampermonkey.tampermonkeyStrings.disabled
import typings.tampermonkey.tampermonkeyStrings.dom
import typings.tampermonkey.tampermonkeyStrings.js_
import typings.tampermonkey.tampermonkeyStrings.native
import typings.tampermonkey.tampermonkeyStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptInfo extends StObject {
  
  var downloadMode: native | browser | disabled
  
  var isFirstPartyIsolation: js.UndefOr[Boolean] = js.undefined
  
  var isIncognito: Boolean
  
  var sandboxMode: js_ | raw | dom
  
  var script: ScriptMetadata
  
  /**
    * In tampermonkey it's "Tampermonkey"
    * but I'll leave it as string so this can be used
    * for other managers
    */
  var scriptHandler: String
  
  var scriptMetaStr: String | Null
  
  var scriptSource: String
  
  var scriptUpdateURL: String | Null
  
  var scriptWillUpdate: Boolean
  
  /** This refers to tampermonkey's version */
  var version: js.UndefOr[String] = js.undefined
}
object ScriptInfo {
  
  inline def apply(
    downloadMode: native | browser | disabled,
    isIncognito: Boolean,
    sandboxMode: js_ | raw | dom,
    script: ScriptMetadata,
    scriptHandler: String,
    scriptSource: String,
    scriptWillUpdate: Boolean
  ): ScriptInfo = {
    val __obj = js.Dynamic.literal(downloadMode = downloadMode.asInstanceOf[js.Any], isIncognito = isIncognito.asInstanceOf[js.Any], sandboxMode = sandboxMode.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scriptHandler = scriptHandler.asInstanceOf[js.Any], scriptSource = scriptSource.asInstanceOf[js.Any], scriptWillUpdate = scriptWillUpdate.asInstanceOf[js.Any], scriptMetaStr = null, scriptUpdateURL = null)
    __obj.asInstanceOf[ScriptInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptInfo] (val x: Self) extends AnyVal {
    
    inline def setDownloadMode(value: native | browser | disabled): Self = StObject.set(x, "downloadMode", value.asInstanceOf[js.Any])
    
    inline def setIsFirstPartyIsolation(value: Boolean): Self = StObject.set(x, "isFirstPartyIsolation", value.asInstanceOf[js.Any])
    
    inline def setIsFirstPartyIsolationUndefined: Self = StObject.set(x, "isFirstPartyIsolation", js.undefined)
    
    inline def setIsIncognito(value: Boolean): Self = StObject.set(x, "isIncognito", value.asInstanceOf[js.Any])
    
    inline def setSandboxMode(value: js_ | raw | dom): Self = StObject.set(x, "sandboxMode", value.asInstanceOf[js.Any])
    
    inline def setScript(value: ScriptMetadata): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptHandler(value: String): Self = StObject.set(x, "scriptHandler", value.asInstanceOf[js.Any])
    
    inline def setScriptMetaStr(value: String): Self = StObject.set(x, "scriptMetaStr", value.asInstanceOf[js.Any])
    
    inline def setScriptMetaStrNull: Self = StObject.set(x, "scriptMetaStr", null)
    
    inline def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
    
    inline def setScriptUpdateURL(value: String): Self = StObject.set(x, "scriptUpdateURL", value.asInstanceOf[js.Any])
    
    inline def setScriptUpdateURLNull: Self = StObject.set(x, "scriptUpdateURL", null)
    
    inline def setScriptWillUpdate(value: Boolean): Self = StObject.set(x, "scriptWillUpdate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
