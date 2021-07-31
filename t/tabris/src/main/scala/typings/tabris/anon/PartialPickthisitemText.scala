package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<this, 'itemText'>> */
trait PartialPickthisitemText extends StObject {
  
  var itemText: js.UndefOr[js.Any] = js.undefined
}
object PartialPickthisitemText {
  
  @scala.inline
  def apply(): PartialPickthisitemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickthisitemText]
  }
  
  @scala.inline
  implicit class PartialPickthisitemTextMutableBuilder[Self <: PartialPickthisitemText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemText(value: js.Any): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
  }
}
