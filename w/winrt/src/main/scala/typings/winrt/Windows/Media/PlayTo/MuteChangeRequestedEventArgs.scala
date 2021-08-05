package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MuteChangeRequestedEventArgs
  extends StObject
     with IMuteChangeRequestedEventArgs
object MuteChangeRequestedEventArgs {
  
  inline def apply(mute: Boolean): MuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteChangeRequestedEventArgs]
  }
}
