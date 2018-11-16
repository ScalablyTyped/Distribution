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

