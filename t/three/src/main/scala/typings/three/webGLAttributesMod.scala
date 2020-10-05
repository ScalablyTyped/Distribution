package typings.three

import typings.std.GLenum
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import typings.three.anon.BytesPerElement
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.interleavedBufferAttributeMod.InterleavedBufferAttribute
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLAttributes", JSImport.Namespace)
@js.native
object webGLAttributesMod extends js.Object {
  @js.native
  class WebGLAttributes protected () extends js.Object {
    def this(gl: WebGL2RenderingContext, capabilities: WebGLCapabilities) = this()
    def this(gl: WebGLRenderingContext, capabilities: WebGLCapabilities) = this()
    def get(attribute: BufferAttribute): BytesPerElement = js.native
    def get(attribute: InterleavedBufferAttribute): BytesPerElement = js.native
    def remove(attribute: BufferAttribute): Unit = js.native
    def remove(attribute: InterleavedBufferAttribute): Unit = js.native
    def update(attribute: BufferAttribute, bufferType: GLenum): Unit = js.native
    def update(attribute: InterleavedBufferAttribute, bufferType: GLenum): Unit = js.native
  }
  
}

