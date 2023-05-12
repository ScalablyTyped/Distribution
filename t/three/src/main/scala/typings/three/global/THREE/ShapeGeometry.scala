package typings.three.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.ShapeGeometry")
@js.native
/**
  * Create a new instance of {@link ShapeGeometry}
  * @param shapes Array of shapes or a single {@link THREE.Shape | Shape}. Default `new Shape([new Vector2(0, 0.5), new Vector2(-0.5, -0.5), new Vector2(0.5, -0.5)])`, _a single triangle shape_.
  * @param curveSegments Number of segments per shape. Expects a `Integer`. Default `12`
  */
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
  
  /** @internal */
  inline def fromJSON(data: js.Object): typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesShapeGeometryMod.ShapeGeometry]
}
