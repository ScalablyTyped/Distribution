package typings.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "MultiWatching")
@js.native
abstract class MultiWatching () extends Watching {
  /* CompleteClass */
  override def close(callback: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def invalidate(): Unit = js.native
}

