package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardContentContentMod {
  
  @JSImport("wix-style-react/dist/types/Card/Content/Content", JSImport.Default)
  @js.native
  open class default protected () extends Content {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Card/Content/Content", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Accepts any component as a child element to display inside the card content area */
      @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute to be used in the tests */
      @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Controls paddings of the content area */
      @JSImport("wix-style-react/dist/types/Card/Content/Content", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Content extends Component[Any, Any, Any] {
    
    def _getChildName(children: Any): Any = js.native
  }
}
