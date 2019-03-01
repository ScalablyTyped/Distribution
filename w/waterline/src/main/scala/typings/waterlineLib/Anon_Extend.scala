package typings
package waterlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extend extends js.Object {
  def extend(params: waterlineLib.waterlineMod.WaterlineNs.CollectionDefinition): waterlineLib.waterlineMod.WaterlineNs.CollectionClass
}

object Anon_Extend {
  @scala.inline
  def apply(
    extend: js.Function1[
      waterlineLib.waterlineMod.WaterlineNs.CollectionDefinition, 
      waterlineLib.waterlineMod.WaterlineNs.CollectionClass
    ]
  ): Anon_Extend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_Extend]
  }
}

