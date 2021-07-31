package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.shapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeBufferGeometryMod {
  
  @JSImport("three/src/geometries/ShapeBufferGeometry", "ShapeBufferGeometry")
  @js.native
  class ShapeBufferGeometry protected () extends BufferGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
  }
}
