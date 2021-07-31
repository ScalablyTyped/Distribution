package typings.wixStyleReact

import typings.csstype.mod.JustifyContentProperty
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composerHeaderMod {
  
  @JSImport("wix-style-react/dist/es/src/ComposerHeader", JSImport.Default)
  @js.native
  class default ()
    extends Component[ComposerHeaderProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/ComposerHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/ComposerHeader", "default.Actions")
    @js.native
    def Actions: SFC[ComposerHeaderActionsProps] = js.native
    @scala.inline
    def Actions_=(x: SFC[ComposerHeaderActionsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Actions")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/ComposerHeader", "default.MainActions")
    @js.native
    def MainActions: SFC[ComposerHeaderMainActionsProps] = js.native
    @scala.inline
    def MainActions_=(x: SFC[ComposerHeaderMainActionsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MainActions")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/ComposerHeader", "default.SaveStatus")
    @js.native
    def SaveStatus: SFC[ComposerHeaderSaveStatusProps] = js.native
    @scala.inline
    def SaveStatus_=(x: SFC[ComposerHeaderSaveStatusProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaveStatus")(x.asInstanceOf[js.Any])
  }
  
  type ComposerHeader = Component[ComposerHeaderProps, js.Object, js.Any]
  
  trait ComposerHeaderActionsProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var justifyContent: js.UndefOr[JustifyContentProperty] = js.undefined
  }
  object ComposerHeaderActionsProps {
    
    @scala.inline
    def apply(): ComposerHeaderActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposerHeaderActionsProps]
    }
    
    @scala.inline
    implicit class ComposerHeaderActionsPropsMutableBuilder[Self <: ComposerHeaderActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setJustifyContent(value: JustifyContentProperty): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    }
  }
  
  trait ComposerHeaderMainActionsProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object ComposerHeaderMainActionsProps {
    
    @scala.inline
    def apply(): ComposerHeaderMainActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposerHeaderMainActionsProps]
    }
    
    @scala.inline
    implicit class ComposerHeaderMainActionsPropsMutableBuilder[Self <: ComposerHeaderMainActionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
  
  trait ComposerHeaderProps extends StObject {
    
    var backButtonValue: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dropShadow: js.UndefOr[Boolean] = js.undefined
    
    var onBackClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
  }
  object ComposerHeaderProps {
    
    @scala.inline
    def apply(): ComposerHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposerHeaderProps]
    }
    
    @scala.inline
    implicit class ComposerHeaderPropsMutableBuilder[Self <: ComposerHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackButtonValue(value: ReactNode): Self = StObject.set(x, "backButtonValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonValueUndefined: Self = StObject.set(x, "backButtonValue", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDropShadow(value: Boolean): Self = StObject.set(x, "dropShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropShadowUndefined: Self = StObject.set(x, "dropShadow", js.undefined)
      
      @scala.inline
      def setOnBackClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onBackClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackClickUndefined: Self = StObject.set(x, "onBackClick", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ComposerHeaderSaveStatusProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var saveStatusError: js.UndefOr[String] = js.undefined
    
    var saveStatusValue: String
    
    var size: js.UndefOr[small | medium] = js.undefined
  }
  object ComposerHeaderSaveStatusProps {
    
    @scala.inline
    def apply(saveStatusValue: String): ComposerHeaderSaveStatusProps = {
      val __obj = js.Dynamic.literal(saveStatusValue = saveStatusValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposerHeaderSaveStatusProps]
    }
    
    @scala.inline
    implicit class ComposerHeaderSaveStatusPropsMutableBuilder[Self <: ComposerHeaderSaveStatusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setSaveStatusError(value: String): Self = StObject.set(x, "saveStatusError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveStatusErrorUndefined: Self = StObject.set(x, "saveStatusError", js.undefined)
      
      @scala.inline
      def setSaveStatusValue(value: String): Self = StObject.set(x, "saveStatusValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
