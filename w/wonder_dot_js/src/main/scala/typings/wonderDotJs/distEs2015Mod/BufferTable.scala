package typings.wonderDotJs.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "BufferTable")
@js.native
class BufferTable ()
  extends typings.wonderDotJs.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTable

/* static members */
@JSImport("wonder.js/dist/es2015", "BufferTable")
@js.native
object BufferTable extends js.Object {
  var lastBindedArrayBufferListUidStr: String = js.native
  var lastBindedElementBuffer: typings.wonderDotJs.distEs2015RendererBufferElementBufferMod.ElementBuffer = js.native
  def addBuffer(key: String, buffer: typings.wonderDotJs.distEs2015RendererBufferBufferMod.Buffer): Unit = js.native
  def bindIndexBuffer(indexBuffer: typings.wonderDotJs.distEs2015RendererBufferElementBufferMod.ElementBuffer): Unit = js.native
  def clearAll(): Unit = js.native
  def dispose(): Unit = js.native
  def getBuffer[T](key: String): T = js.native
  def hasBuffer(key: String): Boolean = js.native
  def resetBindedArrayBuffer(): Unit = js.native
  def resetBindedElementBuffer(): Unit = js.native
}

