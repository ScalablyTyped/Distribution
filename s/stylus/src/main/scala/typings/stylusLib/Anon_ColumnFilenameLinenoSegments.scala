package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnFilenameLinenoSegments extends js.Object {
  var __type: java.lang.String
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_ColumnFilenameLinenoSegments {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_ColumnFilenameLinenoSegments = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, segments = segments)
  
    __obj.asInstanceOf[Anon_ColumnFilenameLinenoSegments]
  }
}

