package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectLabelValue extends js.Object {
  var label: java.lang.String
  var value: java.lang.String | scala.Double | scala.Boolean
}

object SelectLabelValue {
  @scala.inline
  def apply(label: java.lang.String, value: java.lang.String | scala.Double | scala.Boolean): SelectLabelValue = {
    val __obj = js.Dynamic.literal(label = label, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectLabelValue]
  }
}

