package typings.three.global.THREE

import typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.ExtrudeGeometry")
@js.native
open class ExtrudeGeometry ()
  extends typings.three.mod.ExtrudeGeometry {
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape]) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape) = this()
  def this(shapes: js.Array[typings.three.srcExtrasCoreShapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Unit, options: ExtrudeGeometryOptions) = this()
  def this(shapes: typings.three.srcExtrasCoreShapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}
/* static members */
object ExtrudeGeometry {
  
  @JSGlobal("THREE.ExtrudeGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesExtrudeGeometryMod.ExtrudeGeometry]
}
