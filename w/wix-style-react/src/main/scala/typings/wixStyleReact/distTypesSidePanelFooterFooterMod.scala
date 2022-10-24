package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelFooterFooterMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", JSImport.Default)
  @js.native
  open class default protected () extends Footer {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.defaultProps.noPadding")
      @js.native
      def noPadding: Boolean = js.native
      inline def noPadding_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noPadding")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.defaultProps.showDivider")
      @js.native
      def showDivider: Boolean = js.native
      inline def showDivider_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDivider")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Any element to be rendered inside under title */
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Define styles through a classname */
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Remove paddings from the footer */
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.propTypes.noPadding")
      @js.native
      def noPadding: Requireable[Boolean] = js.native
      inline def noPadding_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noPadding")(x.asInstanceOf[js.Any])
      
      /** Show divider */
      @JSImport("wix-style-react/dist/types/SidePanel/Footer/Footer", "default.propTypes.showDivider")
      @js.native
      def showDivider: Requireable[Boolean] = js.native
      inline def showDivider_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDivider")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Footer extends PureComponent[Any, Any, Any]
}
