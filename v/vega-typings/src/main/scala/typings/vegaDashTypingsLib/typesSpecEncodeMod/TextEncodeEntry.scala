package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncodeEntry
  extends EncodeEntry
     with AlignProperty
     with ThetaProperty {
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var baseline: js.UndefOr[ProductionRule[ScaledValueRef[TextBaseline]]] = js.undefined
  var dir: js.UndefOr[ProductionRule[ScaledValueRef[TextDirection]]] = js.undefined
  var dx: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var dy: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var ellipsis: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var font: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  var fontSize: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var fontStyle: js.UndefOr[ProductionRule[ScaledValueRef[FontStyle]]] = js.undefined
  var fontWeight: js.UndefOr[ProductionRule[ScaledValueRef[FontWeight]]] = js.undefined
  var limit: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var radius: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  var text: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
}

