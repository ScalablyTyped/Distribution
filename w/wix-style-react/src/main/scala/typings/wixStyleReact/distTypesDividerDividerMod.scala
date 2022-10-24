package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDividerDividerMod {
  
  /** A component that separates content by a line horizontally or vertically */
  @JSImport("wix-style-react/dist/types/Divider/Divider", JSImport.Default)
  @js.native
  open class default protected () extends Divider {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Divider/Divider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.defaultProps.direction")
      @js.native
      def direction: String = js.native
      inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Divider/Divider", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applies a data-hook HTML attribute that can be used in the tests. */
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Controls divider direction. */
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.propTypes.direction")
      @js.native
      def direction: Requireable[String] = js.native
      inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      /** Sets the skin of the divider. */
      @JSImport("wix-style-react/dist/types/Divider/Divider", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
  }
  
  /** A component that separates content by a line horizontally or vertically */
  @js.native
  trait Divider extends PureComponent[Any, Any, Any]
}
