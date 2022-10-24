package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsAdaptiveHeadingAdaptiveHeadingMod {
  
  /** AdaptiveHeading */
  @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", JSImport.Default)
  @js.native
  open class default protected () extends AdaptiveHeading {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** H1-H6 to create a Heading component, or "tiny" for a bold Text component  */
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes.appearance")
      @js.native
      def appearance: Requireable[String] = js.native
      inline def appearance_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appearance")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Render empty content when there is not enough space for short text */
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes.emptyLast")
      @js.native
      def emptyLast: Requireable[Boolean] = js.native
      inline def emptyLast_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyLast")(x.asInstanceOf[js.Any])
      
      /** Use light theme */
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes.light")
      @js.native
      def light: Requireable[Boolean] = js.native
      inline def light_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
      
      /** Usual (long) version of header*/
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes.text")
      @js.native
      def text: Validator[String] = js.native
      
      /** Short version text */
      @JSImport("wix-style-react/dist/types/utils/AdaptiveHeading/AdaptiveHeading", "default.propTypes.textInShort")
      @js.native
      def textInShort: Requireable[String] = js.native
      inline def textInShort_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textInShort")(x.asInstanceOf[js.Any])
      
      inline def text_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    }
  }
  
  /** AdaptiveHeading */
  @js.native
  trait AdaptiveHeading extends PureComponent[Any, Any, Any]
}
