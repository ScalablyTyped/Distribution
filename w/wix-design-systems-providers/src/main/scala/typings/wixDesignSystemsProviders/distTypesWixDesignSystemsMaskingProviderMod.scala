package typings.wixDesignSystemsProviders

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.wixDesignSystemsProviders.distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod.WixDesignSystemsMaskingContextProps
import typings.wixDesignSystemsProviders.distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod.WixDesignSystemsMaskingProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixDesignSystemsMaskingProviderMod {
  
  @JSImport("wix-design-systems-providers/dist/types/WixDesignSystemsMaskingProvider", "WixDesignSystemsMaskingContext")
  @js.native
  val WixDesignSystemsMaskingContext: Context[WixDesignSystemsMaskingContextProps] = js.native
  
  object WixDesignSystemsMaskingProvider {
    
    inline def apply(param0: WixDesignSystemsMaskingProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("wix-design-systems-providers/dist/types/WixDesignSystemsMaskingProvider", "WixDesignSystemsMaskingProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-design-systems-providers/dist/types/WixDesignSystemsMaskingProvider", "WixDesignSystemsMaskingProvider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
