package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MultiMaterial")
@js.native
class MultiMaterial () extends Material {
  def this(materials: js.Array[Material]) = this()
  var isMultiMaterial: threeLib.threeLibNumbers.`true` = js.native
  var materials: js.Array[Material] = js.native
}

