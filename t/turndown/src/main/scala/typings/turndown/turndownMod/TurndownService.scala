package typings.turndown.turndownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurndownService extends js.Object {
  var options: Options = js.native
  var rules: Rules = js.native
  def addRule(key: String, rule: Rule): this.type = js.native
  def escape(str: String): String = js.native
  def keep(filter: Filter): this.type = js.native
  def remove(filter: Filter): this.type = js.native
  def turndown(html: String): String = js.native
  def turndown(html: Node): String = js.native
  def use(plugins: js.Array[Plugin]): this.type = js.native
  def use(plugins: Plugin): this.type = js.native
}

