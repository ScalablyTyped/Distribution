package typings.three

import typings.std.WebGLBuffer
import typings.three.threeBooleans.`true`
import typings.three.threeNumbers.`1`
import typings.three.threeNumbers.`2`
import typings.three.threeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glbufferattributeMod {
  
  @JSImport("three/src/core/GLBufferAttribute", "GLBufferAttribute")
  @js.native
  open class GLBufferAttribute protected () extends StObject {
    def this(buffer: WebGLBuffer, `type`: Double, itemSize: Double, elementSize: `1` | `2` | `4`, count: Double) = this()
    
    var buffer: WebGLBuffer = js.native
    
    var count: Double = js.native
    
    var elementSize: `1` | `2` | `4` = js.native
    
    val isGLBufferAttribute: `true` = js.native
    
    var itemSize: Double = js.native
    
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    def setBuffer(buffer: WebGLBuffer): this.type = js.native
    
    def setCount(count: Double): this.type = js.native
    
    def setItemSize(itemSize: Double): this.type = js.native
    
    def setType(`type`: Double, elementSize: `1` | `2` | `4`): this.type = js.native
    
    var `type`: Double = js.native
    
    var version: Double = js.native
  }
}
