package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumnCond extends js.Object {
  var __type: java.lang.String
  var block: stylusLib.stylusMod.StylusNs.NodesNs.Block
  var column: scala.Double
  var cond: stylusLib.stylusMod.StylusNs.NodesNs.Expression
  var elses: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Expression]
  var filename: java.lang.String
  var lineno: scala.Double
  var negate: scala.Boolean
}

object Anon_BlockColumnCond {
  @scala.inline
  def apply(
    __type: java.lang.String,
    block: stylusLib.stylusMod.StylusNs.NodesNs.Block,
    column: scala.Double,
    cond: stylusLib.stylusMod.StylusNs.NodesNs.Expression,
    elses: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Expression],
    filename: java.lang.String,
    lineno: scala.Double,
    negate: scala.Boolean
  ): Anon_BlockColumnCond = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("__type")(__type)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("cond")(cond)
    __obj.updateDynamic("elses")(elses)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("negate")(negate)
    __obj.asInstanceOf[Anon_BlockColumnCond]
  }
}

