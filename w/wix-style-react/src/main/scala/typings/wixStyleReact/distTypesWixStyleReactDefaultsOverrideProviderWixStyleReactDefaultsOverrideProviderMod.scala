package typings.wixStyleReact

import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.Provider
import typings.wixStyleReact.anon.`18`
import typings.wixStyleReact.anon.`19`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixStyleReactDefaultsOverrideProviderWixStyleReactDefaultsOverrideProviderMod {
  
  @JSImport("wix-style-react/dist/types/WixStyleReactDefaultsOverrideProvider/WixStyleReactDefaultsOverrideProvider", "WixStyleReactDefaultsOverrideConsumer")
  @js.native
  val WixStyleReactDefaultsOverrideConsumer: Consumer[WixStyleReactDefaultsOverride] = js.native
  
  @JSImport("wix-style-react/dist/types/WixStyleReactDefaultsOverrideProvider/WixStyleReactDefaultsOverrideProvider", "WixStyleReactDefaultsOverrideContext")
  @js.native
  val WixStyleReactDefaultsOverrideContext: Context[WixStyleReactDefaultsOverride] = js.native
  
  @JSImport("wix-style-react/dist/types/WixStyleReactDefaultsOverrideProvider/WixStyleReactDefaultsOverrideProvider", "WixStyleReactDefaultsOverrideProvider")
  @js.native
  val WixStyleReactDefaultsOverrideProvider: Provider[WixStyleReactDefaultsOverride] = js.native
  
  trait WixStyleReactDefaultsOverride extends StObject {
    
    var button: `19`
    
    var input: `18`
  }
  object WixStyleReactDefaultsOverride {
    
    inline def apply(button: `19`, input: `18`): WixStyleReactDefaultsOverride = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[WixStyleReactDefaultsOverride]
    }
    
    extension [Self <: WixStyleReactDefaultsOverride](x: Self) {
      
      inline def setButton(value: `19`): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setInput(value: `18`): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
}
