package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMobileBroadbandAccountStatics extends StObject {
  
  var availableNetworkAccountIds: IVectorView[String]
  
  def createFromNetworkAccountId(networkAccountId: String): MobileBroadbandAccount
}
object IMobileBroadbandAccountStatics {
  
  @scala.inline
  def apply(
    availableNetworkAccountIds: IVectorView[String],
    createFromNetworkAccountId: String => MobileBroadbandAccount
  ): IMobileBroadbandAccountStatics = {
    val __obj = js.Dynamic.literal(availableNetworkAccountIds = availableNetworkAccountIds.asInstanceOf[js.Any], createFromNetworkAccountId = js.Any.fromFunction1(createFromNetworkAccountId))
    __obj.asInstanceOf[IMobileBroadbandAccountStatics]
  }
  
  @scala.inline
  implicit class IMobileBroadbandAccountStaticsMutableBuilder[Self <: IMobileBroadbandAccountStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableNetworkAccountIds(value: IVectorView[String]): Self = StObject.set(x, "availableNetworkAccountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromNetworkAccountId(value: String => MobileBroadbandAccount): Self = StObject.set(x, "createFromNetworkAccountId", js.Any.fromFunction1(value))
  }
}
