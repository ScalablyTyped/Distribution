package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "BoundingBoxHelper")
@js.native
class BoundingBoxHelper () extends Mesh {
  def this(`object`: Object3D) = this()
  def this(`object`: Object3D, hex: scala.Double) = this()
  var box: Box3 = js.native
  var `object`: Object3D = js.native
  def update(): scala.Unit = js.native
}

