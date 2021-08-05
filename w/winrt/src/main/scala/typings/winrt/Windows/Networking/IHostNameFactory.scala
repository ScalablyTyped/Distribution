package typings.winrt.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHostNameFactory extends StObject {
  
  def createHostName(hostName: String): HostName
}
object IHostNameFactory {
  
  inline def apply(createHostName: String => HostName): IHostNameFactory = {
    val __obj = js.Dynamic.literal(createHostName = js.Any.fromFunction1(createHostName))
    __obj.asInstanceOf[IHostNameFactory]
  }
  
  extension [Self <: IHostNameFactory](x: Self) {
    
    inline def setCreateHostName(value: String => HostName): Self = StObject.set(x, "createHostName", js.Any.fromFunction1(value))
  }
}
