package typings.vortexDashWebDashClient.DDS

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runtime
  extends /**
		 * Constructs a DDS Runtime object
		 *
		 * maintains the connection with the server, re-establish the connection
		 * if dropped and mediates the `DataReader` and `DataWriter` communication.
		 */
Instantiable0[Runtime] {
  /**
  		 * Closes the DDS runtime and as a consequence all the `DataReaders` and `DataWriters` that belong to this runtime.
  		 *
  		 */
  def close(): Unit = js.native
  /**
  		 * Connect the runtime to the server. If the runtime is already connected an exception is thrown
  		 *
  		 * @param srv - Vortex Web server WebSocket URL
  		 * @param authToken - Authorization token
  		 */
  def connect(server: String): Unit = js.native
  def connect(server: String, authToken: String): Unit = js.native
  /**
  		 * Disconnects, withouth closing, a `Runtime`. Notice that upon re-connection all existing
  		 * subscriptions and publications will be re-restablished.
  		 */
  def disconnect(): Unit = js.native
  /**
  		 * Checks whether the Runtime is closed.
  		 * @return `true` if connected, `false` if not
  		 */
  def isClosed(): Boolean = js.native
  /**
  		 * Checks whether the Runtime is connected.
  		 * @return `true` if connected, `false` if not
  		 */
  def isConnected(): Boolean = js.native
  /**
  		 * Function called when runtime is connected.
  		 *
  		 * @param e
  		 */
  def onconnect(e: js.Any): Unit = js.native
  /**
  		 * Function called when runtime is disconnected.
  		 *
  		 * @param e
  		 */
  def ondisconnect(e: js.Any): Unit = js.native
  /**
  		 * Registers the provided Topic.
  		 *
  		 * @param t - Topic to be registered
  		 */
  def registerTopic(t: Topic): Unit = js.native
}

@JSGlobal("DDS.runtime")
@js.native
object runtime extends js.Object {
  var Runtime: typings.vortexDashWebDashClient.DDS.Runtime = js.native
}

