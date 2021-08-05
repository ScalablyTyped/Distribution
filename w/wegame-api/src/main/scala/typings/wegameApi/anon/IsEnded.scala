package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEnded extends StObject {
  
  var isEnded: Boolean
}
object IsEnded {
  
  inline def apply(isEnded: Boolean): IsEnded = {
    val __obj = js.Dynamic.literal(isEnded = isEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnded]
  }
  
  extension [Self <: IsEnded](x: Self) {
    
    inline def setIsEnded(value: Boolean): Self = StObject.set(x, "isEnded", value.asInstanceOf[js.Any])
  }
}
