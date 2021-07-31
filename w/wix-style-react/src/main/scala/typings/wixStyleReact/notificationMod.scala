package typings.wixStyleReact

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.wixStyleReact.commonMod.MoveByOffset
import typings.wixStyleReact.tooltipMod.TooltipSize
import typings.wixStyleReact.tooltipMod.TooltipTextAlign
import typings.wixStyleReact.wixStyleReactStrings.button
import typings.wixStyleReact.wixStyleReactStrings.textLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("wix-style-react/dist/es/src/Notification", JSImport.Default)
  @js.native
  class default ()
    extends Component[NotificationProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/Notification", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/Notification", "default.ActionButton")
    @js.native
    def ActionButton: SFC[ActionButtonProps] = js.native
    @scala.inline
    def ActionButton_=(x: SFC[ActionButtonProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActionButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Notification", "default.CloseButton")
    @js.native
    def CloseButton: Instantiable0[typings.wixStyleReact.closeButtonMod.default] = js.native
    @scala.inline
    def CloseButton_=(x: Instantiable0[typings.wixStyleReact.closeButtonMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CloseButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Notification", "default.TextLabel")
    @js.native
    def TextLabel: SFC[TextLabelProps] = js.native
    @scala.inline
    def TextLabel_=(x: SFC[TextLabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextLabel")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.notificationMod.ButtonActionButtonProps
    - typings.wixStyleReact.notificationMod.TextLinkActionButton
  */
  trait ActionButtonProps extends StObject
  object ActionButtonProps {
    
    @scala.inline
    def ButtonActionButtonProps(): typings.wixStyleReact.notificationMod.ButtonActionButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.wixStyleReact.notificationMod.ButtonActionButtonProps]
    }
    
    @scala.inline
    def TextLinkActionButton(): typings.wixStyleReact.notificationMod.TextLinkActionButton = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("textLink")
      __obj.asInstanceOf[typings.wixStyleReact.notificationMod.TextLinkActionButton]
    }
  }
  
  trait ButtonActionButtonProps
    extends StObject
       with ActionButtonProps {
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var `type`: js.UndefOr[button] = js.undefined
  }
  object ButtonActionButtonProps {
    
    @scala.inline
    def apply(): ButtonActionButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonActionButtonProps]
    }
    
    @scala.inline
    implicit class ButtonActionButtonPropsMutableBuilder[Self <: ButtonActionButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setType(value: button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type Notification = Component[NotificationProps, js.Object, js.Any]
  
  trait NotificationProps extends StObject {
    
    var autoHideTimeout: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* source */ String, Unit]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[NotificationTheme] = js.undefined
    
    var `type`: js.UndefOr[NotificationType] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object NotificationProps {
    
    @scala.inline
    def apply(): NotificationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationProps]
    }
    
    @scala.inline
    implicit class NotificationPropsMutableBuilder[Self <: NotificationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHideTimeout(value: Double): Self = StObject.set(x, "autoHideTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideTimeoutUndefined: Self = StObject.set(x, "autoHideTimeout", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* source */ String => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setTheme(value: NotificationTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: NotificationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.premium
  */
  trait NotificationTheme extends StObject
  object NotificationTheme {
    
    @scala.inline
    def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    @scala.inline
    def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    @scala.inline
    def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
    
    @scala.inline
    def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.local
    - typings.wixStyleReact.wixStyleReactStrings.global
    - typings.wixStyleReact.wixStyleReactStrings.sticky
  */
  trait NotificationType extends StObject
  object NotificationType {
    
    @scala.inline
    def global: typings.wixStyleReact.wixStyleReactStrings.global = "global".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.global]
    
    @scala.inline
    def local: typings.wixStyleReact.wixStyleReactStrings.local = "local".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.local]
    
    @scala.inline
    def sticky: typings.wixStyleReact.wixStyleReactStrings.sticky = "sticky".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.sticky]
  }
  
  /* Inlined wix-style-react.wix-style-react/dist/es/src/common/Ellipsis.EllipsisCommonProps & {  children :react.react.ReactNode} */
  trait TextLabelProps extends StObject {
    
    var appendTo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var zIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['zIndex'] */ js.Any
      ] = js.undefined
  }
  object TextLabelProps {
    
    @scala.inline
    def apply(): TextLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextLabelProps]
    }
    
    @scala.inline
    implicit class TextLabelPropsMutableBuilder[Self <: TextLabelProps] (val x: Self) extends AnyVal {
      
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
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      @scala.inline
      def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setZIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['zIndex'] */ js.Any
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait TextLinkActionButton
    extends StObject
       with ActionButtonProps {
    
    var link: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var `type`: textLink
  }
  object TextLinkActionButton {
    
    @scala.inline
    def apply(): TextLinkActionButton = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("textLink")
      __obj.asInstanceOf[TextLinkActionButton]
    }
    
    @scala.inline
    implicit class TextLinkActionButtonMutableBuilder[Self <: TextLinkActionButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: textLink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
