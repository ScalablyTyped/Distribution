package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.ShapeGeometry")
@js.native
open class ShapeGeometry ()
  extends typings.three.mod.ShapeGeometry {
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape], curveSegments: Double) = this()
  def this(shapes: Unit, curveSegments: Double) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape, curveSegments: Double) = this()
}
/* static members */
object ShapeGeometry {
  
  @JSGlobal("THREE.ShapeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry]
}
