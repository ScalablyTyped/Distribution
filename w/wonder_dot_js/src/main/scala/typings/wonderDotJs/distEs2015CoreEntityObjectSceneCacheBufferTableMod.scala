package typings.wonderDotJs

import org.scalablytyped.runtime.TopLevel
import typings.wonderDotJs.distEs2015RendererBufferBufferMod.Buffer
import typings.wonderDotJs.distEs2015RendererBufferElementBufferMod.ElementBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", JSImport.Namespace)
@js.native
object distEs2015CoreEntityObjectSceneCacheBufferTableMod extends js.Object {
  @js.native
  class BufferTable () extends js.Object
  
  @js.native
  sealed trait BufferTableKey extends js.Object
  
  /* static members */
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
  
  @js.native
  object BufferTableKey extends js.Object {
    @js.native
    sealed trait PROCEDURAL_INDEX extends BufferTableKey
    
    @js.native
    sealed trait PROCEDURAL_VERTEX extends BufferTableKey
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BufferTableKey with Double] = js.native
    /* 1 */ @js.native
    object PROCEDURAL_INDEX extends TopLevel[PROCEDURAL_INDEX with Double]
    
    /* 0 */ @js.native
    object PROCEDURAL_VERTEX extends TopLevel[PROCEDURAL_VERTEX with Double]
    
  }
  
}

