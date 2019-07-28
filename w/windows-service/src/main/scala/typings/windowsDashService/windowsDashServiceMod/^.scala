package typings.windowsDashService.windowsDashServiceMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("windows-service", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(name: String): Unit = js.native
  def add(name: String, opts: AddOptions): Unit = js.native
  def remove(name: String): Unit = js.native
  def run(stdoutLogStream: Writable, callback: js.Function0[Unit]): Unit = js.native
  def run(stdoutLogStream: Writable, stderrLogStream: Writable, callback: js.Function0[Unit]): Unit = js.native
  def stop(): Unit = js.native
  def stop(rcode: Double): Unit = js.native
}

