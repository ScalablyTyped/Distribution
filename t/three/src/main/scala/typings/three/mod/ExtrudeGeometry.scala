package typings.three.mod

import typings.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.extrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends typings.three.geometriesMod.ExtrudeGeometry {
  def this(shapes: js.Array[typings.three.shapeMod.Shape]) = this()
  def this(shapes: typings.three.shapeMod.Shape) = this()
  def this(shapes: js.Array[typings.three.shapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typings.three.shapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

