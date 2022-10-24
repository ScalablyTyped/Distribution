package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixStyleReactEnvironmentProviderMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/WixStyleReactEnvironmentProvider", JSImport.Default)
  @js.native
  val default: FC[WixStyleReactEnvironmentProviderProps] = js.native
  
  trait WixStyleReactEnvironmentProviderProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
  }
  object WixStyleReactEnvironmentProviderProps {
    
    inline def apply(): WixStyleReactEnvironmentProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixStyleReactEnvironmentProviderProps]
    }
    
    extension [Self <: WixStyleReactEnvironmentProviderProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    }
  }
  
  type _To = FC[WixStyleReactEnvironmentProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesWixStyleReactEnvironmentProviderMod.foo` */
  override def _to: FC[WixStyleReactEnvironmentProviderProps] = default
}
