package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixStyleReact.anon.DisabledOnClick
import typings.wixStyleReact.anon.OmitPolyfillPopoverMenuPr
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonWithAsProp
import typings.wixStyleReact.distTypesCommonMod.IconElement
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableActionCellMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/TableActionCell", JSImport.Default)
  @js.native
  val default: FC[TableActionCellProps] = js.native
  
  @JSImport("wix-style-react/dist/types/TableActionCell", "TableActionCell")
  @js.native
  val TableActionCell: FC[TableActionCellProps] = js.native
  
  trait CommonTableActionCellProps extends StObject {
    
    var alwaysShowSecondaryActions: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var moreActionsTooltipText: js.UndefOr[String] = js.undefined
    
    var numOfVisibleSecondaryActions: js.UndefOr[Double] = js.undefined
    
    var primaryAction: js.UndefOr[TableActionCellPrimaryAction] = js.undefined
    
    var secondaryActions: js.UndefOr[js.Array[TableActionCellSecondaryAction | TableActionCellSecondaryDivider]] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
  }
  object CommonTableActionCellProps {
    
    inline def apply(): CommonTableActionCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonTableActionCellProps]
    }
    
    extension [Self <: CommonTableActionCellProps](x: Self) {
      
      inline def setAlwaysShowSecondaryActions(value: Boolean): Self = StObject.set(x, "alwaysShowSecondaryActions", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowSecondaryActionsUndefined: Self = StObject.set(x, "alwaysShowSecondaryActions", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMoreActionsTooltipText(value: String): Self = StObject.set(x, "moreActionsTooltipText", value.asInstanceOf[js.Any])
      
      inline def setMoreActionsTooltipTextUndefined: Self = StObject.set(x, "moreActionsTooltipText", js.undefined)
      
      inline def setNumOfVisibleSecondaryActions(value: Double): Self = StObject.set(x, "numOfVisibleSecondaryActions", value.asInstanceOf[js.Any])
      
      inline def setNumOfVisibleSecondaryActionsUndefined: Self = StObject.set(x, "numOfVisibleSecondaryActions", js.undefined)
      
      inline def setPrimaryAction(value: TableActionCellPrimaryAction): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
      
      inline def setSecondaryActions(value: js.Array[TableActionCellSecondaryAction | TableActionCellSecondaryDivider]): Self = StObject.set(x, "secondaryActions", value.asInstanceOf[js.Any])
      
      inline def setSecondaryActionsUndefined: Self = StObject.set(x, "secondaryActions", js.undefined)
      
      inline def setSecondaryActionsVarargs(value: (TableActionCellSecondaryAction | TableActionCellSecondaryDivider)*): Self = StObject.set(x, "secondaryActions", js.Array(value*))
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type TableActionCellPrimaryAction = ButtonWithAsProp[DisabledOnClick]
  
  trait TableActionCellProps
    extends StObject
       with CommonTableActionCellProps {
    
    var popoverMenuProps: js.UndefOr[OmitPolyfillPopoverMenuPr] = js.undefined
  }
  object TableActionCellProps {
    
    inline def apply(): TableActionCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableActionCellProps]
    }
    
    extension [Self <: TableActionCellProps](x: Self) {
      
      inline def setPopoverMenuProps(value: OmitPolyfillPopoverMenuPr): Self = StObject.set(x, "popoverMenuProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverMenuPropsUndefined: Self = StObject.set(x, "popoverMenuProps", js.undefined)
    }
  }
  
  trait TableActionCellSecondaryAction extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledDescription: js.UndefOr[String] = js.undefined
    
    var icon: IconElement
    
    def onClick(): Unit
    
    var text: String
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object TableActionCellSecondaryAction {
    
    inline def apply(icon: IconElement, onClick: () => Unit, text: String): TableActionCellSecondaryAction = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableActionCellSecondaryAction]
    }
    
    extension [Self <: TableActionCellSecondaryAction](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledDescription(value: String): Self = StObject.set(x, "disabledDescription", value.asInstanceOf[js.Any])
      
      inline def setDisabledDescriptionUndefined: Self = StObject.set(x, "disabledDescription", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: IconElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  trait TableActionCellSecondaryDivider extends StObject {
    
    var divider: Boolean
  }
  object TableActionCellSecondaryDivider {
    
    inline def apply(divider: Boolean): TableActionCellSecondaryDivider = {
      val __obj = js.Dynamic.literal(divider = divider.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableActionCellSecondaryDivider]
    }
    
    extension [Self <: TableActionCellSecondaryDivider](x: Self) {
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[TableActionCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTableActionCellMod.foo` */
  override def _to: FC[TableActionCellProps] = default
}
