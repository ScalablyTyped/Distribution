package typings.vueTestUtils.anon

import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import typings.vueTestUtils.vueTestUtilsStrings.ClipboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val eventInterface: ClipboardEvent
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, eventInterface = "ClipboardEvent")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEventInterface(value: ClipboardEvent): Self = StObject.set(x, "eventInterface", value.asInstanceOf[js.Any])
  }
}
