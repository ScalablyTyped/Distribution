package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIPInformation extends StObject {
  
  var networkAdapter: NetworkAdapter = js.native
  
  var prefixLength: Double = js.native
}
object IIPInformation {
  
  @scala.inline
  def apply(networkAdapter: NetworkAdapter, prefixLength: Double): IIPInformation = {
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIPInformation]
  }
  
  @scala.inline
  implicit class IIPInformationMutableBuilder[Self <: IIPInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixLength(value: Double): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
  }
}
