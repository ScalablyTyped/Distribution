package typings.yaml.yamlMod.cst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseContext extends js.Object {
  /** Node starts at beginning of line */
  var atLineStart: Boolean
  /** true if currently in a collection context */
  var inCollection: Boolean
  /** true if currently in a flow context */
  var inFlow: Boolean
  /** Current level of indentation */
  var indent: Double
  /** Start of the current line */
  var lineStart: Double
  /** The parent of the node */
  var parent: Node
  /** Source of the YAML document */
  var src: String
}

object ParseContext {
  @scala.inline
  def apply(
    atLineStart: Boolean,
    inCollection: Boolean,
    inFlow: Boolean,
    indent: Double,
    lineStart: Double,
    parent: Node,
    src: String
  ): ParseContext = {
    val __obj = js.Dynamic.literal(atLineStart = atLineStart, inCollection = inCollection, inFlow = inFlow, indent = indent, lineStart = lineStart, parent = parent, src = src)
  
    __obj.asInstanceOf[ParseContext]
  }
}

