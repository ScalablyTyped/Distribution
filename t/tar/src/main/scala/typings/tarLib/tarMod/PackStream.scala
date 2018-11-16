package typings
package tarLib.tarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackStream
  extends nodeLib.NodeJSNs.ReadWriteStream {
  var _buffer: js.Array[nodeLib.streamMod.Stream] = js.native
  var _currentEntry: js.Any = js.native
  var _global: HeaderProperties = js.native
  var _needDrain: scala.Boolean = js.native
  var _noProprietary: scala.Boolean = js.native
  var _paused: scala.Boolean = js.native
  var _pipeRoot: nodeLib.streamMod.Stream = js.native
  var _processing: scala.Boolean = js.native
  def _process(): scala.Unit = js.native
  def add(stream: nodeLib.streamMod.Stream): scala.Boolean = js.native
  def addGlobal(props: HeaderProperties): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
}

