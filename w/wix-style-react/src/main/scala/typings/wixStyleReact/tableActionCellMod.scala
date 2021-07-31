package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixStyleReact.anon.OmitPolyfillPopoverMenuPr
import typings.wixStyleReact.commonMod.IconElement
import typings.wixStyleReact.commonMod.TooltipCommonProps
import typings.wixStyleReact.wixStyleReactStrings.inverted
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableActionCellMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/TableActionCell", JSImport.Default)
  @js.native
  val default: SFC[TableActionCellProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/TableActionCell", "TableActionCell")
  @js.native
  val TableActionCell: SFC[TableActionCellProps] = js.native
  
  trait CommonTableActionCellProps extends StObject {
    
    var alwaysShowSecondaryActions: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var numOfVisibleSecondaryActions: js.UndefOr[Double] = js.undefined
    
    var primaryAction: js.UndefOr[TableActionCellPrimaryAction] = js.undefined
    
    var secondaryActions: js.UndefOr[js.Array[TableActionCellSecondaryAction]] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
  }
  object CommonTableActionCellProps {
    
    @scala.inline
    def apply(): CommonTableActionCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonTableActionCellProps]
    }
    
    @scala.inline
    implicit class CommonTableActionCellPropsMutableBuilder[Self <: CommonTableActionCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowSecondaryActions(value: Boolean): Self = StObject.set(x, "alwaysShowSecondaryActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowSecondaryActionsUndefined: Self = StObject.set(x, "alwaysShowSecondaryActions", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setNumOfVisibleSecondaryActions(value: Double): Self = StObject.set(x, "numOfVisibleSecondaryActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOfVisibleSecondaryActionsUndefined: Self = StObject.set(x, "numOfVisibleSecondaryActions", js.undefined)
      
      @scala.inline
      def setPrimaryAction(value: TableActionCellPrimaryAction): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
      
      @scala.inline
      def setSecondaryActions(value: js.Array[TableActionCellSecondaryAction]): Self = StObject.set(x, "secondaryActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryActionsUndefined: Self = StObject.set(x, "secondaryActions", js.undefined)
      
      @scala.inline
      def setSecondaryActionsVarargs(value: TableActionCellSecondaryAction*): Self = StObject.set(x, "secondaryActions", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TableActionCellPrimaryAction extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    def onClick(): Unit
    
    var skin: js.UndefOr[standard | inverted] = js.undefined
    
    var text: String
  }
  object TableActionCellPrimaryAction {
    
    @scala.inline
    def apply(onClick: () => Unit, text: String): TableActionCellPrimaryAction = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableActionCellPrimaryAction]
    }
    
    @scala.inline
    implicit class TableActionCellPrimaryActionMutableBuilder[Self <: TableActionCellPrimaryAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSkin(value: standard | inverted): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableActionCellProps
    extends StObject
       with CommonTableActionCellProps {
    
    var popoverMenuProps: js.UndefOr[OmitPolyfillPopoverMenuPr] = js.undefined
  }
  object TableActionCellProps {
    
    @scala.inline
    def apply(): TableActionCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableActionCellProps]
    }
    
    @scala.inline
    implicit class TableActionCellPropsMutableBuilder[Self <: TableActionCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopoverMenuProps(value: OmitPolyfillPopoverMenuPr): Self = StObject.set(x, "popoverMenuProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverMenuPropsUndefined: Self = StObject.set(x, "popoverMenuProps", js.undefined)
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
    
    @scala.inline
    def apply(icon: IconElement, onClick: () => Unit, text: String): TableActionCellSecondaryAction = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableActionCellSecondaryAction]
    }
    
    @scala.inline
    implicit class TableActionCellSecondaryActionMutableBuilder[Self <: TableActionCellSecondaryAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDescription(value: String): Self = StObject.set(x, "disabledDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledDescriptionUndefined: Self = StObject.set(x, "disabledDescription", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: IconElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  type _To = SFC[TableActionCellProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableActionCellMod.foo` */
  override def _to: SFC[TableActionCellProps] = default
}
