package typings
package vortexDashWebDashClientLib.DDSNs

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
  def this(did: scala.Double, tname: java.lang.String, qos: EntityQos) = this()
  /**
  		 * Creates a `Topic` in the domain `did`, named `tname`, having `qos` Qos,
  		 * for the type `ttype` whose registered name is `tregtype`
  		 * @param {number} did - DDS domain ID
  		 * @param {string} tname - topic name
  		 * @param {TopicQos} qos - topic Qos
  		 * @param {string} ttype - topic type. If not specified, a generic type is used.
  		 * @param {string} tregtype - topic registered type name. If not specified, 'ttype' is used.
  		 */
  def this(did: scala.Double, tname: java.lang.String, qos: EntityQos, ttype: java.lang.String) = this()
  /**
  		 * Creates a `Topic` in the domain `did`, named `tname`, having `qos` Qos,
  		 * for the type `ttype` whose registered name is `tregtype`
  		 * @param {number} did - DDS domain ID
  		 * @param {string} tname - topic name
  		 * @param {TopicQos} qos - topic Qos
  		 * @param {string} ttype - topic type. If not specified, a generic type is used.
  		 * @param {string} tregtype - topic registered type name. If not specified, 'ttype' is used.
  		 */
  def this(did: scala.Double, tname: java.lang.String, qos: EntityQos, ttype: java.lang.String, tregtype: java.lang.String) = this()
  /**
  		 * Called when topic gets registered in the runtime
  		 */
  def onregistered(): scala.Unit = js.native
  /**
  		 * Called when topic gets unregistered in the runtime
  		 */
  def onunregistered(): scala.Unit = js.native
}

