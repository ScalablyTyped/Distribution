package typings.three

import typings.three.extrudeBufferGeometryMod.ExtrudeGeometryOptions
import typings.three.geometryMod.Geometry
import typings.three.shapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrudeGeometryMod {
  
  @JSImport("three/src/geometries/ExtrudeGeometry", "ExtrudeGeometry")
  @js.native
  class ExtrudeGeometry protected () extends Geometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
    def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
    
    def addShape(shape: Shape): Unit = js.native
    def addShape(shape: Shape, options: js.Any): Unit = js.native
    
    def addShapeList(shapes: js.Array[Shape]): Unit = js.native
    def addShapeList(shapes: js.Array[Shape], options: js.Any): Unit = js.native
  }
}
