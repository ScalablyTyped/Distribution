package typings.vortexWebClient.DDS_

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS.DataWriterQos")
@js.native
class DataWriterQos protected () extends EntityQos {
  /**
  		 * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
  		 *
  		 * @param policies - list of policies for the Qos entity
  		 */
  def this(policies: Policy*) = this()
}

@JSGlobal("DDS.DataWriterQos")
@js.native
object DataWriterQos extends TopLevel[EntityQos]

