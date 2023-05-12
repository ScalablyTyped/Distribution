package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagePersistent extends StObject {
  
  var page: ExtensionURL
  
  /** Not supported on manifest versions above 2. */
  var persistent: js.UndefOr[Boolean] = js.undefined
}
object PagePersistent {
  
  inline def apply(page: ExtensionURL): PagePersistent = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagePersistent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagePersistent] (val x: Self) extends AnyVal {
    
    inline def setPage(value: ExtensionURL): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
  }
}
