package typings.twilioVideo

import typings.twilioVideo.tsdefTypesMod.ConnectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefConnectOptionsInternalMod {
  
  trait ConnectOptionsInternal
    extends StObject
       with ConnectOptions {
    
    var createLocalTracks: js.UndefOr[Any] = js.undefined
  }
  object ConnectOptionsInternal {
    
    inline def apply(): ConnectOptionsInternal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptionsInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectOptionsInternal] (val x: Self) extends AnyVal {
      
      inline def setCreateLocalTracks(value: Any): Self = StObject.set(x, "createLocalTracks", value.asInstanceOf[js.Any])
      
      inline def setCreateLocalTracksUndefined: Self = StObject.set(x, "createLocalTracks", js.undefined)
    }
  }
}
