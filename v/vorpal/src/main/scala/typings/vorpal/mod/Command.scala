package typings.vorpal.mod

import typings.vorpal.AnonData
import typings.vorpal.AnonString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vorpal", "Command")
@js.native
class Command () extends js.Object {
  var _cancel: js.UndefOr[Cancel] = js.native
  @JSName("_fn")
  var _fn_Original: Action = js.native
  var _name: String = js.native
  def _fn(args: Args): js.Promise[Unit] = js.native
  def action(action: Action): this.type = js.native
  def alias(command: String): this.type = js.native
  def allowUnknownOptions(): this.type = js.native
  def autocomplete(values: js.Array[String]): this.type = js.native
  def autocomplete(values: AnonData): this.type = js.native
  def cancel(cancel: Cancel): this.type = js.native
  def help(value: js.Function1[/* args */ Args, Unit]): this.type = js.native
  def hidden(): this.type = js.native
  def option(option: String, description: String): this.type = js.native
  def option(option: String, description: String, autocomplete: js.Array[String]): this.type = js.native
  def parse(value: js.Function2[/* command */ String, /* args */ Args, String]): this.type = js.native
  def remove(): this.type = js.native
  def types(types: AnonString): this.type = js.native
  def validate(value: js.Function1[/* args */ Args, Boolean | String]): this.type = js.native
}

