package typings.vortexWebClient.DDS_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS.DataReader")
@js.native
class DataReader protected () extends js.Object {
  /**
  		 * Creates a `DataReader` for a given topic and a specific in a specific DDS runtime.
  		 *
  		 * A `DataReader` allows to read data for a given topic with a specific QoS. A `DataReader`
  		 * * goes through different states, it is intially disconnected and changes to the connected state
  		 * when the underlying transport connection is successfully established with the server. At this point
  		 * a `DataReader` can be explicitely closed or disconnected. A disconnection can happen as the result
  		 * of a network failure or server failure. Disconnection and reconnections are managed by the runtime.
  		 *
  		 * @param runtime - DDS Runtime
  		 * @param topic - DDS Topic
  		 * @param qos - DataReader quality of service
  		 */
  def this(runtime: Runtime_, topic: Topic, qos: EntityQos) = this()
  /**
  		 * Attaches the  listener `l` to this data reader and returns
  		 * the id associated to the listener.
  		 * @param l - listener code
  		 * @returns listener handle
  		 */
  def addListener(l: js.Function1[/* msg */ js.Any, Unit]): Double = js.native
  /**
  		 * closes the DataReader
  		 */
  def close(): Unit = js.native
  /**
  		 * removes a listener from this data reader.
  		 * @param idx - listener id
  		 */
  def removeListener(idx: Double): Unit = js.native
  def resetStats(): Unit = js.native
}

