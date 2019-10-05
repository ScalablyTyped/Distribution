package typings.tar.tarMod

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseStream extends ReadWriteStream {
  var _ended: Boolean = js.native
  var _stream: Stream = js.native
  var position: Double = js.native
  def _process(c: Buffer): Unit = js.native
  def _startEntry(c: Buffer): Unit = js.native
  def _streamEnd(): Unit = js.native
}

