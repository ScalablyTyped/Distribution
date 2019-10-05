package typings.vortexDashWebDashClient.DDS

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS.TopicQos")
@js.native
class TopicQos protected () extends EntityQos {
  /**
  		 * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
  		 *
  		 * @param policies - list of policies for the Qos entity
  		 */
  def this(policies: Policy*) = this()
}

@JSGlobal("DDS.TopicQos")
@js.native
object TopicQos extends TopLevel[EntityQos]

