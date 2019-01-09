package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineEncodeEntry
  extends EncodeEntry
     with DefinedProperty {
  var interpolate: js.UndefOr[ProductionRule[ScaledValueRef[Interpolate]]] = js.undefined
  var tension: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
}

