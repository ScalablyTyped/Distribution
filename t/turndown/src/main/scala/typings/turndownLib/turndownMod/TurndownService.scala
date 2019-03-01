package typings
package turndownLib.turndownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurndownService extends js.Object {
  var options: turndownLib.turndownMod.TurndownServiceNs.Options = js.native
  var rules: turndownLib.turndownMod.TurndownServiceNs.Rules = js.native
  def addRule(key: java.lang.String, rule: turndownLib.turndownMod.TurndownServiceNs.Rule): this.type = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def keep(filter: turndownLib.turndownMod.TurndownServiceNs.Filter): this.type = js.native
  def remove(filter: turndownLib.turndownMod.TurndownServiceNs.Filter): this.type = js.native
  def turndown(html: java.lang.String): java.lang.String = js.native
  def turndown(html: turndownLib.turndownMod.TurndownServiceNs.Node): java.lang.String = js.native
  def use(plugins: js.Array[turndownLib.turndownMod.TurndownServiceNs.Plugin]): this.type = js.native
  def use(plugins: turndownLib.turndownMod.TurndownServiceNs.Plugin): this.type = js.native
}

