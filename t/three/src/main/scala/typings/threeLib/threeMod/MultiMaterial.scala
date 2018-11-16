package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "MultiMaterial")
@js.native
class MultiMaterial ()
  extends threeLib.threeDashCoreMod.MultiMaterial {
  def this(materials: js.Array[threeLib.threeDashCoreMod.Material]) = this()
}

