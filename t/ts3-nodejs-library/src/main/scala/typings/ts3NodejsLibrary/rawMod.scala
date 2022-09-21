package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak.ConnectionParams
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.QueryProtocolInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  @JSImport("ts3-nodejs-library/lib/transport/protocols/raw", "ProtocolRAW")
  @js.native
  open class ProtocolRAW protected () extends QueryProtocolInterface {
    def this(config: ConnectionParams) = this()
    
    /**
      * called when the connection with the Socket gets closed
      */
    /* private */ var handleClose: Any = js.native
    
    /**
      * Called after the Socket has been established
      */
    /* private */ var handleConnect: Any = js.native
    
    /**
      * called when the Socket receives data
      * Splits the data with every newline
      */
    /* private */ var handleData: Any = js.native
    
    /**
      * called when the Socket emits an error
      */
    /* private */ var handleError: Any = js.native
    
    /**
      * Called after the socket was not able to connect within the given timeframe
      */
    /* private */ var handleTimeout: Any = js.native
    
    /* private */ var socket: Any = js.native
  }
}
