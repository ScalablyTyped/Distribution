package typings.webextensionPolyfill.namespacesTabsMod.Tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines how zoom changes are handled, i.e. which entity is responsible for the actual scaling of the page; defaults to
  * <code>automatic</code>.
  *
  * "automatic": Zoom changes are handled automatically by the browser.
  * "manual": Overrides the automatic handling of zoom changes. The <code>onZoomChange</code> event will still be dispatched,
  * and it is the responsibility of the extension to listen for this event and manually scale the page.
  * This mode does not support <code>per-origin</code> zooming, and will thus ignore the <code>scope</code>
  * zoom setting and assume <code>per-tab</code>.
  * "disabled": Disables all zooming in the tab. The tab will revert to the default zoom level,
  * and all attempted zoom changes will be ignored.
  */
/* Rewritten from type alias, can be one of: 
  - typings.webextensionPolyfill.webextensionPolyfillStrings.automatic
  - typings.webextensionPolyfill.webextensionPolyfillStrings.manual
  - typings.webextensionPolyfill.webextensionPolyfillStrings.disabled
*/
trait ZoomSettingsMode extends StObject
object ZoomSettingsMode {
  
  inline def automatic: typings.webextensionPolyfill.webextensionPolyfillStrings.automatic = "automatic".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.automatic]
  
  inline def disabled: typings.webextensionPolyfill.webextensionPolyfillStrings.disabled = "disabled".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.disabled]
  
  inline def manual: typings.webextensionPolyfill.webextensionPolyfillStrings.manual = "manual".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.manual]
}
