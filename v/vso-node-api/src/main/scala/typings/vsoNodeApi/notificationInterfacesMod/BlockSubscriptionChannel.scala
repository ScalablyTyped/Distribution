package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockSubscriptionChannel extends StObject {
  
  var `type`: String
}
object BlockSubscriptionChannel {
  
  @scala.inline
  def apply(`type`: String): BlockSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSubscriptionChannel]
  }
  
  @scala.inline
  implicit class BlockSubscriptionChannelMutableBuilder[Self <: BlockSubscriptionChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
