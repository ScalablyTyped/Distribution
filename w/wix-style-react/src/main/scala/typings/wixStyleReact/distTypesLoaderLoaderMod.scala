package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoaderLoaderMod {
  
  @JSImport("wix-style-react/dist/types/Loader/Loader", JSImport.Default)
  @js.native
  open class default protected () extends Loader {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Loader/Loader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.defaultProps.color")
      @js.native
      def color: String = js.native
      inline def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.defaultProps.status")
      @js.native
      def status: String = js.native
      inline def status_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Loader/Loader", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** The color of the loader */
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes.color")
      @js.native
      def color: Requireable[String] = js.native
      inline def color_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** The size of the loader */
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** The status of the loader */
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes.status")
      @js.native
      def status: Requireable[String] = js.native
      
      /** Text to be shown in the tooltip **/
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes.statusMessage")
      @js.native
      def statusMessage: Requireable[String] = js.native
      inline def statusMessage_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(x.asInstanceOf[js.Any])
      
      inline def status_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
      
      /** Node (usually text) to be shown below the loader */
      @JSImport("wix-style-react/dist/types/Loader/Loader", "default.propTypes.text")
      @js.native
      def text: Requireable[ReactNodeLike] = js.native
      inline def text_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Loader extends PureComponent[Any, Any, Any]
}
