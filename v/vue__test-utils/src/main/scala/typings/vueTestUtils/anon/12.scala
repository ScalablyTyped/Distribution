package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.MutationNameEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: MutationNameEvent
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "MutationNameEvent")
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: MutationNameEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
