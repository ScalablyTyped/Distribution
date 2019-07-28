package typings.vortexDashWebDashClient.ddsNs

import typings.vortexDashWebDashClient.DDSNs.EntityQos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dds.Topic")
@js.native
class Topic protected ()
  extends typings.vortexDashWebDashClient.DDSNs.Topic {
  /**
  		 * Creates a `Topic` in the domain `did`, named `tname`, having `qos` Qos,
  		 * for the type `ttype` whose registered name is `tregtype`
  		 * @param {number} did - DDS domain ID
  		 * @param {string} tname - topic name
  		 * @param {TopicQos} qos - topic Qos
  		 * @param {string} ttype - topic type. If not specified, a generic type is used.
  		 * @param {string} tregtype - topic registered type name. If not specified, 'ttype' is used.
  		 */
  def this(did: Double, tname: String, qos: EntityQos) = this()
  def this(did: Double, tname: String, qos: EntityQos, ttype: String) = this()
  def this(did: Double, tname: String, qos: EntityQos, ttype: String, tregtype: String) = this()
}

