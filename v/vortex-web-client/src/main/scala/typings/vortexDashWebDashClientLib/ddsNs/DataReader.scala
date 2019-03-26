package typings
package vortexDashWebDashClientLib.ddsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dds.DataReader")
@js.native
class DataReader protected ()
  extends vortexDashWebDashClientLib.DDSNs.DataReader {
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
  def this(runtime: vortexDashWebDashClientLib.DDSNs.Runtime, topic: vortexDashWebDashClientLib.DDSNs.Topic, qos: vortexDashWebDashClientLib.DDSNs.EntityQos) = this()
}

