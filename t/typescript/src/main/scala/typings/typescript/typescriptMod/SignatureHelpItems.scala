package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of signature help items, and the preferred item that should be selected.
  */
trait SignatureHelpItems extends js.Object {
  var applicableSpan: TextSpan
  var argumentCount: Double
  var argumentIndex: Double
  var items: js.Array[SignatureHelpItem]
  var selectedItemIndex: Double
}

object SignatureHelpItems {
  @scala.inline
  def apply(
    applicableSpan: TextSpan,
    argumentCount: Double,
    argumentIndex: Double,
    items: js.Array[SignatureHelpItem],
    selectedItemIndex: Double
  ): SignatureHelpItems = {
    val __obj = js.Dynamic.literal(applicableSpan = applicableSpan, argumentCount = argumentCount, argumentIndex = argumentIndex, items = items, selectedItemIndex = selectedItemIndex)
  
    __obj.asInstanceOf[SignatureHelpItems]
  }
}

