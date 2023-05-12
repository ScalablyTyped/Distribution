package typings.tar.mod

import typings.node.NodeJS.ReadWriteStream
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseStream
  extends StObject
     with ReadWriteStream {
  
  var _ended: Boolean = js.native
  
  def _process(c: Buffer): Unit = js.native
  
  def _startEntry(c: Buffer): Unit = js.native
  
  var _stream: Stream = js.native
  
  def _streamEnd(): Unit = js.native
  
  var position: Double = js.native
}
