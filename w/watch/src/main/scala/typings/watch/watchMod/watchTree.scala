package typings.watch.watchMod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("watch", "watchTree")
@js.native
object watchTree extends js.Object {
  def apply(
    root: String,
    callback: js.Function3[/* f */ FileOrFiles, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  def apply(
    root: String,
    options: Options,
    callback: js.Function3[/* f */ FileOrFiles, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
}

