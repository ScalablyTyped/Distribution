package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseStream
  extends nodeLib.NodeJSNs.ReadWriteStream {
  var _ended: scala.Boolean = js.native
  var _stream: nodeLib.streamMod.Stream = js.native
  var position: scala.Double = js.native
  def _process(c: nodeLib.Buffer): scala.Unit = js.native
  def _startEntry(c: nodeLib.Buffer): scala.Unit = js.native
  def _streamEnd(): scala.Unit = js.native
}

