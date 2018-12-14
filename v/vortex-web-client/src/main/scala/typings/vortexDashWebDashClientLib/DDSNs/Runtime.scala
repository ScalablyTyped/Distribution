package typings
package vortexDashWebDashClientLib.DDSNs

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
org.scalablytyped.runtime.Instantiable0[Runtime] {
  /**
  		 * Closes the DDS runtime and as a consequence all the `DataReaders` and `DataWriters` that belong to this runtime.
  		 *
  		 */
  def close(): scala.Unit = js.native
  /**
  		 * Connect the runtime to the server. If the runtime is already connected an exception is thrown
  		 *
  		 * @param srv - Vortex Web server WebSocket URL
  		 * @param authToken - Authorization token
  		 */
  def connect(server: java.lang.String): scala.Unit = js.native
  /**
  		 * Connect the runtime to the server. If the runtime is already connected an exception is thrown
  		 *
  		 * @param srv - Vortex Web server WebSocket URL
  		 * @param authToken - Authorization token
  		 */
  def connect(server: java.lang.String, authToken: java.lang.String): scala.Unit = js.native
  /**
  		 * Disconnects, withouth closing, a `Runtime`. Notice that upon re-connection all existing
  		 * subscriptions and publications will be re-restablished.
  		 */
  def disconnect(): scala.Unit = js.native
  /**
  		 * Checks whether the Runtime is closed.
  		 * @return `true` if connected, `false` if not
  		 */
  def isClosed(): scala.Boolean = js.native
  /**
  		 * Checks whether the Runtime is connected.
  		 * @return `true` if connected, `false` if not
  		 */
  def isConnected(): scala.Boolean = js.native
  /**
  		 * Function called when runtime is connected.
  		 *
  		 * @param e
  		 */
  def onconnect(e: js.Any): scala.Unit = js.native
  /**
  		 * Function called when runtime is disconnected.
  		 *
  		 * @param e
  		 */
  def ondisconnect(e: js.Any): scala.Unit = js.native
  /**
  		 * Registers the provided Topic.
  		 *
  		 * @param t - Topic to be registered
  		 */
  def registerTopic(t: Topic): scala.Unit = js.native
}

