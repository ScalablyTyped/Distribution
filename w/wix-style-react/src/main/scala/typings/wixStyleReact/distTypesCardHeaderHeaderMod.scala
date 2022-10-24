package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardHeaderHeaderMod {
  
  @JSImport("wix-style-react/dist/types/Card/Header/Header", JSImport.Default)
  @js.native
  open class default protected () extends Header {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Card/Header/Header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Specifies a CSS class name to be appended to the component’s root element. */
      @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute to be used in the tests */
      @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Sets card subtitle text value. Subtitle can also be overridden to any other component. */
      @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.propTypes.subtitle")
      @js.native
      def subtitle: Requireable[ReactNodeLike] = js.native
      inline def subtitle_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      /** Adds an empty container on the right side of a header. Used to store action buttons or other components. */
      @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[ReactNodeLike] = js.native
      inline def suffix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      /** Sets card title text value. Title can also be overridden to any other component. */
      @JSImport("wix-style-react/dist/types/Card/Header/Header", "default.propTypes.title")
      @js.native
      def title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def title_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Header extends PureComponent[Any, Any, Any]
}
