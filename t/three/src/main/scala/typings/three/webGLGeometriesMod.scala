package typings.three

import typings.std.WebGLRenderingContext
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.object3DMod.Object3D
import typings.three.webGLAttributesMod.WebGLAttributes
import typings.three.webGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLGeometriesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLGeometries", "WebGLGeometries")
  @js.native
  open class WebGLGeometries protected () extends StObject {
    def this(gl: WebGLRenderingContext, attributes: WebGLAttributes, info: WebGLInfo) = this()
    
    def get(`object`: Object3D[Event], geometry: BufferGeometry): BufferGeometry = js.native
    
    def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native
    
    def update(geometry: BufferGeometry): Unit = js.native
  }
}
