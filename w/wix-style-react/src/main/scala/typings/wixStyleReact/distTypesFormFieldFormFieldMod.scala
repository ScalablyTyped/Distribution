package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.LabelSize
import typings.wixStyleReact.anon.LengthLeft
import typings.wixStyleReact.anon.SetCharactersLeft
import typings.wixStyleReact.anon.TrimLongText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldFormFieldMod {
  
  @JSImport("wix-style-react/dist/types/FormField/FormField", JSImport.Default)
  @js.native
  open class default protected () extends FormField {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/FormField/FormField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.defaultProps.labelAlignment")
      @js.native
      def labelAlignment: String = js.native
      inline def labelAlignment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlignment")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.defaultProps.labelPlacement")
      @js.native
      def labelPlacement: String = js.native
      inline def labelPlacement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.defaultProps.labelSize")
      @js.native
      def labelSize: String = js.native
      inline def labelSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSize")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.defaultProps.required")
      @js.native
      def required: Boolean = js.native
      inline def required_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.defaultProps.stretchContent")
      @js.native
      def stretchContent: Boolean = js.native
      inline def stretchContent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stretchContent")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/FormField/FormField", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Sets the maximum length for the field value. Character count is displayed in the top right corner of a component. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.charCount")
      @js.native
      def charCount: Requireable[Double] = js.native
      inline def charCount_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charCount")(x.asInstanceOf[js.Any])
      
      /** when function, it receives object with:
        * * `setCharactersLeft` - function accepts a number and will display it on top right of `FormField` component
        *
        * Note that alternatively you can also use `charCount` prop to display character count
        * instead of using the render function method.
        */
      /** Accept any kind of component as a child element. A child should be a form element like an Input, InputArea, Dropdown or RichTextArea. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.children")
      @js.native
      def children: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
      inline def children_=(
        x: Requireable[
              String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in tests. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Adds a string used to match text labels with FormField children items. E.g.
        *
        * ```js
        * <FormField id="myFormField" label="Hello">
        *   <Input id="myFormField"/>
        * </FormField>
        * ```
        */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      /** Displays a passed info message in a tooltip. Default value is a text string, but it can also be overridden with any other component. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.infoContent")
      @js.native
      def infoContent: Requireable[ReactNodeLike] = js.native
      inline def infoContent_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infoContent")(x.asInstanceOf[js.Any])
      
      /** Allows control over the tooltip style and behaviour by passed tooltip properties. Check <Tooltip/> API for a full list. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.infoTooltipProps")
      @js.native
      def infoTooltipProps: Requireable[InferProps[Any]] = js.native
      inline def infoTooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infoTooltipProps")(x.asInstanceOf[js.Any])
      
      /** Sets a field label. It’s default value is a text string, but it can be overridden with any other component. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.label")
      @js.native
      def label: Requireable[ReactNodeLike] = js.native
      
      /** Controls the label alignment */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.labelAlignment")
      @js.native
      def labelAlignment: Requireable[String] = js.native
      inline def labelAlignment_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlignment")(x.asInstanceOf[js.Any])
      
      /** Sets the id of the label */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.labelId")
      @js.native
      def labelId: Requireable[String] = js.native
      inline def labelId_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelId")(x.asInstanceOf[js.Any])
      
      /** Controls the label placement */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.labelPlacement")
      @js.native
      def labelPlacement: Requireable[String] = js.native
      inline def labelPlacement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(x.asInstanceOf[js.Any])
      
      /** Controls the size of label */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.labelSize")
      @js.native
      def labelSize: Requireable[String] = js.native
      inline def labelSize_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSize")(x.asInstanceOf[js.Any])
      
      inline def label_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
      
      /** Marks a field as mandatory with an asterisk (*) at the end of a label. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.required")
      @js.native
      def required: Requireable[Boolean] = js.native
      inline def required_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("required")(x.asInstanceOf[js.Any])
      
      /** Sets the type of status message, to give it appropriate colors and icons */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.status")
      @js.native
      def status: Requireable[String] = js.native
      
      /** Sets the status message. It is displayed bellow the child component*/
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.statusMessage")
      @js.native
      def statusMessage: Requireable[ReactNodeLike] = js.native
      inline def statusMessage_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(x.asInstanceOf[js.Any])
      
      inline def status_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("status")(x.asInstanceOf[js.Any])
      
      /** Defines whether or not the content (children container) grows when there's space available. Otherwise, it only uses the necessary space. */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.stretchContent")
      @js.native
      def stretchContent: Requireable[Boolean] = js.native
      inline def stretchContent_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stretchContent")(x.asInstanceOf[js.Any])
      
      /** Adds a custom element at the end of the label row (it overrides the charCount in case it's provided). */
      @JSImport("wix-style-react/dist/types/FormField/FormField", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[ReactNodeLike] = js.native
      inline def suffix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormField extends Component[Any, Any, Any] {
    
    def _hasCharCounter(): Boolean = js.native
    
    def _hasInlineElements(label: Any, labelPlacement: Any): Any = js.native
    
    def _renderCharCounter(): js.UndefOr[Element] = js.native
    
    def _renderChildren(): Any = js.native
    
    def _renderInfoIcon(): Any = js.native
    
    def _renderLabel(param0: TrimLongText): Element = js.native
    
    def _renderLabelWithIndicators(param0: LabelSize): Element = js.native
    
    def _renderStatusIcon(): Element = js.native
    
    def _renderStatusMessage(): Element = js.native
    
    def _renderSuffix(): Any = js.native
    
    var childrenRenderPropInterface: SetCharactersLeft = js.native
    
    var labelId: Any = js.native
    
    @JSName("state")
    var state_FormField: LengthLeft = js.native
    
    var statusId: String = js.native
  }
}
