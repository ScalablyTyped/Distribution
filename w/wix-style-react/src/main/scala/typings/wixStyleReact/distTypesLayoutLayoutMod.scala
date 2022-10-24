package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AlignItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLayoutLayoutMod {
  
  object default {
    
    inline def apply(param0: AlignItems): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Layout/Layout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.defaultProps.gap_1")
      @js.native
      val gap1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.defaultProps.rowHeight_1")
      @js.native
      val rowHeight1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Layout/Layout", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.alignItems")
      @js.native
      val alignItems: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.cols")
      @js.native
      val cols: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.gap")
      @js.native
      val gap: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.justifyItems")
      @js.native
      val justifyItems: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Layout/Layout", "default.propTypes.rowHeight")
      @js.native
      val rowHeight: Requireable[String] = js.native
    }
  }
}
