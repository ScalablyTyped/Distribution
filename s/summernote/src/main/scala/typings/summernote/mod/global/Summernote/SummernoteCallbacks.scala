package typings.summernote.mod.global.Summernote

import typings.std.Blob
import typings.std.Event
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.summernote.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummernoteCallbacks extends StObject {
  
  var onBeforeCommand: js.UndefOr[js.Function1[/* contents */ String, Unit]] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onBlurCodeview: js.UndefOr[js.Function2[/* code */ String, /* ev */ Event, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function2[/* contents */ String, /* $editable */ JQuery, Unit]] = js.undefined
  
  var onChangeCodeview: js.UndefOr[js.Function2[/* code */ String, /* $editor */ JQuery, Unit]] = js.undefined
  
  var onDialogShown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onEnter: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* ev */ Event, Unit]] = js.undefined
  
  var onImageLinkInsert: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
  
  var onImageUpload: js.UndefOr[js.Function1[/* files */ js.Array[Blob], Unit]] = js.undefined
  
  var onImageUploadError: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onKeydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  
  var onKeyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Unit]] = js.undefined
  
  var onMouseDown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  
  var onMouseUp: js.UndefOr[js.Function1[/* ev */ MouseEvent, Unit]] = js.undefined
  
  var onPaste: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  var onScroll: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
}
object SummernoteCallbacks {
  
  inline def apply(): SummernoteCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummernoteCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SummernoteCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnBeforeCommand(value: /* contents */ String => Unit): Self = StObject.set(x, "onBeforeCommand", js.Any.fromFunction1(value))
    
    inline def setOnBeforeCommandUndefined: Self = StObject.set(x, "onBeforeCommand", js.undefined)
    
    inline def setOnBlur(value: /* ev */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurCodeview(value: (/* code */ String, /* ev */ Event) => Unit): Self = StObject.set(x, "onBlurCodeview", js.Any.fromFunction2(value))
    
    inline def setOnBlurCodeviewUndefined: Self = StObject.set(x, "onBlurCodeview", js.undefined)
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: (/* contents */ String, /* $editable */ JQuery) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    inline def setOnChangeCodeview(value: (/* code */ String, /* $editor */ JQuery) => Unit): Self = StObject.set(x, "onChangeCodeview", js.Any.fromFunction2(value))
    
    inline def setOnChangeCodeviewUndefined: Self = StObject.set(x, "onChangeCodeview", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnDialogShown(value: () => Unit): Self = StObject.set(x, "onDialogShown", js.Any.fromFunction0(value))
    
    inline def setOnDialogShownUndefined: Self = StObject.set(x, "onDialogShown", js.undefined)
    
    inline def setOnEnter(value: /* ev */ Event => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnFocus(value: /* ev */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnImageLinkInsert(value: /* url */ String => Unit): Self = StObject.set(x, "onImageLinkInsert", js.Any.fromFunction1(value))
    
    inline def setOnImageLinkInsertUndefined: Self = StObject.set(x, "onImageLinkInsert", js.undefined)
    
    inline def setOnImageUpload(value: /* files */ js.Array[Blob] => Unit): Self = StObject.set(x, "onImageUpload", js.Any.fromFunction1(value))
    
    inline def setOnImageUploadError(value: /* err */ Any => Unit): Self = StObject.set(x, "onImageUploadError", js.Any.fromFunction1(value))
    
    inline def setOnImageUploadErrorUndefined: Self = StObject.set(x, "onImageUploadError", js.undefined)
    
    inline def setOnImageUploadUndefined: Self = StObject.set(x, "onImageUpload", js.undefined)
    
    inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
    
    inline def setOnKeydown(value: /* ev */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeydown", js.Any.fromFunction1(value))
    
    inline def setOnKeydownUndefined: Self = StObject.set(x, "onKeydown", js.undefined)
    
    inline def setOnKeyup(value: /* ev */ KeyboardEvent => Unit): Self = StObject.set(x, "onKeyup", js.Any.fromFunction1(value))
    
    inline def setOnKeyupUndefined: Self = StObject.set(x, "onKeyup", js.undefined)
    
    inline def setOnMouseDown(value: /* ev */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseUp(value: /* ev */ MouseEvent => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnPaste(value: /* e */ Event => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
    
    inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
    
    inline def setOnScroll(value: /* e */ Event => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
  }
}
