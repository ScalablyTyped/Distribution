package typings.winrtUwp.Windows.Media.Playback

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
trait MediaPlayerDataReceivedEventArgs extends StObject {
  
  /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
  var data: IMap[String, String]
}
object MediaPlayerDataReceivedEventArgs {
  
  inline def apply(data: IMap[String, String]): MediaPlayerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerDataReceivedEventArgs]
  }
  
  extension [Self <: MediaPlayerDataReceivedEventArgs](x: Self) {
    
    inline def setData(value: IMap[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
