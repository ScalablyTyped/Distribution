package typings
package windowsDashServiceLib.windowsDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("windows-service", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(name: java.lang.String): scala.Unit = js.native
  def add(name: java.lang.String, opts: AddOptions): scala.Unit = js.native
  def remove(name: java.lang.String): scala.Unit = js.native
  def run(stdoutLogStream: nodeLib.streamMod.Writable, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def run(
    stdoutLogStream: nodeLib.streamMod.Writable,
    stderrLogStream: nodeLib.streamMod.Writable,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stop(rcode: scala.Double): scala.Unit = js.native
}

