package typings.three.mod

import typings.three.extrudeGeometryMod.ExtrudeGeometryOptions
import typings.three.extrudeGeometryMod.UVGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends typings.three.geometriesMod.ExtrudeBufferGeometry {
  def this(shapes: js.Array[typings.three.shapeMod.Shape]) = this()
  def this(shapes: typings.three.shapeMod.Shape) = this()
  def this(shapes: js.Array[typings.three.shapeMod.Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: typings.three.shapeMod.Shape, options: ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: UVGenerator = js.native
}

