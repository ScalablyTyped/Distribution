package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.materialMod.Material
import typings.three.threeMod.LineSegments
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vertexNormalsHelperMod {
  
  @JSImport("three/examples/jsm/helpers/VertexNormalsHelper", "VertexNormalsHelper")
  @js.native
  open class VertexNormalsHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D[Event]) = this()
    def this(`object`: Object3D[Event], size: Double) = this()
    def this(`object`: Object3D[Event], size: Double, hex: Double) = this()
    def this(`object`: Object3D[Event], size: Unit, hex: Double) = this()
    
    var `object`: Object3D[Event] = js.native
    
    var size: Double = js.native
    
    def update(): Unit = js.native
  }
}
