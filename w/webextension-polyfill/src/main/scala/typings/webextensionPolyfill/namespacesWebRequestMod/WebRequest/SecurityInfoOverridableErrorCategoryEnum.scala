package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of certificate error that was overridden for this connection, if any.
  */
/* Rewritten from type alias, can be one of: 
  - typings.webextensionPolyfill.webextensionPolyfillStrings.trust_error
  - typings.webextensionPolyfill.webextensionPolyfillStrings.domain_mismatch
  - typings.webextensionPolyfill.webextensionPolyfillStrings.expired_or_not_yet_valid
*/
trait SecurityInfoOverridableErrorCategoryEnum extends StObject
object SecurityInfoOverridableErrorCategoryEnum {
  
  inline def domain_mismatch: typings.webextensionPolyfill.webextensionPolyfillStrings.domain_mismatch = "domain_mismatch".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.domain_mismatch]
  
  inline def expired_or_not_yet_valid: typings.webextensionPolyfill.webextensionPolyfillStrings.expired_or_not_yet_valid = "expired_or_not_yet_valid".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.expired_or_not_yet_valid]
  
  inline def trust_error: typings.webextensionPolyfill.webextensionPolyfillStrings.trust_error = "trust_error".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.trust_error]
}
