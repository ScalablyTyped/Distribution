package typings.xummSdk

import typings.xummSdk.distSrcTypesMetaApplicationDetailsMod.ApplicationDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMetaPongMod {
  
  trait Pong extends StObject {
    
    var auth: ApplicationDetails
    
    var pong: Boolean
  }
  object Pong {
    
    inline def apply(auth: ApplicationDetails, pong: Boolean): Pong = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], pong = pong.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pong]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pong] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: ApplicationDetails): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setPong(value: Boolean): Self = StObject.set(x, "pong", value.asInstanceOf[js.Any])
    }
  }
}
