package typings.wonderJs

import typings.wonderJs.bufferMod.Buffer
import typings.wonderJs.elementBufferMod.ElementBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferTableMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTable")
  @js.native
  class BufferTable () extends StObject
  /* static members */
  object BufferTable {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addBuffer(key: String, buffer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBuffer")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def bindIndexBuffer(indexBuffer: ElementBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bindIndexBuffer")(indexBuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAll")().asInstanceOf[Unit]
    
    inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
    
    inline def getBuffer[T](key: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getBuffer")(key.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def hasBuffer(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBuffer")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTable.lastBindedArrayBufferListUidStr")
    @js.native
    def lastBindedArrayBufferListUidStr: String = js.native
    inline def lastBindedArrayBufferListUidStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastBindedArrayBufferListUidStr")(x.asInstanceOf[js.Any])
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTable.lastBindedElementBuffer")
    @js.native
    def lastBindedElementBuffer: ElementBuffer = js.native
    inline def lastBindedElementBuffer_=(x: ElementBuffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastBindedElementBuffer")(x.asInstanceOf[js.Any])
    
    inline def resetBindedArrayBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetBindedArrayBuffer")().asInstanceOf[Unit]
    
    inline def resetBindedElementBuffer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetBindedElementBuffer")().asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait BufferTableKey extends StObject
  @JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTableKey")
  @js.native
  object BufferTableKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[BufferTableKey & Double] = js.native
    
    @js.native
    sealed trait PROCEDURAL_INDEX
      extends StObject
         with BufferTableKey
    /* 1 */ val PROCEDURAL_INDEX: typings.wonderJs.bufferTableMod.BufferTableKey.PROCEDURAL_INDEX & Double = js.native
    
    @js.native
    sealed trait PROCEDURAL_VERTEX
      extends StObject
         with BufferTableKey
    /* 0 */ val PROCEDURAL_VERTEX: typings.wonderJs.bufferTableMod.BufferTableKey.PROCEDURAL_VERTEX & Double = js.native
  }
}
