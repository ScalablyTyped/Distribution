package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplacementBias extends js.Object {
  var displacementBias: threeLib.threeDashCoreMod.IUniform
  var displacementMap: threeLib.threeDashCoreMod.IUniform
  var displacementScale: threeLib.threeDashCoreMod.IUniform
}

object Anon_DisplacementBias {
  @scala.inline
  def apply(
    displacementBias: threeLib.threeDashCoreMod.IUniform,
    displacementMap: threeLib.threeDashCoreMod.IUniform,
    displacementScale: threeLib.threeDashCoreMod.IUniform
  ): Anon_DisplacementBias = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displacementBias")(displacementBias)
    __obj.updateDynamic("displacementMap")(displacementMap)
    __obj.updateDynamic("displacementScale")(displacementScale)
    __obj.asInstanceOf[Anon_DisplacementBias]
  }
}

