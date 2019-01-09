package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageEncodeEntry
  extends EncodeEntry
     with AlignProperty {
  var aspect: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
  var baseline: js.UndefOr[ProductionRule[ScaledValueRef[Baseline]]] = js.undefined
  var url: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
}

