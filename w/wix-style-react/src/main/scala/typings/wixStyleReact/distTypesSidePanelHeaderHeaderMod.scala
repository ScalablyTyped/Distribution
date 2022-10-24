package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelHeaderHeaderMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", JSImport.Default)
  @js.native
  open class default protected () extends Header {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.defaultProps.showDivider")
      @js.native
      def showDivider: Boolean = js.native
      inline def showDivider_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDivider")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Any element to be rendered inside under title */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Define styles through a classname */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Tooltip content */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.infoTooltipContent")
      @js.native
      def infoTooltipContent: Requireable[ReactNodeLike] = js.native
      inline def infoTooltipContent_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infoTooltipContent")(x.asInstanceOf[js.Any])
      
      /** Tooltip props */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.infoTooltipProps")
      @js.native
      def infoTooltipProps: Requireable[InferProps[Any]] = js.native
      inline def infoTooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infoTooltipProps")(x.asInstanceOf[js.Any])
      
      /** Show divider */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.showDivider")
      @js.native
      def showDivider: Requireable[Boolean] = js.native
      inline def showDivider_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDivider")(x.asInstanceOf[js.Any])
      
      /** Subtitle */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.subtitle")
      @js.native
      def subtitle: Requireable[ReactNodeLike] = js.native
      inline def subtitle_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      /** Title */
      @JSImport("wix-style-react/dist/types/SidePanel/Header/Header", "default.propTypes.title")
      @js.native
      def title: Requireable[ReactNodeLike] = js.native
      inline def title_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Header extends PureComponent[Any, Any, Any] {
    
    def renderStringTitle(): Element = js.native
    
    def renderSubtitle(): Any = js.native
    
    def renderTitle(onCloseButtonClick: Any): Element = js.native
  }
}
