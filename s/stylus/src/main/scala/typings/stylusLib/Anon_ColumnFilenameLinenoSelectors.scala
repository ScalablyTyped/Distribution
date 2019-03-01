package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoSelectors extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var selectors: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Selector]
}

object Anon_ColumnFilenameLinenoSelectors {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    selectors: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Selector]
  ): Anon_ColumnFilenameLinenoSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("selectors")(selectors)
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoSelectors]
  }
}

