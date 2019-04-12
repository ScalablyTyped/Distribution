package typings
package threeLib.srcScenesFogExp2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/FogExp2", "FogExp2")
@js.native
class FogExp2 protected ()
  extends threeLib.srcScenesFogMod.IFog {
  def this(hex: java.lang.String) = this()
  def this(hex: scala.Double) = this()
  def this(hex: java.lang.String, density: scala.Double) = this()
  def this(hex: scala.Double, density: scala.Double) = this()
  /* CompleteClass */
  override var color: threeLib.srcMathColorMod.Color = js.native
  /**
    * Defines how fast the fog will grow dense.
    * Default is 0.00025.
    */
  var density: scala.Double = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

