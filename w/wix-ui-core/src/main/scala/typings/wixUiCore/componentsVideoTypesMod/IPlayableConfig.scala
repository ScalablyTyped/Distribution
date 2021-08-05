package typings.wixUiCore.componentsVideoTypesMod

import typings.react.mod.ReactNode
import typings.wixUiCore.wixUiCoreStrings.auto
import typings.wixUiCore.wixUiCoreStrings.metadata
import typings.wixUiCore.wixUiCoreStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayableConfig extends StObject {
  
  var alwaysShowLogo: js.UndefOr[Boolean] = js.undefined
  
  var hideMainUI: js.UndefOr[Boolean] = js.undefined
  
  var logoUrl: js.UndefOr[String] = js.undefined
  
  var modules: js.UndefOr[js.Object] = js.undefined
  
  var onLogoClick: js.UndefOr[js.Function] = js.undefined
  
  var playButton: js.UndefOr[ReactNode] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var preload: js.UndefOr[auto | metadata | none] = js.undefined
  
  var texts: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITextMapConfig */ js.Any
  ] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object IPlayableConfig {
  
  inline def apply(): IPlayableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlayableConfig]
  }
  
  extension [Self <: IPlayableConfig](x: Self) {
    
    inline def setAlwaysShowLogo(value: Boolean): Self = StObject.set(x, "alwaysShowLogo", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowLogoUndefined: Self = StObject.set(x, "alwaysShowLogo", js.undefined)
    
    inline def setHideMainUI(value: Boolean): Self = StObject.set(x, "hideMainUI", value.asInstanceOf[js.Any])
    
    inline def setHideMainUIUndefined: Self = StObject.set(x, "hideMainUI", js.undefined)
    
    inline def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setModules(value: js.Object): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setOnLogoClick(value: js.Function): Self = StObject.set(x, "onLogoClick", value.asInstanceOf[js.Any])
    
    inline def setOnLogoClickUndefined: Self = StObject.set(x, "onLogoClick", js.undefined)
    
    inline def setPlayButton(value: ReactNode): Self = StObject.set(x, "playButton", value.asInstanceOf[js.Any])
    
    inline def setPlayButtonUndefined: Self = StObject.set(x, "playButton", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setPreload(value: auto | metadata | none): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setTexts(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITextMapConfig */ js.Any
    ): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
