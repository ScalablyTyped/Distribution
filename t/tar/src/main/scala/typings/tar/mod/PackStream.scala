package typings.tar.mod

import typings.node.NodeJS.ReadWriteStream
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackStream
  extends StObject
     with ReadWriteStream {
  
  var _buffer: js.Array[Stream] = js.native
  
  var _currentEntry: Any = js.native
  
  var _global: HeaderProperties = js.native
  
  var _needDrain: Boolean = js.native
  
  var _noProprietary: Boolean = js.native
  
  var _paused: Boolean = js.native
  
  var _pipeRoot: Stream = js.native
  
  def _process(): Unit = js.native
  
  var _processing: Boolean = js.native
  
  def add(stream: Stream): Boolean = js.native
  
  def addGlobal(props: HeaderProperties): Unit = js.native
  
  def destroy(): Unit = js.native
}
