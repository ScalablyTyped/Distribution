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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@testing-library/user-event", "default.clear")
    @js.native
    def clear(element: TargetElement): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.click")
    @js.native
    def click(element: TargetElement): Unit = js.native
    @JSImport("@testing-library/user-event", "default.click")
    @js.native
    def click(element: TargetElement, init: js.UndefOr[scala.Nothing], options: IClickOptions): Unit = js.native
    @JSImport("@testing-library/user-event", "default.click")
    @js.native
    def click(element: TargetElement, init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.click")
    @js.native
    def click(element: TargetElement, init: MouseEventInit, options: IClickOptions): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.dblClick")
    @js.native
    def dblClick(element: TargetElement): Unit = js.native
    @JSImport("@testing-library/user-event", "default.dblClick")
    @js.native
    def dblClick(element: TargetElement, init: js.UndefOr[scala.Nothing], options: IClickOptions): Unit = js.native
    @JSImport("@testing-library/user-event", "default.dblClick")
    @js.native
    def dblClick(element: TargetElement, init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.dblClick")
    @js.native
    def dblClick(element: TargetElement, init: MouseEventInit, options: IClickOptions): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.deselectOptions")
    @js.native
    def deselectOptions(element: TargetElement, values: String): Unit = js.native
    @JSImport("@testing-library/user-event", "default.deselectOptions")
    @js.native
    def deselectOptions(element: TargetElement, values: String, init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.deselectOptions")
    @js.native
    def deselectOptions(element: TargetElement, values: js.Array[HTMLElement | String]): Unit = js.native
    @JSImport("@testing-library/user-event", "default.deselectOptions")
    @js.native
    def deselectOptions(element: TargetElement, values: js.Array[HTMLElement | String], init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.deselectOptions")
    @js.native
    def deselectOptions(element: TargetElement, values: HTMLElement): Unit = js.native
    @JSImport("@testing-library/user-event", "default.deselectOptions")
    @js.native
    def deselectOptions(element: TargetElement, values: HTMLElement, init: MouseEventInit): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.hover")
    @js.native
    def hover(element: TargetElement): Unit = js.native
    @JSImport("@testing-library/user-event", "default.hover")
    @js.native
    def hover(element: TargetElement, init: MouseEventInit): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.paste")
    @js.native
    def paste(element: TargetElement, text: String): Unit = js.native
    @JSImport("@testing-library/user-event", "default.paste")
    @js.native
    def paste(
      element: TargetElement,
      text: String,
      init: js.UndefOr[scala.Nothing],
      pasteOptions: InitialSelectionEnd
    ): Unit = js.native
    @JSImport("@testing-library/user-event", "default.paste")
    @js.native
    def paste(element: TargetElement, text: String, init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.paste")
    @js.native
    def paste(element: TargetElement, text: String, init: MouseEventInit, pasteOptions: InitialSelectionEnd): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: TargetElement, values: String): Unit = js.native
    @JSImport("@testing-library/user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: TargetElement, values: String, init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: TargetElement, values: js.Array[HTMLElement | String]): Unit = js.native
    @JSImport("@testing-library/user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: TargetElement, values: js.Array[HTMLElement | String], init: MouseEventInit): Unit = js.native
    @JSImport("@testing-library/user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: TargetElement, values: HTMLElement): Unit = js.native
    @JSImport("@testing-library/user-event", "default.selectOptions")
    @js.native
    def selectOptions(element: TargetElement, values: HTMLElement, init: MouseEventInit): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.tab")
    @js.native
    def tab(): Unit = js.native
    @JSImport("@testing-library/user-event", "default.tab")
    @js.native
    def tab(userOpts: ITabUserOptions): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.unhover")
    @js.native
    def unhover(element: TargetElement): Unit = js.native
    @JSImport("@testing-library/user-event", "default.unhover")
    @js.native
    def unhover(element: TargetElement, init: MouseEventInit): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.upload")
    @js.native
    def upload(element: TargetElement, files: FilesArgument): Unit = js.native
    @JSImport("@testing-library/user-event", "default.upload")
    @js.native
    def upload(element: TargetElement, files: FilesArgument, init: UploadInitArgument): Unit = js.native
    
    @JSImport("@testing-library/user-event", "default.type")
    @js.native
    def `type`[T /* <: ITypeOpts */](element: TargetElement, text: String): Unit | js.Promise[Unit] = js.native
    @JSImport("@testing-library/user-event", "default.type")
    @js.native
    def `type`[T /* <: ITypeOpts */](element: TargetElement, text: String, userOpts: T): Unit | js.Promise[Unit] = js.native
  }
  
  type FilesArgument = File | js.Array[File]
  
  @js.native
  trait IClickOptions extends StObject {
    
    var clickCount: js.UndefOr[Double] = js.native
    
    var skipHover: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait ITabUserOptions extends StObject {
    
    var focusTrap: js.UndefOr[Document | Element] = js.native
    
    var shift: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait ITypeOpts extends StObject {
    
    var delay: js.UndefOr[Double] = js.native
    
    var initialSelectionEnd: js.UndefOr[Double] = js.native
    
    var initialSelectionStart: js.UndefOr[Double] = js.native
    
    var skipAutoClose: js.UndefOr[Boolean] = js.native
    
    var skipClick: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait UploadInitArgument extends StObject {
    
    var changeInit: js.UndefOr[Event] = js.native
    
    var clickInit: js.UndefOr[MouseEventInit] = js.native
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
