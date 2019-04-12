package typings
package threeLib.srcHelpersArrowHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/ArrowHelper", "ArrowHelper")
@js.native
class ArrowHelper protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(dir: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(dir: threeLib.srcMathVector3Mod.Vector3, origin: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(dir: threeLib.srcMathVector3Mod.Vector3, origin: threeLib.srcMathVector3Mod.Vector3, length: scala.Double) = this()
  def this(dir: threeLib.srcMathVector3Mod.Vector3, origin: threeLib.srcMathVector3Mod.Vector3, length: scala.Double, hex: scala.Double) = this()
  def this(dir: threeLib.srcMathVector3Mod.Vector3, origin: threeLib.srcMathVector3Mod.Vector3, length: scala.Double, hex: scala.Double, headLength: scala.Double) = this()
  def this(dir: threeLib.srcMathVector3Mod.Vector3, origin: threeLib.srcMathVector3Mod.Vector3, length: scala.Double, hex: scala.Double, headLength: scala.Double, headWidth: scala.Double) = this()
  var cone: threeLib.srcObjectsMeshMod.Mesh = js.native
  var line: threeLib.srcObjectsLineMod.Line = js.native
  def setColor(color: threeLib.srcMathColorMod.Color): scala.Unit = js.native
  def setDirection(dir: threeLib.srcMathVector3Mod.Vector3): scala.Unit = js.native
  def setLength(length: scala.Double): scala.Unit = js.native
  def setLength(length: scala.Double, headLength: scala.Double): scala.Unit = js.native
  def setLength(length: scala.Double, headLength: scala.Double, headWidth: scala.Double): scala.Unit = js.native
}

