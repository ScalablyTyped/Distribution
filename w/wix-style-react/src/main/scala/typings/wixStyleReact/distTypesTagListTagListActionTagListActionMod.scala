package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DictxStringAnyClassNameAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagListTagListActionTagListActionMod {
  
  object default {
    
    inline def apply(param0: DictxStringAnyClassNameAny): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", "default.defaultProps.size")
      @js.native
      val size: String = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", "default.defaultProps.skin")
      @js.native
      val skin: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagListAction/TagListAction", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
}
