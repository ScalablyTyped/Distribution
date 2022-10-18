package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.libTeamSpeakMod.TeamSpeak.ConnectionParams
import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.QueryProtocolInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransportProtocolsSshMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/protocols/ssh", "ProtocolSSH")
  @js.native
  open class ProtocolSSH protected () extends QueryProtocolInterface {
    def this(config: ConnectionParams) = this()
    
    /* private */ var client: Any = js.native
    
    /**
      * Called when the connection with the Socket gets closed
      */
    /* private */ var handleClose: Any = js.native
    
    /**
      * called when the Socket receives data
      */
    /* private */ var handleData: Any = js.native
    
    /**
      * Called when the Socket emits an error
      */
    /* private */ var handleError: Any = js.native
    
    /**
      * Called after the Socket has been established
      */
    /* private */ var handleReady: Any = js.native
    
    /* private */ var stream: Any = js.native
  }
}
