package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.OverrideOptionStyleBoolean
import typings.wixStyleReact.anon.Suffix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemSectionListItemSectionMod {
  
  @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** ListItemSection description */
  @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", JSImport.Default)
  @js.native
  open class default protected () extends ListItemSection {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.defaultProps.dataHook")
      @js.native
      def dataHook: String = js.native
      inline def dataHook_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.defaultProps.ellipsis")
      @js.native
      def ellipsis: Boolean = js.native
      inline def ellipsis_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.defaultProps.type")
      @js.native
      val `type`: String = js.native
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** If true, long text won't break into more than one line and will be terminated with an ellipsis */
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.ellipsis")
      @js.native
      def ellipsis: Requireable[Boolean] = js.native
      inline def ellipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      /** A callback function called when suffix is clicked */
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Suffix node. Renders TextButton for a string otherwise the node itself.*/
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[ReactNodeLike] = js.native
      inline def suffix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      /** Text of the list item */
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.title")
      @js.native
      def title: Requireable[String] = js.native
      inline def title_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      /** A list item section can be
        *  * `title` - Acts as a title for following list items.
        *  * `subheader` - Acts as separator between list items for differentiation.
        *  * `whitespace` - Adds some padding between list items.
        *  * `divider` - Same as whitespace, but with a line.
        */
      @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
    }
  }
  
  object TYPES {
    
    @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "TYPES.DIVIDER")
    @js.native
    val DIVIDER: String = js.native
    
    @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "TYPES.SUBHEADER")
    @js.native
    val SUBHEADER: String = js.native
    
    @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "TYPES.TITLE")
    @js.native
    val TITLE: String = js.native
    
    @JSImport("wix-style-react/dist/types/ListItemSection/ListItemSection", "TYPES.WHITESPACE")
    @js.native
    val WHITESPACE: String = js.native
  }
  
  inline def listItemSectionBuilder(param0: Suffix): OverrideOptionStyleBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemSectionBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[OverrideOptionStyleBoolean]
  
  /** ListItemSection description */
  @js.native
  trait ListItemSection extends PureComponent[Any, Any, Any] {
    
    def _renderDivisionElements(children: Any): Element = js.native
    
    def _renderSuffix(): Element = js.native
    
    def _renderTitle(): Element = js.native
  }
}
