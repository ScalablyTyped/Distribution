package typings.styledComponents.distTypesMod

import typings.styledComponents.themeProviderMod.DefaultTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensibleObject
  extends StObject
     with BaseExtensibleObject {
  
  @JSName("$as")
  var $as: js.UndefOr[KnownWebTarget] = js.undefined
  
  @JSName("$forwardedAs")
  var $forwardedAs: js.UndefOr[KnownWebTarget] = js.undefined
  
  var as: js.UndefOr[KnownWebTarget] = js.undefined
  
  var forwardedAs: js.UndefOr[KnownWebTarget] = js.undefined
  
  var theme: js.UndefOr[DefaultTheme] = js.undefined
}
object ExtensibleObject {
  
  inline def apply(): ExtensibleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensibleObject]
  }
  
  extension [Self <: ExtensibleObject](x: Self) {
    
    inline def set$as(value: KnownWebTarget): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
    
    inline def set$forwardedAs(value: KnownWebTarget): Self = StObject.set(x, "$forwardedAs", value.asInstanceOf[js.Any])
    
    inline def set$forwardedAsUndefined: Self = StObject.set(x, "$forwardedAs", js.undefined)
    
    inline def setAs(value: KnownWebTarget): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setForwardedAs(value: KnownWebTarget): Self = StObject.set(x, "forwardedAs", value.asInstanceOf[js.Any])
    
    inline def setForwardedAsUndefined: Self = StObject.set(x, "forwardedAs", js.undefined)
    
    inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
