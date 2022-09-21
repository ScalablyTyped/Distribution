package typings.twig.mod

import org.scalablytyped.runtime.StringDictionary
import typings.twig.anon.Twigoptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions
  extends StObject
     with /* index */ StringDictionary[Any] {
  
  var allowAsync: js.UndefOr[Boolean] = js.undefined
  
  var settings: js.UndefOr[Twigoptions] = js.undefined
}
object RenderOptions {
  
  inline def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  extension [Self <: RenderOptions](x: Self) {
    
    inline def setAllowAsync(value: Boolean): Self = StObject.set(x, "allowAsync", value.asInstanceOf[js.Any])
    
    inline def setAllowAsyncUndefined: Self = StObject.set(x, "allowAsync", js.undefined)
    
    inline def setSettings(value: Twigoptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
