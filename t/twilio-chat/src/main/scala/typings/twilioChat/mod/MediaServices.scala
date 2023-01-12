package typings.twilioChat.mod

import typings.twilioMcsClient.mod.McsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaServices extends StObject {
  
  var mcsClient: McsClient
}
object MediaServices {
  
  inline def apply(mcsClient: McsClient): MediaServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaServices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaServices] (val x: Self) extends AnyVal {
    
    inline def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
  }
}
