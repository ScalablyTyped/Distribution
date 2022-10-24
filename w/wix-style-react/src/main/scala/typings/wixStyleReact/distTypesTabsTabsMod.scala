package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.wixStyleReact.anon.DictxStringAny
import typings.wixStyleReact.anon.MinWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsTabsMod {
  
  @JSImport("wix-style-react/dist/types/Tabs/Tabs", JSImport.Default)
  @js.native
  open class default protected () extends Tabs {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Tabs/Tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.defaultProps.hasDivider")
      @js.native
      def hasDivider: Boolean = js.native
      inline def hasDivider_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasDivider")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.activeId")
      @js.native
      val activeId: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.hasDivider")
      @js.native
      val hasDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.items")
      @js.native
      val items: Validator[js.Array[js.UndefOr[InferProps[MinWidth] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.minWidth")
      @js.native
      val minWidth: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.sideContent")
      @js.native
      val sideContent: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/Tabs", "default.propTypes.width")
      @js.native
      val width: Requireable[String | Double] = js.native
    }
  }
  
  @js.native
  trait Tabs extends Component[Any, Any, Any] {
    
    def _getTabItemsProps(): DictxStringAny = js.native
  }
}
