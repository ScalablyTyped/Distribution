package typings.watch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("watch", "createMonitor")
@js.native
object createMonitor extends js.Object {
  
  def apply(root: String, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = js.native
  def apply(root: String, options: Options, callback: js.Function1[/* monitor */ Monitor, Unit]): Unit = js.native
}
