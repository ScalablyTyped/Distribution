package typings.testingLibraryUserEvent

import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.File
import typings.std.HTMLElement
import typings.std.MouseEventInit
import typings.std.Window
import typings.testingLibraryUserEvent.anon.InitialSelectionEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@testing-library/user-event", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clear(element: TargetElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def click(element: TargetElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def click(element: TargetElement, init: Unit, options: IClickOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def click(element: TargetElement, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def click(element: TargetElement, init: MouseEventInit, options: IClickOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("click")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def dblClick(element: TargetElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def dblClick(element: TargetElement, init: Unit, options: IClickOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def dblClick(element: TargetElement, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def dblClick(element: TargetElement, init: MouseEventInit, options: IClickOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dblClick")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def deselectOptions(element: TargetElement, values: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deselectOptions(element: TargetElement, values: String, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deselectOptions(element: TargetElement, values: js.Array[HTMLElement | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deselectOptions(element: TargetElement, values: js.Array[HTMLElement | String], init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deselectOptions(element: TargetElement, values: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def deselectOptions(element: TargetElement, values: HTMLElement, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deselectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def hover(element: TargetElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def hover(element: TargetElement, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hover")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def paste(element: TargetElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def paste(element: TargetElement, text: String, init: Unit, pasteOptions: InitialSelectionEnd): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], init.asInstanceOf[js.Any], pasteOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def paste(element: TargetElement, text: String, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def paste(element: TargetElement, text: String, init: MouseEventInit, pasteOptions: InitialSelectionEnd): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("paste")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], init.asInstanceOf[js.Any], pasteOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def selectOptions(element: TargetElement, values: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def selectOptions(element: TargetElement, values: String, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def selectOptions(element: TargetElement, values: js.Array[HTMLElement | String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def selectOptions(element: TargetElement, values: js.Array[HTMLElement | String], init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def selectOptions(element: TargetElement, values: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def selectOptions(element: TargetElement, values: HTMLElement, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectOptions")(element.asInstanceOf[js.Any], values.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def tab(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")().asInstanceOf[Unit]
    @scala.inline
    def tab(userOpts: ITabUserOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tab")(userOpts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def `type`[T /* <: ITypeOpts */](element: TargetElement, text: String): Unit | js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Unit]]
    @scala.inline
    def `type`[T /* <: ITypeOpts */](element: TargetElement, text: String, userOpts: T): Unit | js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(element.asInstanceOf[js.Any], text.asInstanceOf[js.Any], userOpts.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Unit]]
    
    @scala.inline
    def unhover(element: TargetElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def unhover(element: TargetElement, init: MouseEventInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unhover")(element.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def upload(element: TargetElement, files: FilesArgument): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def upload(element: TargetElement, files: FilesArgument, init: UploadInitArgument): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], files.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type FilesArgument = File | js.Array[File]
  
  trait IClickOptions extends StObject {
    
    var clickCount: js.UndefOr[Double] = js.undefined
    
    var skipHover: js.UndefOr[Boolean] = js.undefined
  }
  object IClickOptions {
    
    @scala.inline
    def apply(): IClickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IClickOptions]
    }
    
    @scala.inline
    implicit class IClickOptionsMutableBuilder[Self <: IClickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
      
      @scala.inline
      def setSkipHover(value: Boolean): Self = StObject.set(x, "skipHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHoverUndefined: Self = StObject.set(x, "skipHover", js.undefined)
    }
  }
  
  trait ITabUserOptions extends StObject {
    
    var focusTrap: js.UndefOr[Document | Element] = js.undefined
    
    var shift: js.UndefOr[Boolean] = js.undefined
  }
  object ITabUserOptions {
    
    @scala.inline
    def apply(): ITabUserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabUserOptions]
    }
    
    @scala.inline
    implicit class ITabUserOptionsMutableBuilder[Self <: ITabUserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusTrap(value: Document | Element): Self = StObject.set(x, "focusTrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTrapUndefined: Self = StObject.set(x, "focusTrap", js.undefined)
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
    }
  }
  
  trait ITypeOpts extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var initialSelectionEnd: js.UndefOr[Double] = js.undefined
    
    var initialSelectionStart: js.UndefOr[Double] = js.undefined
    
    var skipAutoClose: js.UndefOr[Boolean] = js.undefined
    
    var skipClick: js.UndefOr[Boolean] = js.undefined
  }
  object ITypeOpts {
    
    @scala.inline
    def apply(): ITypeOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITypeOpts]
    }
    
    @scala.inline
    implicit class ITypeOptsMutableBuilder[Self <: ITypeOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setInitialSelectionEnd(value: Double): Self = StObject.set(x, "initialSelectionEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectionEndUndefined: Self = StObject.set(x, "initialSelectionEnd", js.undefined)
      
      @scala.inline
      def setInitialSelectionStart(value: Double): Self = StObject.set(x, "initialSelectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectionStartUndefined: Self = StObject.set(x, "initialSelectionStart", js.undefined)
      
      @scala.inline
      def setSkipAutoClose(value: Boolean): Self = StObject.set(x, "skipAutoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipAutoCloseUndefined: Self = StObject.set(x, "skipAutoClose", js.undefined)
      
      @scala.inline
      def setSkipClick(value: Boolean): Self = StObject.set(x, "skipClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipClickUndefined: Self = StObject.set(x, "skipClick", js.undefined)
    }
  }
  
  type TargetElement = Element | Window
  
  trait UploadInitArgument extends StObject {
    
    var changeInit: js.UndefOr[Event] = js.undefined
    
    var clickInit: js.UndefOr[MouseEventInit] = js.undefined
  }
  object UploadInitArgument {
    
    @scala.inline
    def apply(): UploadInitArgument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadInitArgument]
    }
    
    @scala.inline
    implicit class UploadInitArgumentMutableBuilder[Self <: UploadInitArgument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeInit(value: Event): Self = StObject.set(x, "changeInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeInitUndefined: Self = StObject.set(x, "changeInit", js.undefined)
      
      @scala.inline
      def setClickInit(value: MouseEventInit): Self = StObject.set(x, "clickInit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickInitUndefined: Self = StObject.set(x, "clickInit", js.undefined)
    }
  }
}
