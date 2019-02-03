package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "UnrealBloomPass")
@js.native
class UnrealBloomPass ()
  extends threeLib.threeDashUnrealbloompassMod.UnrealBloomPass {
  def this(resolution: threeLib.threeDashCoreMod.Vector2) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, strength: scala.Double) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, strength: scala.Double, radius: scala.Double) = this()
  def this(resolution: threeLib.threeDashCoreMod.Vector2, strength: scala.Double, radius: scala.Double, threshold: scala.Double) = this()
}

/* static members */
@JSImport("three", "UnrealBloomPass")
@js.native
object UnrealBloomPass extends js.Object {
  var BlurDirectionX: threeLib.threeDashCoreMod.Vector2 = js.native
  var BlurDirectionY: threeLib.threeDashCoreMod.Vector2 = js.native
}

