package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back extends StObject {
  
  /**
    * The back of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var back: js.UndefOr[String] = js.undefined
  
  /**
    * The front of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var front: js.UndefOr[String] = js.undefined
}
object Back {
  
  inline def apply(): Back = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Back]
  }
  
  extension [Self <: Back](x: Self) {
    
    inline def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setFront(value: String): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
    
    inline def setFrontUndefined: Self = StObject.set(x, "front", js.undefined)
  }
}
