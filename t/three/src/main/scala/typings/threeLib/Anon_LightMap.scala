package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LightMap extends js.Object {
  var lightMap: threeLib.threeDashCoreMod.IUniform
  var lightMapIntensity: threeLib.threeDashCoreMod.IUniform
}

object Anon_LightMap {
  @scala.inline
  def apply(
    lightMap: threeLib.threeDashCoreMod.IUniform,
    lightMapIntensity: threeLib.threeDashCoreMod.IUniform
  ): Anon_LightMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lightMap")(lightMap)
    __obj.updateDynamic("lightMapIntensity")(lightMapIntensity)
    __obj.asInstanceOf[Anon_LightMap]
  }
}

