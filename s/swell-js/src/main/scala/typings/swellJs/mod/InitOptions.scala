package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitOptions extends StObject {
  
  var api: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var previewContent: js.UndefOr[Boolean | Null] = js.undefined
  
  var session: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String | Null] = js.undefined
  
  var useCamelCase: js.UndefOr[Boolean | Null] = js.undefined
  
  var vaultUrl: js.UndefOr[String] = js.undefined
}
object InitOptions {
  
  inline def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPreviewContent(value: Boolean): Self = StObject.set(x, "previewContent", value.asInstanceOf[js.Any])
    
    inline def setPreviewContentNull: Self = StObject.set(x, "previewContent", null)
    
    inline def setPreviewContentUndefined: Self = StObject.set(x, "previewContent", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseCamelCase(value: Boolean): Self = StObject.set(x, "useCamelCase", value.asInstanceOf[js.Any])
    
    inline def setUseCamelCaseNull: Self = StObject.set(x, "useCamelCase", null)
    
    inline def setUseCamelCaseUndefined: Self = StObject.set(x, "useCamelCase", js.undefined)
    
    inline def setVaultUrl(value: String): Self = StObject.set(x, "vaultUrl", value.asInstanceOf[js.Any])
    
    inline def setVaultUrlUndefined: Self = StObject.set(x, "vaultUrl", js.undefined)
  }
}
