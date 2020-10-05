package typings.three.geometriesMod

import typings.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.extrudeGeometryMod.UVGenerator
import typings.three.shapeMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typings.three.extrudeGeometryMod.ExtrudeGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three/src/geometries/Geometries", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

