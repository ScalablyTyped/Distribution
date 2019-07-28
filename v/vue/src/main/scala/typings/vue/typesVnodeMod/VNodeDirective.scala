package typings.vue.typesVnodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeDirective extends js.Object {
  var arg: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[js.Any] = js.undefined
  var modifiers: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var name: String
  var oldArg: js.UndefOr[String] = js.undefined
  var oldValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object VNodeDirective {
  @scala.inline
  def apply(
    name: String,
    arg: String = null,
    expression: js.Any = null,
    modifiers: StringDictionary[Boolean] = null,
    oldArg: String = null,
    oldValue: js.Any = null,
    value: js.Any = null
  ): VNodeDirective = {
    val __obj = js.Dynamic.literal(name = name)
    if (arg != null) __obj.updateDynamic("arg")(arg)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (oldArg != null) __obj.updateDynamic("oldArg")(oldArg)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VNodeDirective]
  }
}

