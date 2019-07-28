package typings.workboxDashSw.workboxDashSwMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an instance of Queue with the given options
  */
@js.native
trait QueueConstructor
  extends /**
	 * Creates an instance of Queue with the given options
	 * @param {string} name - The unique name for this queue. This name must be unique as it's used to register sync events
	 *                        and store requests in IndexedDB specific to this instance. An error will be thrown if a duplicate
	 *                        name is detected.
	 * @param {Partial<QueueOptions>} options
	 * @return {Queue}
	 */
Instantiable1[/* name */ String, Queue]
     with Instantiable2[/* name */ String, /* options */ Partial[QueueOptions], Queue]

