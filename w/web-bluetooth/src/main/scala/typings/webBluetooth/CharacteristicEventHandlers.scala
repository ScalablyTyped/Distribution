package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharacteristicEventHandlers extends StObject {
  
  def oncharacteristicvaluechanged(ev: Event): js.Any = js.native
}
object CharacteristicEventHandlers {
  
  @scala.inline
  def apply(oncharacteristicvaluechanged: Event => js.Any): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal(oncharacteristicvaluechanged = js.Any.fromFunction1(oncharacteristicvaluechanged))
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
  
  @scala.inline
  implicit class CharacteristicEventHandlersMutableBuilder[Self <: CharacteristicEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOncharacteristicvaluechanged(value: Event => js.Any): Self = StObject.set(x, "oncharacteristicvaluechanged", js.Any.fromFunction1(value))
  }
}
