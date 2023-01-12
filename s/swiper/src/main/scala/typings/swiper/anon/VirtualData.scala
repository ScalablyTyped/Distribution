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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualData] (val x: Self) extends AnyVal {
    
    inline def setVirtualData(value: From): Self = StObject.set(x, "virtualData", value.asInstanceOf[js.Any])
  }
}
