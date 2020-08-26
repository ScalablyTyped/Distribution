package typings.typedoc.tsInternalMod

import typings.std.Map
import typings.typedoc.typedocStrings.`object`
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.list
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType
  - typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType
  - typings.typedoc.tsInternalMod.TsConfigOnlyOption
  - typings.typedoc.tsInternalMod.CommandLineOptionOfListType
*/
trait CommandLineOption extends js.Object

object CommandLineOption {
  @scala.inline
  def CommandLineOptionOfCustomType(name: String, `type`: Map[Double | String, _]): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfPrimitiveType(name: String, `type`: string | number | boolean): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def TsConfigOnlyOption(name: String, `type`: `object`): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfListType(
    element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
    name: String,
    `type`: list
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
}

