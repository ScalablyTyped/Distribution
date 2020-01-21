package typings.turndown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules extends js.Object {
  var array: js.Array[Rule] = js.native
  @JSName("blankRule")
  var blankRule_Original: ReplacementFunction = js.native
  @JSName("defaultRule")
  var defaultRule_Original: ReplacementFunction = js.native
  @JSName("keepReplacement")
  var keepReplacement_Original: ReplacementFunction = js.native
  var options: Options = js.native
  def add(key: Filter, rule: Rule): Unit = js.native
  def blankRule(content: String, node: Node, options: Options): String = js.native
  def defaultRule(content: String, node: Node, options: Options): String = js.native
  def forEach(callback: js.Function2[/* rule */ Rule, /* index */ Double, _]): Unit = js.native
  def forNode(node: Node): Rule = js.native
  def keep(filter: Filter): Unit = js.native
  def keepReplacement(content: String, node: Node, options: Options): String = js.native
  def remove(filter: Filter): Unit = js.native
}

