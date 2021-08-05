package typings.winjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var winControl: js.Any
}
object Element {
  
  inline def apply(winControl: js.Any): Element = {
    val __obj = js.Dynamic.literal(winControl = winControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setWinControl(value: js.Any): Self = StObject.set(x, "winControl", value.asInstanceOf[js.Any])
  }
}
