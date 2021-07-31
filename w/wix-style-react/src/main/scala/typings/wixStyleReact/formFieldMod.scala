package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.SetCharactersLeft
import typings.wixStyleReact.commonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formFieldMod {
  
  @JSImport("wix-style-react/dist/es/src/FormField", JSImport.Default)
  @js.native
  class default ()
    extends Component[FormFieldProps, js.Object, js.Any]
  
  type CharactersLeftFn = js.Function1[/* lengthLeft */ Double, Unit]
  
  type FormField = Component[FormFieldProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.top
    - typings.wixStyleReact.wixStyleReactStrings.right
    - typings.wixStyleReact.wixStyleReactStrings.left
  */
  trait FormFieldLabelPlacement extends StObject
  object FormFieldLabelPlacement {
    
    @scala.inline
    def left: typings.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.left]
    
    @scala.inline
    def right: typings.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.right]
    
    @scala.inline
    def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
  
  trait FormFieldProps extends StObject {
    
    var charCount: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* data */ SetCharactersLeft, ReactNode])] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infoContent: js.UndefOr[ReactNode] = js.undefined
    
    var infoTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelAlignment: js.UndefOr[LabelAlignment] = js.undefined
    
    var labelPlacement: js.UndefOr[FormFieldLabelPlacement] = js.undefined
    
    var labelSize: js.UndefOr[LabelPlacement] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var stretchContent: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
  }
  object FormFieldProps {
    
    @scala.inline
    def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    @scala.inline
    implicit class FormFieldPropsMutableBuilder[Self <: FormFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharCount(value: Double): Self = StObject.set(x, "charCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharCountUndefined: Self = StObject.set(x, "charCount", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode | (js.Function1[/* data */ SetCharactersLeft, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* data */ SetCharactersLeft => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInfoContent(value: ReactNode): Self = StObject.set(x, "infoContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoContentUndefined: Self = StObject.set(x, "infoContent", js.undefined)
      
      @scala.inline
      def setInfoTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignment(value: LabelAlignment): Self = StObject.set(x, "labelAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignmentUndefined: Self = StObject.set(x, "labelAlignment", js.undefined)
      
      @scala.inline
      def setLabelPlacement(value: FormFieldLabelPlacement): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setLabelSize(value: LabelPlacement): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelSizeUndefined: Self = StObject.set(x, "labelSize", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStretchContent(value: Boolean): Self = StObject.set(x, "stretchContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchContentUndefined: Self = StObject.set(x, "stretchContent", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.middle
    - typings.wixStyleReact.wixStyleReactStrings.top
  */
  trait LabelAlignment extends StObject
  object LabelAlignment {
    
    @scala.inline
    def middle: typings.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.middle]
    
    @scala.inline
    def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait LabelPlacement extends StObject
  object LabelPlacement {
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
