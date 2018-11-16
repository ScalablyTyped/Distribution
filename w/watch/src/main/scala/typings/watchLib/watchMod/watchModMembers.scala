package typings
package watchLib.watchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("watch", JSImport.Namespace)
@js.native
object watchModMembers extends js.Object {
  def createMonitor(root: java.lang.String, callback: js.Function1[/* monitor */ Monitor, scala.Unit]): scala.Unit = js.native
  def createMonitor(
    root: java.lang.String,
    options: Options,
    callback: js.Function1[/* monitor */ Monitor, scala.Unit]
  ): scala.Unit = js.native
  def unwatchTree(root: java.lang.String): scala.Unit = js.native
  def watchTree(
    root: java.lang.String,
    callback: js.Function3[
      /* f */ FileOrFiles, 
      /* curr */ nodeLib.fsMod.Stats, 
      /* prev */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def watchTree(
    root: java.lang.String,
    options: Options,
    callback: js.Function3[
      /* f */ FileOrFiles, 
      /* curr */ nodeLib.fsMod.Stats, 
      /* prev */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

