package typings
package vorpalLib.vorpalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vorpal extends js.Object {
  var activeCommand: vorpalLib.vorpalMod.VorpalNs.CommandInstance = js.native
  var ui: vorpalLib.vorpalMod.VorpalNs.UI = js.native
  def `catch`(command: java.lang.String): vorpalLib.vorpalMod.VorpalNs.Catch = js.native
  def `catch`(command: java.lang.String, description: java.lang.String): vorpalLib.vorpalMod.VorpalNs.Catch = js.native
  def command(command: java.lang.String): vorpalLib.vorpalMod.VorpalNs.Command = js.native
  def command(command: java.lang.String, description: java.lang.String): vorpalLib.vorpalMod.VorpalNs.Command = js.native
  def delimiter(value: java.lang.String): this.type = js.native
  def exec(command: java.lang.String): stdLib.Promise[js.Object] = js.native
  def execSync(command: java.lang.String): stdLib.Promise[js.Object] = js.native
  def find(command: java.lang.String): vorpalLib.vorpalMod.VorpalNs.Command = js.native
  def help(value: js.Function1[/* cmd */ java.lang.String, java.lang.String]): this.type = js.native
  def hide(): this.type = js.native
  def history(id: java.lang.String): this.type = js.native
  def localStorage(id: java.lang.String): js.Object = js.native
  def log(value: java.lang.String, values: java.lang.String*): this.type = js.native
  def parse(argv: js.Array[java.lang.String]): this.type = js.native
  def pipe(value: js.Function1[/* stdout */ java.lang.String, java.lang.String]): this.type = js.native
  def show(): this.type = js.native
  def sigint(value: js.Function0[scala.Unit]): this.type = js.native
  def use(extension: vorpalLib.vorpalMod.VorpalNs.Extension): this.type = js.native
  def version(version: java.lang.String): this.type = js.native
}

