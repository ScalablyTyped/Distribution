package typings.three.buildThreeMod

import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three", "ExtrudeGeometry")
@js.native
/**
  * Create a new instance of {@link ExtrudeGeometry}
  * @param shapes Shape or an array of shapes. Default `new Shape([new Vector2(0.5, 0.5), new Vector2(-0.5, 0.5), new Vector2(-0.5, -0.5), new Vector2(0.5, -0.5)])`.
  * @param options Object that can contain the following parameters. @see {@link ExtrudeGeometryOptions} for defaults.
  */
open class ExtrudeGeometry ()
  extends typings.three.srcThreeMod.ExtrudeGeometry {
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Unit, options: ExtrudeGeometryOptions) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}
/* static members */
object ExtrudeGeometry {
  
  @JSImport("three/build/three", "ExtrudeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromJSON(data: js.Object, shapes: Any): typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry]
}
