package typings
package wonderDotJsLib.distEs2015CoreEntityObjectSceneCacheBufferTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTable")
@js.native
class BufferTable () extends js.Object

/* static members */
@JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTable")
@js.native
object BufferTable extends js.Object {
  var lastBindedArrayBufferListUidStr: java.lang.String = js.native
  var lastBindedElementBuffer: wonderDotJsLib.distEs2015RendererBufferElementBufferMod.ElementBuffer = js.native
  def addBuffer(key: java.lang.String, buffer: wonderDotJsLib.distEs2015RendererBufferBufferMod.Buffer): scala.Unit = js.native
  def bindIndexBuffer(indexBuffer: wonderDotJsLib.distEs2015RendererBufferElementBufferMod.ElementBuffer): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def getBuffer[T](key: java.lang.String): T = js.native
  def hasBuffer(key: java.lang.String): scala.Boolean = js.native
  def resetBindedArrayBuffer(): scala.Unit = js.native
  def resetBindedElementBuffer(): scala.Unit = js.native
}

