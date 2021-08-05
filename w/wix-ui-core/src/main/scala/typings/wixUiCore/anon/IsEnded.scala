package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEnded extends StObject {
  
  var isEnded: js.Any
}
object IsEnded {
  
  inline def apply(isEnded: js.Any): IsEnded = {
    val __obj = js.Dynamic.literal(isEnded = isEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnded]
  }
  
  extension [Self <: IsEnded](x: Self) {
    
    inline def setIsEnded(value: js.Any): Self = StObject.set(x, "isEnded", value.asInstanceOf[js.Any])
  }
}
