package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalMap extends js.Object {
  var normalMap: threeLib.threeDashCoreMod.IUniform
  var normalScale: threeLib.threeDashCoreMod.IUniform
}

object Anon_NormalMap {
  @scala.inline
  def apply(normalMap: threeLib.threeDashCoreMod.IUniform, normalScale: threeLib.threeDashCoreMod.IUniform): Anon_NormalMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("normalMap")(normalMap)
    __obj.updateDynamic("normalScale")(normalScale)
    __obj.asInstanceOf[Anon_NormalMap]
  }
}

