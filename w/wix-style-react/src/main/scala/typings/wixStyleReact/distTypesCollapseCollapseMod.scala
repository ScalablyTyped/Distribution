package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.MountOnEnter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCollapseCollapseMod {
  
  @JSImport("wix-style-react/dist/types/Collapse/Collapse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /** `<Collapse/>` component is used for hideable content.
      *
      * Easily create accordions or within `<Card/>` to collapse its `<Card.Content/>`.
      */
    inline def apply(param0: MountOnEnter): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Collapse/Collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.defaultProps.mountOnEnter_1")
      @js.native
      val mountOnEnter1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.defaultProps.open_1")
      @js.native
      val open1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.defaultProps.unmountOnExit_1")
      @js.native
      val unmountOnExit1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.mountOnEnter")
      @js.native
      val mountOnEnter: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.onCollapseAnimationEnd")
      @js.native
      val onCollapseAnimationEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.onExpandAnimationEnd")
      @js.native
      val onExpandAnimationEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.open")
      @js.native
      val open: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Collapse/Collapse", "default.propTypes.unmountOnExit")
      @js.native
      val unmountOnExit: Requireable[Boolean] = js.native
    }
  }
  
  inline def getElementHeight(wrapper: Any): js.Function1[/* element */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementHeight")(wrapper.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* element */ Any, Any]]
}
