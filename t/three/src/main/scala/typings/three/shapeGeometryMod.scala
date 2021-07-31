package typings.three

import typings.three.geometryMod.Geometry
import typings.three.shapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeGeometryMod {
  
  @JSImport("three/src/geometries/ShapeGeometry", "ShapeGeometry")
  @js.native
  class ShapeGeometry protected () extends Geometry {
    def this(shapes: js.Array[Shape]) = this()
    /**
    	 * @param shapes
    	 * @param [curveSegments=12]
    	 */
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
    
    def addShape(shape: Shape): Unit = js.native
    def addShape(shape: Shape, options: js.Any): Unit = js.native
    
    def addShapeList(shapes: js.Array[Shape], options: js.Any): ShapeGeometry = js.native
  }
}
