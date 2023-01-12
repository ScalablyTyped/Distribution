package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacteristicEventHandlers extends StObject {
  
  def oncharacteristicvaluechanged(ev: Event): Any
}
object CharacteristicEventHandlers {
  
  inline def apply(oncharacteristicvaluechanged: Event => Any): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal(oncharacteristicvaluechanged = js.Any.fromFunction1(oncharacteristicvaluechanged))
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacteristicEventHandlers] (val x: Self) extends AnyVal {
    
    inline def setOncharacteristicvaluechanged(value: Event => Any): Self = StObject.set(x, "oncharacteristicvaluechanged", js.Any.fromFunction1(value))
  }
}
