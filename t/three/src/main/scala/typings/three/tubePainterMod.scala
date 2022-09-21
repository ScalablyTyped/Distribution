package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Matrix4
import typings.three.threeMod.Mesh
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tubePainterMod {
  
  @JSImport("three/examples/jsm/misc/TubePainter", "TubePainter")
  @js.native
  open class TubePainter () extends StObject {
    
    var mesh: Mesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def stroke(position1: Vector3, position2: Vector3, matrix1: Matrix4, matrix2: Matrix4): Unit = js.native
    
    def updateGeometry(start: Double, end: Double): Unit = js.native
  }
}
