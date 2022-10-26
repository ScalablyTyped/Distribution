package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.ApproveButtonTooltipProps
import typings.wixStyleReact.anon.`11`
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typings.wixStyleReact.distTypesInputMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemEditableMod {
  
  @JSImport("wix-style-react/dist/types/ListItemEditable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/ListItemEditable", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ListItemEditableProps, js.Object, Any]
  
  @js.native
  sealed trait ListItemEditableMargins extends StObject
  @JSImport("wix-style-react/dist/types/ListItemEditable", "ListItemEditableMargins")
  @js.native
  object ListItemEditableMargins extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListItemEditableMargins & String] = js.native
    
    @js.native
    sealed trait LIST_ITEM
      extends StObject
         with ListItemEditableMargins
    /* "list-item" */ val LIST_ITEM: typings.wixStyleReact.distTypesListItemEditableMod.ListItemEditableMargins.LIST_ITEM & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with ListItemEditableMargins
    /* "none" */ val NONE: typings.wixStyleReact.distTypesListItemEditableMod.ListItemEditableMargins.NONE & String = js.native
  }
  
  @js.native
  sealed trait ListItemEditableSize extends StObject
  @JSImport("wix-style-react/dist/types/ListItemEditable", "ListItemEditableSize")
  @js.native
  object ListItemEditableSize extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListItemEditableSize & String] = js.native
    
    @js.native
    sealed trait MEDIUM
      extends StObject
         with ListItemEditableSize
    /* "medium" */ val MEDIUM: typings.wixStyleReact.distTypesListItemEditableMod.ListItemEditableSize.MEDIUM & String = js.native
    
    @js.native
    sealed trait SMALL
      extends StObject
         with ListItemEditableSize
    /* "small" */ val SMALL: typings.wixStyleReact.distTypesListItemEditableMod.ListItemEditableSize.SMALL & String = js.native
  }
  
  inline def listItemEditableBuilder(data: ApproveButtonTooltipProps): `11` = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemEditableBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[`11`]
  
  type ListItemEditable = PureComponent[ListItemEditableProps, js.Object, Any]
  
  trait ListItemEditableProps extends StObject {
    
    var approveButtonTooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var approveButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var cancelButtonTooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var cancelButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var margins: js.UndefOr[ListItemEditableMargins] = js.undefined
    
    def onApprove(value: String): Unit
    
    def onCancel(): Unit
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[ListItemEditableSize] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
  }
  object ListItemEditableProps {
    
    inline def apply(onApprove: String => Unit, onCancel: () => Unit): ListItemEditableProps = {
      val __obj = js.Dynamic.literal(onApprove = js.Any.fromFunction1(onApprove), onCancel = js.Any.fromFunction0(onCancel))
      __obj.asInstanceOf[ListItemEditableProps]
    }
    
    extension [Self <: ListItemEditableProps](x: Self) {
      
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
}
