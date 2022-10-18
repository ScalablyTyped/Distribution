package typings.three

import typings.std.WebGLRenderingContext
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcRenderersWebglWebGLAttributesMod.WebGLAttributes
import typings.three.srcRenderersWebglWebGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLGeometriesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLGeometries", "WebGLGeometries")
  @js.native
  open class WebGLGeometries protected () extends StObject {
    def this(gl: WebGLRenderingContext, attributes: WebGLAttributes, info: WebGLInfo) = this()
    
    def get(`object`: Object3D[Event], geometry: BufferGeometry): BufferGeometry = js.native
    
    def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native
    
    def update(geometry: BufferGeometry): Unit = js.native
  }
}
