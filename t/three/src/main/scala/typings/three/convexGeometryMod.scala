package typings.three

import typings.three.threeMod.BufferGeometry
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convexGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/ConvexGeometry", "ConvexGeometry")
  @js.native
  open class ConvexGeometry () extends BufferGeometry {
    def this(points: js.Array[Vector3]) = this()
  }
}
