package typings.vorpal.vorpalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vorpal extends js.Object {
  var activeCommand: CommandInstance = js.native
  var ui: UI = js.native
  def `catch`(command: String): Catch = js.native
  def `catch`(command: String, description: String): Catch = js.native
  def command(command: String): Command = js.native
  def command(command: String, description: String): Command = js.native
  def delimiter(value: String): this.type = js.native
  def exec(command: String): js.Promise[js.Object] = js.native
  def execSync(command: String): js.Promise[js.Object] = js.native
  def find(command: String): Command = js.native
  def help(value: js.Function1[/* cmd */ String, String]): this.type = js.native
  def hide(): this.type = js.native
  def history(id: String): this.type = js.native
  def localStorage(id: String): js.Object = js.native
  def log(value: String, values: String*): this.type = js.native
  def parse(argv: js.Array[String]): this.type = js.native
  def pipe(value: js.Function1[/* stdout */ String, String]): this.type = js.native
  def show(): this.type = js.native
  def sigint(value: js.Function0[Unit]): this.type = js.native
  def use(extension: Extension): this.type = js.native
  def version(version: String): this.type = js.native
}

