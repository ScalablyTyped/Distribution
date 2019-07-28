package typings.vortexDashWebDashClient.ddsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dds.DataCache")
@js.native
class DataCache protected ()
  extends typings.vortexDashWebDashClient.DDSNs.DataCache {
  /**
  		 * Constructs a `DataCache` with a given `depth`. If the `cache` parameter
  		 * is present, then the current cache is initialized with this parameter.
  		 *
  		 * Provides a way of storing and flexibly accessing the
  		 * data received through a `DataReader`. A `DataCache` is organized as
  		 * a map of queues. The depth of the queues is specified at construction
  		 * time.
  		 *
  		 * @param depth - cache size
  		 * @param cache - cache data structure
  		 */
  def this(depth: Double, cache: js.Any) = this()
}

