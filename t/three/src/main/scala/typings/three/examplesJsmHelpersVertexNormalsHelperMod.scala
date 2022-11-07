package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.LineSegments
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersVertexNormalsHelperMod {
  
  @JSImport("three/examples/jsm/helpers/VertexNormalsHelper", "VertexNormalsHelper")
  @js.native
  open class VertexNormalsHelper protected ()
    extends LineSegments[BufferGeometry, Material | js.Array[Material]] {
    def this(`object`: Object3D[Event]) = this()
    def this(`object`: Object3D[Event], size: Double) = this()
    def this(`object`: Object3D[Event], size: Double, hex: Double) = this()
    def this(`object`: Object3D[Event], size: Unit, hex: Double) = this()
    
    def dispose(): Unit = js.native
    
    var `object`: Object3D[Event] = js.native
    
    var size: Double = js.native
    
    def update(): Unit = js.native
  }
}
