package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUssdSessionStatics extends StObject {
  
  def createFromNetworkAccountId(networkAccountId: String): UssdSession
  
  def createFromNetworkInterfaceId(networkInterfaceId: String): UssdSession
}
object IUssdSessionStatics {
  
  @scala.inline
  def apply(
    createFromNetworkAccountId: String => UssdSession,
    createFromNetworkInterfaceId: String => UssdSession
  ): IUssdSessionStatics = {
    val __obj = js.Dynamic.literal(createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId), createFromNetworkInterfaceId = js.Any.fromFunction1(createFromNetworkInterfaceId))
    __obj.asInstanceOf[IUssdSessionStatics]
  }
  
  @scala.inline
  implicit class IUssdSessionStaticsMutableBuilder[Self <: IUssdSessionStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateFromNetworkAccountId(value: String => UssdSession): Self = StObject.set(x, "createFromNetworkAccountId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateFromNetworkInterfaceId(value: String => UssdSession): Self = StObject.set(x, "createFromNetworkInterfaceId", js.Any.fromFunction1(value))
  }
}
