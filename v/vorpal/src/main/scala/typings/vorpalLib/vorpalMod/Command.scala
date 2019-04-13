package typings
package vorpalLib.vorpalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vorpal", "Command")
@js.native
class Command () extends js.Object {
  var _cancel: js.UndefOr[Cancel] = js.native
  @JSName("_fn")
  var _fn_Original: Action = js.native
  var _name: java.lang.String = js.native
  def _fn(args: Args): js.Promise[scala.Unit] = js.native
  def action(action: Action): this.type = js.native
  def alias(command: java.lang.String): this.type = js.native
  def allowUnknownOptions(): this.type = js.native
  def autocomplete(values: js.Array[java.lang.String]): this.type = js.native
  def autocomplete(values: vorpalLib.Anon_Data): this.type = js.native
  def cancel(cancel: Cancel): this.type = js.native
  def help(value: js.Function1[/* args */ Args, scala.Unit]): this.type = js.native
  def hidden(): this.type = js.native
  def option(option: java.lang.String, description: java.lang.String): this.type = js.native
  def option(option: java.lang.String, description: java.lang.String, autocomplete: js.Array[java.lang.String]): this.type = js.native
  def parse(value: js.Function2[/* command */ java.lang.String, /* args */ Args, java.lang.String]): this.type = js.native
  def remove(): this.type = js.native
  def types(types: vorpalLib.Anon_String): this.type = js.native
  def validate(value: js.Function1[/* args */ Args, scala.Boolean | java.lang.String]): this.type = js.native
}

