package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidePanelContentContentMod {
  
  @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", JSImport.Default)
  @js.native
  open class default protected () extends Content {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.defaultProps.noPadding")
      @js.native
      def noPadding: Boolean = js.native
      inline def noPadding_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noPadding")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.defaultProps.stretchVertically")
      @js.native
      def stretchVertically: Boolean = js.native
      inline def stretchVertically_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stretchVertically")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Any element to be rendered inside under title */
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Define styles through a classname */
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Remove paddings from the content */
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.propTypes.noPadding")
      @js.native
      def noPadding: Requireable[Boolean] = js.native
      inline def noPadding_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noPadding")(x.asInstanceOf[js.Any])
      
      /** Makes the Content stretch to max height in a container */
      @JSImport("wix-style-react/dist/types/SidePanel/Content/Content", "default.propTypes.stretchVertically")
      @js.native
      def stretchVertically: Requireable[Boolean] = js.native
      inline def stretchVertically_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stretchVertically")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Content extends PureComponent[Any, Any, Any]
}
