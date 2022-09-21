package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.testingLibraryUserEventBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bubbles extends StObject {
  
  val bubbles: `true`
  
  val cancelable: `true`
  
  val composed: `true`
}
object Bubbles {
  
  inline def apply(): Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = true, cancelable = true, composed = true)
    __obj.asInstanceOf[Bubbles]
  }
  
  extension [Self <: Bubbles](x: Self) {
    
    inline def setBubbles(value: `true`): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: `true`): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
  }
}
