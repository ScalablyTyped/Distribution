package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.RemoveVerticalPadding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableToolbarTableToolbarMod {
  
  object default {
    
    inline def apply(param0: RemoveVerticalPadding): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/TableToolbar/TableToolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/TableToolbar/TableToolbar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TableToolbar/TableToolbar", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TableToolbar/TableToolbar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TableToolbar/TableToolbar", "default.propTypes.removeVerticalPadding")
      @js.native
      val removeVerticalPadding: Requireable[Boolean] = js.native
    }
  }
}
