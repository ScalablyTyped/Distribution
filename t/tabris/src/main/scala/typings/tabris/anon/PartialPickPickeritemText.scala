package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<tabris.tabris.widgets.Picker, 'itemText'>> */
trait PartialPickPickeritemText extends StObject {
  
  var itemText: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
}
object PartialPickPickeritemText {
  
  @scala.inline
  def apply(): PartialPickPickeritemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickPickeritemText]
  }
  
  @scala.inline
  implicit class PartialPickPickeritemTextMutableBuilder[Self <: PartialPickPickeritemText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemText(value: /* index */ Double => String): Self = StObject.set(x, "itemText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
  }
}
