package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DownDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputTickerMod {
  
  object default {
    
    inline def apply(param0: DownDisabled): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Input/Ticker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Input/Ticker", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Input/Ticker", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/Ticker", "default.propTypes.downDisabled")
      @js.native
      val downDisabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/Ticker", "default.propTypes.onDown")
      @js.native
      val onDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/Ticker", "default.propTypes.onMouseDown")
      @js.native
      val onMouseDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/Ticker", "default.propTypes.onUp")
      @js.native
      val onUp: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Input/Ticker", "default.propTypes.upDisabled")
      @js.native
      val upDisabled: Requireable[Boolean] = js.native
    }
  }
}
