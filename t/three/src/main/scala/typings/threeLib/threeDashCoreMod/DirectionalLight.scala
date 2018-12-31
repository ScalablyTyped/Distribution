package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "DirectionalLight")
@js.native
class DirectionalLight () extends Light {
  def this(color: java.lang.String) = this()
  def this(color: scala.Double) = this()
  def this(color: Color) = this()
  def this(color: java.lang.String, intensity: scala.Double) = this()
  def this(color: scala.Double, intensity: scala.Double) = this()
  def this(color: Color, intensity: scala.Double) = this()
  @JSName("shadow")
  var shadow_DirectionalLight: DirectionalLightShadow = js.native
  /**
    * Target used for shadow camera orientation.
    */
  var target: Object3D = js.native
}

