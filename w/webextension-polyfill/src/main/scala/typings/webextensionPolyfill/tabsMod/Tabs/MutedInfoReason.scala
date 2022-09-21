package typings.webextensionPolyfill.tabsMod.Tabs

import typings.webextensionPolyfill.webextensionPolyfillStrings.user_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event that caused a muted state change.
  *
  * "user": A user input action has set/overridden the muted state.
  * "capture": Tab capture started, forcing a muted state change.
  * "extension": An extension, identified by the extensionId field, set the muted state.
  */
/* Rewritten from type alias, can be one of: 
  - typings.webextensionPolyfill.webextensionPolyfillStrings.user_
  - typings.webextensionPolyfill.webextensionPolyfillStrings.capture
  - typings.webextensionPolyfill.webextensionPolyfillStrings.`extension`
*/
trait MutedInfoReason extends StObject
object MutedInfoReason {
  
  inline def capture: typings.webextensionPolyfill.webextensionPolyfillStrings.capture = "capture".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.capture]
  
  inline def `extension`: typings.webextensionPolyfill.webextensionPolyfillStrings.`extension` = "extension".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.`extension`]
  
  inline def user: user_ = "user".asInstanceOf[user_]
}
