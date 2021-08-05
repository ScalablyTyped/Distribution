package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.ConnectionParams
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.QueryProtocolInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sshMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/protocols/ssh", "ProtocolSSH")
  @js.native
  class ProtocolSSH protected () extends QueryProtocolInterface {
    def this(config: ConnectionParams) = this()
    
    /* private */ var client: js.Any = js.native
    
    /**
      * Called when the connection with the Socket gets closed
      */
    /* private */ var handleClose: js.Any = js.native
    
    /**
      * called when the Socket receives data
      */
    /* private */ var handleData: js.Any = js.native
    
    /**
      * Called when the Socket emits an error
      */
    /* private */ var handleError: js.Any = js.native
    
    /**
      * Called after the Socket has been established
      */
    /* private */ var handleReady: js.Any = js.native
    
    /* private */ var stream: js.Any = js.native
  }
}
