package typings.winjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var winControl: js.Any
}
object Element {
  
  @scala.inline
  def apply(winControl: js.Any): Element = {
    val __obj = js.Dynamic.literal(winControl = winControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWinControl(value: js.Any): Self = StObject.set(x, "winControl", value.asInstanceOf[js.Any])
  }
}
