package typings.sweetalert

import typings.sweetalert.optionsButtonsMod.ButtonList
import typings.sweetalert.optionsContentMod.ContentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var closeModal: js.UndefOr[Boolean] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
    }
  }
  
  @js.native
  trait CloseModal extends StObject {
    
    var closeModal: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | js.Any] = js.native
  }
  object CloseModal {
    
    @scala.inline
    def apply(): CloseModal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseModal]
    }
    
    @scala.inline
    implicit class CloseModalMutableBuilder[Self <: CloseModal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sweetalert.sweetalert/typings/modules/options.SwalOptions> */
  @js.native
  trait PartialSwalOptions extends StObject {
    
    var buttons: js.UndefOr[ButtonList | (js.Array[String | Boolean])] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var closeOnClickOutside: js.UndefOr[Boolean] = js.native
    
    var closeOnEsc: js.UndefOr[Boolean] = js.native
    
    var content: js.UndefOr[ContentOptions] = js.native
    
    var dangerMode: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var timer: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object PartialSwalOptions {
    
    @scala.inline
    def apply(): PartialSwalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSwalOptions]
    }
    
    @scala.inline
    implicit class PartialSwalOptionsMutableBuilder[Self <: PartialSwalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: ButtonList | (js.Array[String | Boolean])): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: (String | Boolean)*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "closeOnClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickOutsideUndefined: Self = StObject.set(x, "closeOnClickOutside", js.undefined)
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      @scala.inline
      def setContent(value: ContentOptions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDangerMode(value: Boolean): Self = StObject.set(x, "dangerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerModeUndefined: Self = StObject.set(x, "dangerMode", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Reject extends StObject {
    
    var reject: js.UndefOr[js.Function0[Unit]] = js.native
    
    var resolve: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  }
  object Reject {
    
    @scala.inline
    def apply(): Reject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reject]
    }
    
    @scala.inline
    implicit class RejectMutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      @scala.inline
      def setResolve(value: /* value */ String => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var closeModal: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object Value {
    
    @scala.inline
    def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
