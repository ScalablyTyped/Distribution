package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumnFilenameLinenoSegments extends js.Object {
  var __type: java.lang.String
  var block: js.UndefOr[stylusLib.stylusMod.StylusNs.NodesNs.Block] = js.undefined
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  var `type`: java.lang.String
}

object Anon_BlockColumnFilenameLinenoSegments {
  @scala.inline
  def apply(
    __type: java.lang.String,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node],
    `type`: java.lang.String,
    block: stylusLib.stylusMod.StylusNs.NodesNs.Block = null
  ): Anon_BlockColumnFilenameLinenoSegments = {
    val __obj = js.Dynamic.literal(__type = __type, column = column, filename = filename, lineno = lineno, segments = segments)
    __obj.updateDynamic("type")(`type`)
    if (block != null) __obj.updateDynamic("block")(block)
    __obj.asInstanceOf[Anon_BlockColumnFilenameLinenoSegments]
  }
}

