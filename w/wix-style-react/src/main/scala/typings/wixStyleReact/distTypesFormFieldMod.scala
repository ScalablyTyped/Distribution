package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.SetCharactersLeftCharactersLeftFn
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldMod {
  
  @JSImport("wix-style-react/dist/types/FormField", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FormFieldProps, js.Object, Any]
  
  type CharactersLeftFn = js.Function1[/* lengthLeft */ Double, Unit]
  
  type FormField = Component[FormFieldProps, js.Object, Any]
  
  trait FormFieldProps extends StObject {
    
    var charCount: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[
        ReactNode | (js.Function1[/* data */ SetCharactersLeftCharactersLeftFn, ReactNode])
      ] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infoContent: js.UndefOr[ReactNode] = js.undefined
    
    var infoTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var labelAlignment: js.UndefOr[LabelAlignment] = js.undefined
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var labelPlacement: js.UndefOr[LabelPlacement] = js.undefined
    
    var labelSize: js.UndefOr[LabelSize] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[StatusType] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var stretchContent: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
  }
  object FormFieldProps {
    
    inline def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    extension [Self <: FormFieldProps](x: Self) {
      
      inline def setCharCount(value: Double): Self = StObject.set(x, "charCount", value.asInstanceOf[js.Any])
      
      inline def setCharCountUndefined: Self = StObject.set(x, "charCount", js.undefined)
      
      inline def setChildren(value: ReactNode | (js.Function1[/* data */ SetCharactersLeftCharactersLeftFn, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ SetCharactersLeftCharactersLeftFn => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfoContent(value: ReactNode): Self = StObject.set(x, "infoContent", value.asInstanceOf[js.Any])
      
      inline def setInfoContentUndefined: Self = StObject.set(x, "infoContent", js.undefined)
      
      inline def setInfoTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignment(value: LabelAlignment): Self = StObject.set(x, "labelAlignment", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignmentUndefined: Self = StObject.set(x, "labelAlignment", js.undefined)
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setLabelPlacement(value: LabelPlacement): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelSize(value: LabelSize): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
      
      inline def setLabelSizeUndefined: Self = StObject.set(x, "labelSize", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStretchContent(value: Boolean): Self = StObject.set(x, "stretchContent", value.asInstanceOf[js.Any])
      
      inline def setStretchContentUndefined: Self = StObject.set(x, "stretchContent", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.middle
    - typings.wixStyleReact.wixStyleReactStrings.top
  */
  trait LabelAlignment extends StObject
  object LabelAlignment {
    
    inline def middle: typings.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.middle]
    
    inline def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.top
    - typings.wixStyleReact.wixStyleReactStrings.right
    - typings.wixStyleReact.wixStyleReactStrings.left
  */
  trait LabelPlacement extends StObject
  object LabelPlacement {
    
    inline def left: typings.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.left]
    
    inline def right: typings.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.right]
    
    inline def top: typings.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
  */
  trait LabelSize extends StObject
  object LabelSize {
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.loading
  */
  trait StatusType extends StObject
  object StatusType {
    
    inline def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typings.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
}
