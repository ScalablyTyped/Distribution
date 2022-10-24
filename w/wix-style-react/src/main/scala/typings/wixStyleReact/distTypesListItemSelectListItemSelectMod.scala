package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Checkbox
import typings.wixStyleReact.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemSelectListItemSelectMod {
  
  @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** ListItemSelect description */
  @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", JSImport.Default)
  @js.native
  open class default protected () extends ListItemSelect {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps.checkbox")
      @js.native
      def checkbox: Boolean = js.native
      inline def checkbox_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps.dataHook")
      @js.native
      def dataHook: String = js.native
      inline def dataHook_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps.ellipsis")
      @js.native
      def ellipsis: Boolean = js.native
      inline def ellipsis_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps.highlighted")
      @js.native
      def highlighted: Boolean = js.native
      inline def highlighted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps.selected")
      @js.native
      def selected: Boolean = js.native
      inline def selected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** If true, a checkbox will be shown */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.checkbox")
      @js.native
      def checkbox: Requireable[Boolean] = js.native
      inline def checkbox_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(x.asInstanceOf[js.Any])
      
      /** A css class to be applied to the component's root element */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** If true, the item is disabled */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** If true, long text won't break into more than one line and will be terminated with an ellipsis */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.ellipsis")
      @js.native
      def ellipsis: Requireable[Boolean] = js.native
      inline def ellipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      /** If true, the item is highlighted */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.highlighted")
      @js.native
      def highlighted: Requireable[Boolean] = js.native
      inline def highlighted_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlighted")(x.asInstanceOf[js.Any])
      
      /** Callback function triggered when list item is clicked */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Any prefix */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.prefix")
      @js.native
      def prefix: Requireable[ReactNodeLike] = js.native
      inline def prefix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
      
      /** If true, the item is selected */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.selected")
      @js.native
      def selected: Requireable[Boolean] = js.native
      inline def selected_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      /** Changing text size */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Text of the list item subtitle */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.subtitle")
      @js.native
      def subtitle: Requireable[ReactNodeLike] = js.native
      inline def subtitle_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      /** Any suffix */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[ReactNodeLike] = js.native
      inline def suffix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      /** Title of the list item */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.title")
      @js.native
      def title: Requireable[ReactNodeLike] = js.native
      inline def title_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      /** Allows to pass all common tooltip props. Check `<Tooltip/>` for a full API. */
      @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "default.propTypes.tooltipProps")
      @js.native
      def tooltipProps: Requireable[InferProps[Any]] = js.native
      inline def tooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
    }
  }
  
  object SIZES {
    
    @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "SIZES.medium")
    @js.native
    val medium: String = js.native
    
    @JSImport("wix-style-react/dist/types/ListItemSelect/ListItemSelect", "SIZES.small")
    @js.native
    val small: String = js.native
  }
  
  inline def listItemSelectBuilder(param0: Checkbox): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemSelectBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[Label]
  
  /** ListItemSelect description */
  @js.native
  trait ListItemSelect extends PureComponent[Any, Any, Any] {
    
    def _renderContent(): Element = js.native
    
    def _renderTitle(textProps: Any): Element = js.native
  }
}
