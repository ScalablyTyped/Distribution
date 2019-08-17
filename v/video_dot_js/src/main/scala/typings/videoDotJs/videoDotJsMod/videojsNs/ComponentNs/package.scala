package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ComponentNs {
  import typings.videoDotJs.videoDotJsMod.videojsNs.Component

  /**
  		 * A callback that has no parameters and is bound into `Component`s context.
  		 */
  type GenericCallback = js.ThisFunction0[/* this */ Component, Unit]
  /**
  		 * A callback that is called when a component is ready. Does not have any
  		 * parameters and any callback value will be ignored.
  		 */
  type ReadyCallback = js.ThisFunction0[/* this */ Component, Unit]
}
