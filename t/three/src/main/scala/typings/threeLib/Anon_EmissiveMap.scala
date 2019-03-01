package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmissiveMap extends js.Object {
  var emissiveMap: threeLib.threeDashCoreMod.IUniform
}

object Anon_EmissiveMap {
  @scala.inline
  def apply(emissiveMap: threeLib.threeDashCoreMod.IUniform): Anon_EmissiveMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emissiveMap")(emissiveMap)
    __obj.asInstanceOf[Anon_EmissiveMap]
  }
}

