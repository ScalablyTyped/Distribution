package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestContentSecurityPolicyC2Type extends StObject {
  
  /**
    * The Content Security Policy used for extension pages.
    * Optional.
    */
  var extension_pages: js.UndefOr[String] = js.undefined
  
  /**
    * In addition, Manifest V3 disallows certain CSP modifications for `extension_pages` that were permitted in Manifest V2.
    * The `script-src`, `object-src`, and `worker-src` directives may only have the following values:
    * - `self`
    * - `none` - Any localhost source, (`http://localhost`, `http://127.0.0.1`, or any port on those domains)
    * Optional.
    */
  var sandbox: js.UndefOr[String] = js.undefined
}
object WebExtensionManifestContentSecurityPolicyC2Type {
  
  inline def apply(): WebExtensionManifestContentSecurityPolicyC2Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestContentSecurityPolicyC2Type]
  }
  
  extension [Self <: WebExtensionManifestContentSecurityPolicyC2Type](x: Self) {
    
    inline def setExtension_pages(value: String): Self = StObject.set(x, "extension_pages", value.asInstanceOf[js.Any])
    
    inline def setExtension_pagesUndefined: Self = StObject.set(x, "extension_pages", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
  }
}
