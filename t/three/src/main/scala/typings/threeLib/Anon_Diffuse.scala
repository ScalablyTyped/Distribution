package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Diffuse extends js.Object {
  var diffuse: threeLib.threeDashCoreMod.IUniform
  var map: threeLib.threeDashCoreMod.IUniform
  var opacity: threeLib.threeDashCoreMod.IUniform
  var scale: threeLib.threeDashCoreMod.IUniform
  var size: threeLib.threeDashCoreMod.IUniform
  var uvTransform: threeLib.threeDashCoreMod.IUniform
}

object Anon_Diffuse {
  @scala.inline
  def apply(
    diffuse: threeLib.threeDashCoreMod.IUniform,
    map: threeLib.threeDashCoreMod.IUniform,
    opacity: threeLib.threeDashCoreMod.IUniform,
    scale: threeLib.threeDashCoreMod.IUniform,
    size: threeLib.threeDashCoreMod.IUniform,
    uvTransform: threeLib.threeDashCoreMod.IUniform
  ): Anon_Diffuse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diffuse")(diffuse)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uvTransform")(uvTransform)
    __obj.asInstanceOf[Anon_Diffuse]
  }
}

