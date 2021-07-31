package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.TooltipCommonProps
import typings.wixStyleReact.inputMod.InputStatus
import typings.wixStyleReact.listItemEditableMod.ListItemEditableMargins
import typings.wixStyleReact.listItemEditableMod.ListItemEditableSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/es/src/ListItemEditable.ListItemEditableProps> */
trait PartialListItemEditablePr extends StObject {
  
  var approveButtonTooltipContent: js.UndefOr[ReactNode] = js.undefined
  
  var approveButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  
  var cancelButtonTooltipContent: js.UndefOr[ReactNode] = js.undefined
  
  var cancelButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var margins: js.UndefOr[ListItemEditableMargins] = js.undefined
  
  var onApprove: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[ListItemEditableSize] = js.undefined
  
  var status: js.UndefOr[InputStatus] = js.undefined
  
  var statusMessage: js.UndefOr[ReactNode] = js.undefined
}
object PartialListItemEditablePr {
  
  @scala.inline
  def apply(): PartialListItemEditablePr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemEditablePr]
  }
  
  @scala.inline
  implicit class PartialListItemEditablePrMutableBuilder[Self <: PartialListItemEditablePr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproveButtonTooltipContent(value: ReactNode): Self = StObject.set(x, "approveButtonTooltipContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveButtonTooltipContentUndefined: Self = StObject.set(x, "approveButtonTooltipContent", js.undefined)
    
    @scala.inline
    def setApproveButtonTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "approveButtonTooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproveButtonTooltipPropsUndefined: Self = StObject.set(x, "approveButtonTooltipProps", js.undefined)
    
    @scala.inline
    def setCancelButtonTooltipContent(value: ReactNode): Self = StObject.set(x, "cancelButtonTooltipContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTooltipContentUndefined: Self = StObject.set(x, "cancelButtonTooltipContent", js.undefined)
    
    @scala.inline
    def setCancelButtonTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "cancelButtonTooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonTooltipPropsUndefined: Self = StObject.set(x, "cancelButtonTooltipProps", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setMargins(value: ListItemEditableMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    @scala.inline
    def setOnApprove(value: /* value */ String => Unit): Self = StObject.set(x, "onApprove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnApproveUndefined: Self = StObject.set(x, "onApprove", js.undefined)
    
    @scala.inline
    def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSize(value: ListItemEditableSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
