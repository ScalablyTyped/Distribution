package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: Event
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "Event")
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: Event): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
