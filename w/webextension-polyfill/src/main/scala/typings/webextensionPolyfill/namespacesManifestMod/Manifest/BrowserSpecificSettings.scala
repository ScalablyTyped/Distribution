package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserSpecificSettings extends StObject {
  
  /**
    * Optional.
    */
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}
object BrowserSpecificSettings {
  
  inline def apply(): BrowserSpecificSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserSpecificSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserSpecificSettings] (val x: Self) extends AnyVal {
    
    inline def setGecko(value: FirefoxSpecificProperties): Self = StObject.set(x, "gecko", value.asInstanceOf[js.Any])
    
    inline def setGeckoUndefined: Self = StObject.set(x, "gecko", js.undefined)
  }
}
