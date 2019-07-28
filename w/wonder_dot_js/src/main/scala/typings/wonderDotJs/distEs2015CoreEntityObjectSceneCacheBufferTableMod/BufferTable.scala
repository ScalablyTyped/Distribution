package typings.wonderDotJs.distEs2015CoreEntityObjectSceneCacheBufferTableMod

import typings.wonderDotJs.distEs2015RendererBufferBufferMod.Buffer
import typings.wonderDotJs.distEs2015RendererBufferElementBufferMod.ElementBuffer
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
  var lastBindedArrayBufferListUidStr: String = js.native
  var lastBindedElementBuffer: ElementBuffer = js.native
  def addBuffer(key: String, buffer: Buffer): Unit = js.native
  def bindIndexBuffer(indexBuffer: ElementBuffer): Unit = js.native
  def clearAll(): Unit = js.native
  def dispose(): Unit = js.native
  def getBuffer[T](key: String): T = js.native
  def hasBuffer(key: String): Boolean = js.native
  def resetBindedArrayBuffer(): Unit = js.native
  def resetBindedElementBuffer(): Unit = js.native
}

