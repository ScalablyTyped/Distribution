package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "MorphBlendMesh")
@js.native
class MorphBlendMesh protected () extends Mesh {
  def this(geometry: Geometry, material: Material) = this()
  var animationsList: js.Array[MorphBlendMeshAnimation] = js.native
  var animationsMap: ScalablyTyped.runtime.StringDictionary[MorphBlendMeshAnimation] = js.native
  def autoCreateAnimations(fps: scala.Double): scala.Unit = js.native
  def createAnimation(name: java.lang.String, start: scala.Double, end: scala.Double, fps: scala.Double): scala.Unit = js.native
  def getAnimationDuration(name: java.lang.String): scala.Double = js.native
  def getAnimationTime(name: java.lang.String): scala.Double = js.native
  def playAnimation(name: java.lang.String): scala.Unit = js.native
  def setAnimationDirectionBackward(name: java.lang.String): scala.Unit = js.native
  def setAnimationDirectionForward(name: java.lang.String): scala.Unit = js.native
  def setAnimationDuration(name: java.lang.String, duration: scala.Double): scala.Unit = js.native
  def setAnimationFPS(name: java.lang.String, fps: scala.Double): scala.Unit = js.native
  def setAnimationTime(name: java.lang.String, time: scala.Double): scala.Unit = js.native
  def setAnimationWeight(name: java.lang.String, weight: scala.Double): scala.Unit = js.native
  def stopAnimation(name: java.lang.String): scala.Unit = js.native
  def update(delta: scala.Double): scala.Unit = js.native
}

