package typings.vue.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<vue.vue/types/vnode.VNodeDirective> */
trait DirectiveBinding extends js.Object {
  val arg: js.UndefOr[String] = js.undefined
  val expression: js.UndefOr[js.Any] = js.undefined
  val modifiers: StringDictionary[Boolean]
  val name: String
  val oldArg: js.UndefOr[String] = js.undefined
  val oldValue: js.UndefOr[js.Any] = js.undefined
  val value: js.UndefOr[js.Any] = js.undefined
}

object DirectiveBinding {
  @scala.inline
  def apply(
    modifiers: StringDictionary[Boolean],
    name: String,
    arg: String = null,
    expression: js.Any = null,
    oldArg: String = null,
    oldValue: js.Any = null,
    value: js.Any = null
  ): DirectiveBinding = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (arg != null) __obj.updateDynamic("arg")(arg.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (oldArg != null) __obj.updateDynamic("oldArg")(oldArg.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveBinding]
  }
}

