package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Controls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardCardMod {
  
  object default {
    
    inline def apply(param0: Controls): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Card/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.defaultProps.showShadow_1")
      @js.native
      val showShadow1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.defaultProps.stretchVertically_1")
      @js.native
      val stretchVertically1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Card/Card", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.controls")
      @js.native
      val controls: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.hideOverflow")
      @js.native
      val hideOverflow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.showShadow")
      @js.native
      val showShadow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Card", "default.propTypes.stretchVertically")
      @js.native
      val stretchVertically: Requireable[Boolean] = js.native
    }
  }
}
