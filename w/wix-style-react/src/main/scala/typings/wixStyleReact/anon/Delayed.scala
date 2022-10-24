package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delayed extends StObject {
  
  var delayed: Boolean
}
object Delayed {
  
  inline def apply(delayed: Boolean): Delayed = {
    val __obj = js.Dynamic.literal(delayed = delayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delayed]
  }
  
  extension [Self <: Delayed](x: Self) {
    
    inline def setDelayed(value: Boolean): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
  }
}
