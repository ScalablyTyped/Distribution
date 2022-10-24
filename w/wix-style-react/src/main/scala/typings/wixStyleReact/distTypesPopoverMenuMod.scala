package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.wixStyleReact.distTypesCommonMod.MoveByOffset
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typings.wixStyleReact.wixStyleReactStrings.dark
import typings.wixStyleReact.wixStyleReactStrings.destructive
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverMenuMod {
  
  @JSImport("wix-style-react/dist/types/PopoverMenu", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PopoverMenuProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/PopoverMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Divider(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")().asInstanceOf[ReactElement]
    inline def Divider(props: PopoverMenuDividerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def MenuItem(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")().asInstanceOf[ReactElement]
    inline def MenuItem(props: PopoverMenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type PopoverMenu = PureComponent[PopoverMenuProps, js.Object, Any]
  
  trait PopoverMenuDividerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object PopoverMenuDividerProps {
    
    inline def apply(): PopoverMenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuDividerProps]
    }
    
    extension [Self <: PopoverMenuDividerProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
  
  trait PopoverMenuItemProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var prefixIcon: js.UndefOr[ReactNode] = js.undefined
    
    var skin: js.UndefOr[dark | destructive] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var suffixIcon: js.UndefOr[ReactNode] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object PopoverMenuItemProps {
    
    inline def apply(): PopoverMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuItemProps]
    }
    
    extension [Self <: PopoverMenuItemProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(value: () => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixIcon(value: ReactNode): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setSkin(value: dark | destructive): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSuffixIcon(value: ReactNode): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait PopoverMenuProps extends StObject {
    
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var minWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
      ] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var textSize: js.UndefOr[small | medium] = js.undefined
    
    var triggerElement: ReactNode | FC[PopoverTriggerElementProps]
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopoverMenuProps {
    
    inline def apply(): PopoverMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuProps]
    }
    
    extension [Self <: PopoverMenuProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setTextSize(value: small | medium): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      inline def setTriggerElement(value: ReactNode | FC[PopoverTriggerElementProps]): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
      
      inline def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PopoverTriggerElementProps extends StObject {
    
    def close(event: SyntheticEvent[Element, Event]): Unit
    
    var isOpen: Boolean
    
    def onClick(): Unit
    
    def open(): Unit
    
    def toggle(): Unit
  }
  object PopoverTriggerElementProps {
    
    inline def apply(
      close: SyntheticEvent[Element, Event] => Unit,
      isOpen: Boolean,
      onClick: () => Unit,
      open: () => Unit,
      toggle: () => Unit
    ): PopoverTriggerElementProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), isOpen = isOpen.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[PopoverTriggerElementProps]
    }
    
    extension [Self <: PopoverTriggerElementProps](x: Self) {
      
      inline def setClose(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
