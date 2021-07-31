package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMuteChangeRequestedEventArgs extends StObject {
  
  var mute: Boolean
}
object IMuteChangeRequestedEventArgs {
  
  @scala.inline
  def apply(mute: Boolean): IMuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMuteChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IMuteChangeRequestedEventArgsMutableBuilder[Self <: IMuteChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
  }
}
