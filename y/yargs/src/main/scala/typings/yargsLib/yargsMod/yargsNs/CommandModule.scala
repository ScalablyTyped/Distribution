package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandModule[T, U] extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var builder: js.UndefOr[CommandBuilder[T, U]] = js.undefined
  var command: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var describe: js.UndefOr[java.lang.String | yargsLib.yargsLibNumbers.`false`] = js.undefined
  def handler(args: Arguments[U]): scala.Unit
}

object CommandModule {
  @scala.inline
  def apply[T, U](
    handler: js.Function1[Arguments[U], scala.Unit],
    aliases: js.Array[java.lang.String] | java.lang.String = null,
    builder: CommandBuilder[T, U] = null,
    command: js.Array[java.lang.String] | java.lang.String = null,
    describe: java.lang.String | yargsLib.yargsLibNumbers.`false` = null
  ): CommandModule[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handler")(handler)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (builder != null) __obj.updateDynamic("builder")(builder.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (describe != null) __obj.updateDynamic("describe")(describe.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandModule[T, U]]
  }
}

