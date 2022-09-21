package typings.webextensionPolyfill.runtimeMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reason that the event is being dispatched. 'app_update' is used when the restart is needed because the application
  * is updated to a newer version. 'os_update' is used when the restart is needed because the browser/OS is updated to a
  * newer version. 'periodic' is used when the system runs for more than the permitted uptime set in the enterprise policy.
  */
/* Rewritten from type alias, can be one of: 
  - typings.webextensionPolyfill.webextensionPolyfillStrings.app_update
  - typings.webextensionPolyfill.webextensionPolyfillStrings.os_update
  - typings.webextensionPolyfill.webextensionPolyfillStrings.periodic
*/
trait OnRestartRequiredReason extends StObject
object OnRestartRequiredReason {
  
  inline def app_update: typings.webextensionPolyfill.webextensionPolyfillStrings.app_update = "app_update".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.app_update]
  
  inline def os_update: typings.webextensionPolyfill.webextensionPolyfillStrings.os_update = "os_update".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.os_update]
  
  inline def periodic: typings.webextensionPolyfill.webextensionPolyfillStrings.periodic = "periodic".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.periodic]
}
