package typings.thunderbirdWebextBrowser.messenger

import typings.thunderbirdWebextBrowser.messenger.manifest.ThemeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theme {
  
  trait ThemeUpdateInfo extends StObject {
    
    /** The new theme after update */
    var theme: ThemeType
    
    /** The id of the window the theme has been applied to */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object ThemeUpdateInfo {
    
    inline def apply(theme: ThemeType): ThemeUpdateInfo = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeUpdateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeUpdateInfo] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
