package typings.wixStyleReact

import typings.react.mod.HTMLAttributes
import typings.react.mod.PureComponent
import typings.wixStyleReact.wixStyleReactStrings.div
import typings.wixStyleReact.wixStyleReactStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixStyleReactProviderMod {
  
  @JSImport("wix-style-react/dist/types/WixStyleReactProvider", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[WixStyleReactProviderProps, js.Object, Any]
  
  trait Features extends StObject {
    
    var newColorsBranding: js.UndefOr[Boolean] = js.undefined
    
    var sidebarExperimentCollapsible: js.UndefOr[Boolean] = js.undefined
  }
  object Features {
    
    inline def apply(): Features = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Features]
    }
    
    extension [Self <: Features](x: Self) {
      
      inline def setNewColorsBranding(value: Boolean): Self = StObject.set(x, "newColorsBranding", value.asInstanceOf[js.Any])
      
      inline def setNewColorsBrandingUndefined: Self = StObject.set(x, "newColorsBranding", js.undefined)
      
      inline def setSidebarExperimentCollapsible(value: Boolean): Self = StObject.set(x, "sidebarExperimentCollapsible", value.asInstanceOf[js.Any])
      
      inline def setSidebarExperimentCollapsibleUndefined: Self = StObject.set(x, "sidebarExperimentCollapsible", js.undefined)
    }
  }
  
  type WixStyleReactProvider = PureComponent[WixStyleReactProviderProps, js.Object, Any]
  
  trait WixStyleReactProviderProps
    extends StObject
       with HTMLAttributes[Any] {
    
    var as: js.UndefOr[span | div] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var features: js.UndefOr[Features] = js.undefined
  }
  object WixStyleReactProviderProps {
    
    inline def apply(): WixStyleReactProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixStyleReactProviderProps]
    }
    
    extension [Self <: WixStyleReactProviderProps](x: Self) {
      
      inline def setAs(value: span | div): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    }
  }
}
