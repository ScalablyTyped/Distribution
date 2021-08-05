package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.commonMod.TooltipCommonProps
import typings.wixStyleReact.inputMod.InputStatus
import typings.wixStyleReact.listItemEditableMod.ListItemEditableMargins
import typings.wixStyleReact.listItemEditableMod.ListItemEditableSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveButtonTooltipContent extends StObject {
  
  var approveButtonTooltipContent: js.UndefOr[ReactNode] = js.undefined
  
  var approveButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  
  var cancelButtonTooltipContent: js.UndefOr[ReactNode] = js.undefined
  
  var cancelButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var id: String | Double
  
  var margins: js.UndefOr[ListItemEditableMargins] = js.undefined
  
  def onApprove(value: String): Unit
  
  def onCancel(): Unit
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[ListItemEditableSize] = js.undefined
  
  var status: js.UndefOr[InputStatus] = js.undefined
  
  var statusMessage: js.UndefOr[ReactNode] = js.undefined
}
object ApproveButtonTooltipContent {
  
  inline def apply(id: String | Double, onApprove: String => Unit, onCancel: () => Unit): ApproveButtonTooltipContent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onApprove = js.Any.fromFunction1(onApprove), onCancel = js.Any.fromFunction0(onCancel))
    __obj.asInstanceOf[ApproveButtonTooltipContent]
  }
  
  extension [Self <: ApproveButtonTooltipContent](x: Self) {
    
    inline def setApproveButtonTooltipContent(value: ReactNode): Self = StObject.set(x, "approveButtonTooltipContent", value.asInstanceOf[js.Any])
    
    inline def setApproveButtonTooltipContentUndefined: Self = StObject.set(x, "approveButtonTooltipContent", js.undefined)
    
    inline def setApproveButtonTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "approveButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setApproveButtonTooltipPropsUndefined: Self = StObject.set(x, "approveButtonTooltipProps", js.undefined)
    
    inline def setCancelButtonTooltipContent(value: ReactNode): Self = StObject.set(x, "cancelButtonTooltipContent", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTooltipContentUndefined: Self = StObject.set(x, "cancelButtonTooltipContent", js.undefined)
    
    inline def setCancelButtonTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "cancelButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTooltipPropsUndefined: Self = StObject.set(x, "cancelButtonTooltipProps", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMargins(value: ListItemEditableMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setOnApprove(value: String => Unit): Self = StObject.set(x, "onApprove", js.Any.fromFunction1(value))
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: ListItemEditableSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
