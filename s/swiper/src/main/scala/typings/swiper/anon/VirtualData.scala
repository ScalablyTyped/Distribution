package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualData extends StObject {
  
  var virtualData: From
}
object VirtualData {
  
  inline def apply(virtualData: From): VirtualData = {
    val __obj = js.Dynamic.literal(virtualData = virtualData.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualData]
  }
  
  extension [Self <: VirtualData](x: Self) {
    
    inline def setVirtualData(value: From): Self = StObject.set(x, "virtualData", value.asInstanceOf[js.Any])
  }
}
