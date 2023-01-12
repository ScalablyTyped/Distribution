package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelUpdatedEventArgs extends StObject {
  
  var channel: Channel
  
  var updateReasons: js.Array[ChannelUpdateReason]
}
object ChannelUpdatedEventArgs {
  
  inline def apply(channel: Channel, updateReasons: js.Array[ChannelUpdateReason]): ChannelUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUpdatedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setUpdateReasons(value: js.Array[ChannelUpdateReason]): Self = StObject.set(x, "updateReasons", value.asInstanceOf[js.Any])
    
    inline def setUpdateReasonsVarargs(value: ChannelUpdateReason*): Self = StObject.set(x, "updateReasons", js.Array(value*))
  }
}
