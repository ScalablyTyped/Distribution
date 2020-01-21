package typings.yargs.mod

import typings.yargs.yargsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandModule[T, U] extends js.Object {
  /** array of strings (or a single string) representing aliases of `exports.command`, positional args defined in an alias are ignored */
  var aliases: js.UndefOr[js.Array[String] | String] = js.undefined
  /** object declaring the options the command accepts, or a function accepting and returning a yargs instance */
  var builder: js.UndefOr[CommandBuilder[T, U]] = js.undefined
  /** string (or array of strings) that executes this command when given on the command line, first string may contain positional args */
  var command: js.UndefOr[js.Array[String] | String] = js.undefined
  /** string used as the description for the command in help text, use `false` for a hidden command */
  var describe: js.UndefOr[String | `false`] = js.undefined
  /** a function which will be passed the parsed argv. */
  def handler(args: Arguments[U]): Unit
}

object CommandModule {
  @scala.inline
  def apply[T, U](
    handler: Arguments[U] => Unit,
    aliases: js.Array[String] | String = null,
    builder: CommandBuilder[T, U] = null,
    command: js.Array[String] | String = null,
    describe: String | `false` = null
  ): CommandModule[T, U] = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler))
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (builder != null) __obj.updateDynamic("builder")(builder.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (describe != null) __obj.updateDynamic("describe")(describe.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandModule[T, U]]
  }
}

