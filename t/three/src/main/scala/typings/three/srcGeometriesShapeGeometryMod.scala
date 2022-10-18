package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcExtrasCoreShapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGeometriesShapeGeometryMod {
  
  @JSImport("three/src/geometries/ShapeGeometry", "ShapeGeometry")
  @js.native
  open class ShapeGeometry () extends BufferGeometry {
    def this(shapes: js.Array[Shape]) = this()
    def this(shapes: Shape) = this()
    def this(shapes: js.Array[Shape], curveSegments: Double) = this()
    def this(shapes: Unit, curveSegments: Double) = this()
    def this(shapes: Shape, curveSegments: Double) = this()
  }
  /* static members */
  object ShapeGeometry {
    
    @JSImport("three/src/geometries/ShapeGeometry", "ShapeGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: Any): ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[ShapeGeometry]
  }
}
