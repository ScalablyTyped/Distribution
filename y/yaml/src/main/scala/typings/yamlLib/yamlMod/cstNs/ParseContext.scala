package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseContext extends js.Object {
  /** Node starts at beginning of line */
  var atLineStart: scala.Boolean
  /** true if currently in a collection context */
  var inCollection: scala.Boolean
  /** true if currently in a flow context */
  var inFlow: scala.Boolean
  /** Current level of indentation */
  var indent: scala.Double
  /** Start of the current line */
  var lineStart: scala.Double
  /** The parent of the node */
  var parent: Node
  /** Source of the YAML document */
  var src: java.lang.String
}

object ParseContext {
  @scala.inline
  def apply(
    atLineStart: scala.Boolean,
    inCollection: scala.Boolean,
    inFlow: scala.Boolean,
    indent: scala.Double,
    lineStart: scala.Double,
    parent: Node,
    src: java.lang.String
  ): ParseContext = {
    val __obj = js.Dynamic.literal(atLineStart = atLineStart, inCollection = inCollection, inFlow = inFlow, indent = indent, lineStart = lineStart, parent = parent, src = src)
  
    __obj.asInstanceOf[ParseContext]
  }
}

