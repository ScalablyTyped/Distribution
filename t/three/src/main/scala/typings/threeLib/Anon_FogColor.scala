package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FogColor extends js.Object {
  var fogColor: threeLib.threeDashCoreMod.IUniform
  var fogDensity: threeLib.threeDashCoreMod.IUniform
  var fogFar: threeLib.threeDashCoreMod.IUniform
  var fogNear: threeLib.threeDashCoreMod.IUniform
}

object Anon_FogColor {
  @scala.inline
  def apply(
    fogColor: threeLib.threeDashCoreMod.IUniform,
    fogDensity: threeLib.threeDashCoreMod.IUniform,
    fogFar: threeLib.threeDashCoreMod.IUniform,
    fogNear: threeLib.threeDashCoreMod.IUniform
  ): Anon_FogColor = {
    val __obj = js.Dynamic.literal(fogColor = fogColor, fogDensity = fogDensity, fogFar = fogFar, fogNear = fogNear)
  
    __obj.asInstanceOf[Anon_FogColor]
  }
}

