package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeGeometry")
@js.native
class ExtrudeGeometry protected ()
  extends threeLib.threeDashCoreMod.ExtrudeGeometry {
  def this(shapes: js.Array[threeLib.threeDashCoreMod.Shape]) = this()
  def this(shapes: threeLib.threeDashCoreMod.Shape) = this()
  def this(shapes: js.Array[threeLib.threeDashCoreMod.Shape], options: threeLib.threeDashCoreMod.ExtrudeGeometryOptions) = this()
  def this(shapes: threeLib.threeDashCoreMod.Shape, options: threeLib.threeDashCoreMod.ExtrudeGeometryOptions) = this()
}

/* static members */
@JSImport("three", "ExtrudeGeometry")
@js.native
object ExtrudeGeometry extends js.Object {
  var WorldUVGenerator: threeLib.threeDashCoreMod.UVGenerator = js.native
}

