package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "ExtrudeBufferGeometry")
@js.native
class ExtrudeBufferGeometry protected () extends BufferGeometry {
  def this(shapes: js.Array[Shape]) = this()
  def this(shapes: Shape) = this()
  def this(shapes: js.Array[Shape], options: ExtrudeGeometryOptions) = this()
  def this(shapes: Shape, options: ExtrudeGeometryOptions) = this()
  def addShape(shape: Shape): scala.Unit = js.native
  def addShape(shape: Shape, options: js.Any): scala.Unit = js.native
  def addShapeList(shapes: js.Array[Shape]): scala.Unit = js.native
  def addShapeList(shapes: js.Array[Shape], options: js.Any): scala.Unit = js.native
}

@JSImport("three/three-core", "ExtrudeBufferGeometry")
@js.native
object ExtrudeBufferGeometry extends js.Object {
  var WorldUVGenerator: threeLib.threeDashCoreMod.UVGenerator = js.native
}

