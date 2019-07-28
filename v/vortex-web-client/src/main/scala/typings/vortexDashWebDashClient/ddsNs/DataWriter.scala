package typings.vortexDashWebDashClient.ddsNs

import typings.vortexDashWebDashClient.DDSNs.EntityQos
import typings.vortexDashWebDashClient.DDSNs.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dds.DataWriter")
@js.native
class DataWriter protected ()
  extends typings.vortexDashWebDashClient.DDSNs.DataWriter {
  /**
  		 * Creates a `DataWriter` for a given topic and a specific in a specific DDS runtime
  		 *
  		 * defines a DDS data writer. This type
  		 * is used to write data for a specific topic with a given QoS.
  		 * A `DataWriter` goes through different states, it is intially disconnected and changes to the connected
  		 * state when the underlying transport connection is successfully established with the server.
  		 * At this point a `DataWriter` can be explicitely closed or disconnected. A disconnection can happen
  		 * as the result of a network failure or server failure. Disconnection and reconnections are managed by the
  		 * runtime.
  		 *
  		 * @param runtime - DDS Runtime
  		 * @param topic - DDS Topic
  		 * @param qos - DataWriter quality of service
  		 */
  def this(runtime: Runtime, topic: typings.vortexDashWebDashClient.DDSNs.Topic, qos: EntityQos) = this()
}

