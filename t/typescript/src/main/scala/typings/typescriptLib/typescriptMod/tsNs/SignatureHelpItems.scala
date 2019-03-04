package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of signature help items, and the preferred item that should be selected.
  */
trait SignatureHelpItems extends js.Object {
  var applicableSpan: TextSpan
  var argumentCount: scala.Double
  var argumentIndex: scala.Double
  var items: js.Array[SignatureHelpItem]
  var selectedItemIndex: scala.Double
}

object SignatureHelpItems {
  @scala.inline
  def apply(
    applicableSpan: TextSpan,
    argumentCount: scala.Double,
    argumentIndex: scala.Double,
    items: js.Array[SignatureHelpItem],
    selectedItemIndex: scala.Double
  ): SignatureHelpItems = {
    val __obj = js.Dynamic.literal(applicableSpan = applicableSpan, argumentCount = argumentCount, argumentIndex = argumentIndex, items = items, selectedItemIndex = selectedItemIndex)
  
    __obj.asInstanceOf[SignatureHelpItems]
  }
}

