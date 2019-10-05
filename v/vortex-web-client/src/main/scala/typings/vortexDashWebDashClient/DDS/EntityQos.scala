package typings.vortexDashWebDashClient.DDS

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityQos
  extends /**
		 * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
		 *
		 * @param policies - list of policies for the Qos entity
		 */
Instantiable1[/* policies (repeated) */ Policy, EntityQos] {
  /**
  		 * Adds the given policy to this instance.
  		 * @param policy - the policy to add
  		 * @return A new copy of this instance with the combined policies
  		 */
  def add(policy: Policy): EntityQos = js.native
}

