package typings.wordpressAdmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Silent extends StObject {
  
  var silent: Boolean
}
object Silent {
  
  inline def apply(silent: Boolean): Silent = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Silent]
  }
  
  extension [Self <: Silent](x: Self) {
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
  }
}
