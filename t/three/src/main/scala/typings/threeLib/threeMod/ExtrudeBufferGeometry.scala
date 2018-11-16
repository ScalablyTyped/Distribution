package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected ()
  extends threeLib.threeDashCoreMod.ExtrudeBufferGeometry {
  def this(shapes: js.Array[threeLib.threeDashCoreMod.Shape]) = this()
  def this(shapes: threeLib.threeDashCoreMod.Shape) = this()
  def this(shapes: js.Array[threeLib.threeDashCoreMod.Shape], options: threeLib.threeDashCoreMod.ExtrudeGeometryOptions) = this()
  def this(shapes: threeLib.threeDashCoreMod.Shape, options: threeLib.threeDashCoreMod.ExtrudeGeometryOptions) = this()
}

@JSImport("three", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: threeLib.threeDashCoreMod.UVGenerator = js.native
}

