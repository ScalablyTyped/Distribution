package typings.three

import typings.std.WebGLRenderingContext
import typings.three.bufferAttributeMod.BufferAttribute
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import typings.three.object3DMod.Object3D
import typings.three.webGLAttributesMod.WebGLAttributes
import typings.three.webGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLGeometriesMod {
  
  @JSImport("three/src/renderers/webgl/WebGLGeometries", "WebGLGeometries")
  @js.native
  class WebGLGeometries protected () extends StObject {
    def this(gl: WebGLRenderingContext, attributes: WebGLAttributes, info: WebGLInfo) = this()
    
    def get(`object`: Object3D, geometry: BufferGeometry): BufferGeometry = js.native
    def get(`object`: Object3D, geometry: Geometry): BufferGeometry = js.native
    
    def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native
    def getWireframeAttribute(geometry: Geometry): BufferAttribute = js.native
    
    def update(geometry: BufferGeometry): Unit = js.native
    def update(geometry: Geometry): Unit = js.native
  }
}
