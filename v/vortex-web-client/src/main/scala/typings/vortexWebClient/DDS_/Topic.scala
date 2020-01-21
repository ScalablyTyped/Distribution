package typings.vortexWebClient.DDS_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS.Topic")
@js.native
class Topic protected () extends js.Object {
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
  /**
  		 * Called when topic gets registered in the runtime
  		 */
  def onregistered(): Unit = js.native
  /**
  		 * Called when topic gets unregistered in the runtime
  		 */
  def onunregistered(): Unit = js.native
}

