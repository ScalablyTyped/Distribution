package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Plane")
@js.native
class Plane ()
  extends threeLib.threeDashCoreMod.Plane {
  def this(normal: threeLib.threeDashCoreMod.Vector3) = this()
  def this(normal: threeLib.threeDashCoreMod.Vector3, constant: scala.Double) = this()
}

