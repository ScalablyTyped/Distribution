package typings.three

import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import typings.three.anon.BytesPerElement
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreGlbufferattributeMod.GLBufferAttribute
import typings.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLAttributesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLAttributes", "WebGLAttributes")
  @js.native
  open class WebGLAttributes protected () extends StObject {
    def this(gl: WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
    def this(gl: WebGLRenderingContext, capabilities: WebGLCapabilities) = this()
    
    def get(attribute: BufferAttribute): BytesPerElement = js.native
    def get(attribute: GLBufferAttribute): BytesPerElement = js.native
    def get(attribute: InterleavedBufferAttribute): BytesPerElement = js.native
    
    def remove(attribute: BufferAttribute): Unit = js.native
    def remove(attribute: GLBufferAttribute): Unit = js.native
    def remove(attribute: InterleavedBufferAttribute): Unit = js.native
    
    def update(attribute: BufferAttribute, bufferType: Double): Unit = js.native
    def update(attribute: GLBufferAttribute, bufferType: Double): Unit = js.native
    def update(attribute: InterleavedBufferAttribute, bufferType: Double): Unit = js.native
  }
}
