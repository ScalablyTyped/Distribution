package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultIcons
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var defaultIcons: js.UndefOr[js.Object] = js.undefined
}
object DefaultIcons {
  
  inline def apply(): DefaultIcons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultIcons]
  }
  
  extension [Self <: DefaultIcons](x: Self) {
    
    inline def setDefaultIcons(value: js.Object): Self = StObject.set(x, "defaultIcons", value.asInstanceOf[js.Any])
    
    inline def setDefaultIconsUndefined: Self = StObject.set(x, "defaultIcons", js.undefined)
  }
}
