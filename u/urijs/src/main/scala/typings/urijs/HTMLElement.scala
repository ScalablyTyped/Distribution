package typings.urijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLElement extends StObject {
  
  var innerText: String
}
object HTMLElement {
  
  inline def apply(innerText: String): HTMLElement = {
    val __obj = js.Dynamic.literal(innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
  
  extension [Self <: HTMLElement](x: Self) {
    
    inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
  }
}
