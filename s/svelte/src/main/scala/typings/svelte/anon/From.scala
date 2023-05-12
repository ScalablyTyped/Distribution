package typings.svelte.anon

import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: DOMRect
  
  var to: DOMRect
}
object From {
  
  inline def apply(from: DOMRect, to: DOMRect): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: DOMRect): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: DOMRect): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
