package typings
package turndownLib.turndownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurndownService extends js.Object {
  var options: Options = js.native
  var rules: Rules = js.native
  def addRule(key: java.lang.String, rule: Rule): this.type = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def keep(filter: Filter): this.type = js.native
  def remove(filter: Filter): this.type = js.native
  def turndown(html: java.lang.String): java.lang.String = js.native
  def turndown(html: Node): java.lang.String = js.native
  def use(plugins: js.Array[Plugin]): this.type = js.native
  def use(plugins: Plugin): this.type = js.native
}

