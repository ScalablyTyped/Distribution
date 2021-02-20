package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Consumer extends StObject {
  
  var consumerId: Double = js.native
  
  var consumerName: String = js.native
}
object Consumer {
  
  @scala.inline
  def apply(consumerId: Double, consumerName: String): Consumer = {
    val __obj = js.Dynamic.literal(consumerId = consumerId.asInstanceOf[js.Any], consumerName = consumerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Consumer]
  }
  
  @scala.inline
  implicit class ConsumerMutableBuilder[Self <: Consumer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerId(value: Double): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerName(value: String): Self = StObject.set(x, "consumerName", value.asInstanceOf[js.Any])
  }
}
