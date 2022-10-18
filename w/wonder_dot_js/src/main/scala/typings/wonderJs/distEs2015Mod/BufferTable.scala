package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "BufferTable")
@js.native
open class BufferTable ()
  extends typings.wonderJs.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTable
/* static members */
object BufferTable {
  
  @JSImport("wonder.js/dist/es2015", "BufferTable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBuffer(key: String, buffer: typings.wonderJs.distEs2015RendererBufferBufferMod.Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBuffer")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bindIndexBuffer(indexBuffer: typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindIndexBuffer")(indexBuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
  
  inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
  
  inline def getBuffer[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuffer")(key.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def hasBuffer(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBuffer")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("wonder.js/dist/es2015", "BufferTable.lastBindedArrayBufferListUidStr")
  @js.native
  def lastBindedArrayBufferListUidStr: String = js.native
  inline def lastBindedArrayBufferListUidStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastBindedArrayBufferListUidStr")(x.asInstanceOf[js.Any])
  
  @JSImport("wonder.js/dist/es2015", "BufferTable.lastBindedElementBuffer")
  @js.native
  def lastBindedElementBuffer: typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer = js.native
  inline def lastBindedElementBuffer_=(x: typings.wonderJs.distEs2015RendererBufferElementBufferMod.ElementBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastBindedElementBuffer")(x.asInstanceOf[js.Any])
  
  inline def resetBindedArrayBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetBindedArrayBuffer")().asInstanceOf[Unit]
  
  inline def resetBindedElementBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetBindedElementBuffer")().asInstanceOf[Unit]
}
