package typings
package vueLib.typesVnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNodeDirective extends js.Object {
  var arg: js.UndefOr[java.lang.String] = js.undefined
  var expression: js.UndefOr[js.Any] = js.undefined
  var modifiers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var name: java.lang.String
  var oldArg: js.UndefOr[java.lang.String] = js.undefined
  var oldValue: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object VNodeDirective {
  @scala.inline
  def apply(
    name: java.lang.String,
    arg: java.lang.String = null,
    expression: js.Any = null,
    modifiers: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    oldArg: java.lang.String = null,
    oldValue: js.Any = null,
    value: js.Any = null
  ): VNodeDirective = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (arg != null) __obj.updateDynamic("arg")(arg)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (oldArg != null) __obj.updateDynamic("oldArg")(oldArg)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[VNodeDirective]
  }
}

