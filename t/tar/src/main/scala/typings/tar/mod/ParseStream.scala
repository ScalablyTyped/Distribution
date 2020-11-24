package typings.tar.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseStream
  extends ReadableStream
     with WritableStream {
  
  var _ended: Boolean = js.native
  
  def _process(c: Buffer): Unit = js.native
  
  def _startEntry(c: Buffer): Unit = js.native
  
  var _stream: Stream = js.native
  
  def _streamEnd(): Unit = js.native
  
  var position: Double = js.native
}
