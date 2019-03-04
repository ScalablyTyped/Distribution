package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var __type: java.lang.String
  var block: stylusLib.stylusMod.StylusNs.NodesNs.Block
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_Block {
  @scala.inline
  def apply(
    __type: java.lang.String,
    block: stylusLib.stylusMod.StylusNs.NodesNs.Block,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    nodes: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, filename = filename, lineno = lineno, nodes = nodes)
  
    __obj.asInstanceOf[Anon_Block]
  }
}

