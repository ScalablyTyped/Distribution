package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlphaMap extends js.Object {
  var alphaMap: threeLib.threeDashCoreMod.IUniform
  var diffuse: threeLib.threeDashCoreMod.IUniform
  var map: threeLib.threeDashCoreMod.IUniform
  var opacity: threeLib.threeDashCoreMod.IUniform
  var uvTransform: threeLib.threeDashCoreMod.IUniform
}

object Anon_AlphaMap {
  @scala.inline
  def apply(
    alphaMap: threeLib.threeDashCoreMod.IUniform,
    diffuse: threeLib.threeDashCoreMod.IUniform,
    map: threeLib.threeDashCoreMod.IUniform,
    opacity: threeLib.threeDashCoreMod.IUniform,
    uvTransform: threeLib.threeDashCoreMod.IUniform
  ): Anon_AlphaMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alphaMap")(alphaMap)
    __obj.updateDynamic("diffuse")(diffuse)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("uvTransform")(uvTransform)
    __obj.asInstanceOf[Anon_AlphaMap]
  }
}

