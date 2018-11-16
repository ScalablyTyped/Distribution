package typings
package threeLib.threeDashOctreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-octree", "Octree")
@js.native
class Octree () extends js.Object {
  def this(parameters: js.Any) = this()
  def add(`object`: js.Any): js.Any = js.native
  def add(`object`: js.Any, options: js.Any): js.Any = js.native
  def addDeferred(`object`: js.Any): js.Any = js.native
  def addDeferred(`object`: js.Any, options: js.Any): js.Any = js.native
  def addObjectData(`object`: js.Any, part: js.Any): js.Any = js.native
  def extend(octree: Octree): js.Any = js.native
  def getDepthEnd(): scala.Double = js.native
  def getNodeCountEnd(): scala.Double = js.native
  def getObjectCountEnd(): scala.Double = js.native
  def rebuild(): js.Any = js.native
  def remove(`object`: js.Any): js.Any = js.native
  def search(
    position: threeLib.threeDashCoreMod.Vector3,
    radius: scala.Double,
    organizeByObject: scala.Boolean,
    direction: threeLib.threeDashCoreMod.Vector3
  ): js.Any = js.native
  def setRoot(root: js.Any): js.Any = js.native
  def toConsole(): js.Any = js.native
  def update(): scala.Unit = js.native
  def updateObject(`object`: js.Any): js.Any = js.native
}

