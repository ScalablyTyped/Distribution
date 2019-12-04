package typings.ts3DashNodejsDashLibrary

import typings.ts3DashNodejsDashLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.QueryProtocolInterface
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryMod.ConnectionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/transport/protocols/ssh", JSImport.Namespace)
@js.native
object libTransportProtocolsSshMod extends js.Object {
  @js.native
  class ProtocolSSH protected () extends QueryProtocolInterface {
    def this(config: ConnectionParams) = this()
    var client: js.Any = js.native
    /**
      * Called when the connection with the Socket gets closed
      */
    var handleClose: js.Any = js.native
    /**
      * called when the Socket receives data
      */
    var handleData: js.Any = js.native
    /**
      * Called when the Socket emits an error
      */
    var handleError: js.Any = js.native
    /**
      * Called after the Socket has been established
      */
    var handleReady: js.Any = js.native
    var stream: js.Any = js.native
  }
  
}

