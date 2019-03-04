package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameInherits extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var inherits: scala.Boolean
  var lineno: scala.Double
  var segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var `val`: java.lang.String
}

object Anon_ColumnFilenameInherits {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    inherits: scala.Boolean,
    lineno: scala.Double,
    segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    `val`: java.lang.String
  ): Anon_ColumnFilenameInherits = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, inherits = inherits, lineno = lineno, segments = segments)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ColumnFilenameInherits]
  }
}

