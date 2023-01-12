package typings.sweetalert

import typings.sweetalert.typingsModulesOptionsButtonsMod.ButtonList
import typings.sweetalert.typingsModulesOptionsContentMod.ContentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var closeModal: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      inline def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
    }
  }
  
  trait CloseModal extends StObject {
    
    var closeModal: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Any] = js.undefined
  }
  object CloseModal {
    
    inline def apply(): CloseModal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseModal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloseModal] (val x: Self) extends AnyVal {
      
      inline def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      inline def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
      
      inline def setValue(value: String | Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined std.Partial<sweetalert.sweetalert/typings/modules/options.SwalOptions> */
  trait PartialSwalOptions extends StObject {
    
    var buttons: js.UndefOr[ButtonList | (js.Array[String | Boolean])] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnClickOutside: js.UndefOr[Boolean] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[ContentOptions] = js.undefined
    
    var dangerMode: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var timer: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PartialSwalOptions {
    
    inline def apply(): PartialSwalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSwalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSwalOptions] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: ButtonList | (js.Array[String | Boolean])): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: (String | Boolean)*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "closeOnClickOutside", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickOutsideUndefined: Self = StObject.set(x, "closeOnClickOutside", js.undefined)
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setContent(value: ContentOptions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDangerMode(value: Boolean): Self = StObject.set(x, "dangerMode", value.asInstanceOf[js.Any])
      
      inline def setDangerModeUndefined: Self = StObject.set(x, "dangerMode", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Reject extends StObject {
    
    var reject: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var resolve: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  }
  object Reject {
    
    inline def apply(): Reject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reject] (val x: Self) extends AnyVal {
      
      inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
      
      inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      inline def setResolve(value: /* value */ String => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var closeModal: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Value {
    
    inline def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      inline def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
