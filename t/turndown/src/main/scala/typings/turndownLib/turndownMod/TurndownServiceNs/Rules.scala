package typings
package turndownLib.turndownMod.TurndownServiceNs

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
  def add(key: Filter, rule: Rule): scala.Unit = js.native
  def blankRule(content: java.lang.String, node: Node, options: Options): java.lang.String = js.native
  def defaultRule(content: java.lang.String, node: Node, options: Options): java.lang.String = js.native
  def forEach(callback: js.Function2[/* rule */ Rule, /* index */ scala.Double, _]): scala.Unit = js.native
  def forNode(node: Node): Rule = js.native
  def keep(filter: Filter): scala.Unit = js.native
  def keepReplacement(content: java.lang.String, node: Node, options: Options): java.lang.String = js.native
  def remove(filter: Filter): scala.Unit = js.native
}

