package typings.wixUiCore.anon

import typings.wixUiCore.constsMod.ImageStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var src: String
  
  var status: ImageStatus
}
object Status {
  
  inline def apply(src: String, status: ImageStatus): Status = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ImageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
