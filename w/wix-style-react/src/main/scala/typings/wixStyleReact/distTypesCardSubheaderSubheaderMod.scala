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

object distTypesCardSubheaderSubheaderMod {
  
  @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", JSImport.Default)
  @js.native
  open class default protected () extends Subheader {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applies a data-hook HTML attribute to be used in the tests */
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Controls the background color of a subheader  */
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Adds an empty container on the right side of a subheader. Commonly used to store action buttons or an info icon. */
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[ReactNodeLike] = js.native
      inline def suffix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      /** Sets a title text value. Title can also be overridden to any other component. */
      @JSImport("wix-style-react/dist/types/Card/Subheader/Subheader", "default.propTypes.title")
      @js.native
      def title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def title_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Subheader extends PureComponent[Any, Any, Any]
}
