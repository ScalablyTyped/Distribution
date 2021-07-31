package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.wixStyleReact.commonMod.MoveByOffset
import typings.wixStyleReact.wixStyleReactStrings.dark
import typings.wixStyleReact.wixStyleReactStrings.destructive
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMenuMod {
  
  @JSImport("wix-style-react/dist/es/src/PopoverMenu", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[PopoverMenuProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/PopoverMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Divider(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")().asInstanceOf[ReactElement]
    @scala.inline
    def Divider(props: PopoverMenuDividerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @scala.inline
    def MenuItem(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")().asInstanceOf[ReactElement]
    @scala.inline
    def MenuItem(props: PopoverMenuItemProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type PopoverMenu = PureComponent[PopoverMenuProps, js.Object, js.Any]
  
  trait PopoverMenuDividerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object PopoverMenuDividerProps {
    
    @scala.inline
    def apply(): PopoverMenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuDividerProps]
    }
    
    @scala.inline
    implicit class PopoverMenuDividerPropsMutableBuilder[Self <: PopoverMenuDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
  
  trait PopoverMenuItemProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var prefixIcon: js.UndefOr[ReactNode] = js.undefined
    
    var skin: js.UndefOr[dark | destructive] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[ReactNode] = js.undefined
  }
  object PopoverMenuItemProps {
    
    @scala.inline
    def apply(): PopoverMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuItemProps]
    }
    
    @scala.inline
    implicit class PopoverMenuItemPropsMutableBuilder[Self <: PopoverMenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixIcon(value: ReactNode): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      @scala.inline
      def setSkin(value: dark | destructive): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait PopoverMenuProps extends StObject {
    
    var appendTo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var minWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
      ] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var textSize: js.UndefOr[small | medium] = js.undefined
    
    var triggerElement: ReactNode | FC[PopoverTriggerElementProps]
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopoverMenuProps {
    
    @scala.inline
    def apply(): PopoverMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuProps]
    }
    
    @scala.inline
    implicit class PopoverMenuPropsMutableBuilder[Self <: PopoverMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setTextSize(value: small | medium): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      @scala.inline
      def setTriggerElement(value: ReactNode | FC[PopoverTriggerElementProps]): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerElementUndefined: Self = StObject.set(x, "triggerElement", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PopoverTriggerElementProps extends StObject {
    
    def close(event: SyntheticEvent[Element, Event]): Unit
    
    def onClick(): Unit
    
    def open(): Unit
    
    def toggle(): Unit
  }
  object PopoverTriggerElementProps {
    
    @scala.inline
    def apply(
      close: SyntheticEvent[Element, Event] => Unit,
      onClick: () => Unit,
      open: () => Unit,
      toggle: () => Unit
    ): PopoverTriggerElementProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), onClick = js.Any.fromFunction0(onClick), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[PopoverTriggerElementProps]
    }
    
    @scala.inline
    implicit class PopoverTriggerElementPropsMutableBuilder[Self <: PopoverTriggerElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
