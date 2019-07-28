package typings.watch.watchMod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("watch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createMonitor(root: String, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = js.native
  def createMonitor(root: String, options: Options, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = js.native
  def unwatchTree(root: String): Unit = js.native
  def watchTree(
    root: String,
    callback: js.Function3[/* f */ FileOrFiles, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
  def watchTree(
    root: String,
    options: Options,
    callback: js.Function3[/* f */ FileOrFiles, /* curr */ Stats, /* prev */ Stats, Unit]
  ): Unit = js.native
}

