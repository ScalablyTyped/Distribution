package typings.useDashMergeDashValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValue[T] extends js.Object {
  var defaultValue: js.UndefOr[T | js.Function0[T]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* value */ T, /* prevValue */ T, Unit]] = js.undefined
  var postState: js.UndefOr[js.Function1[/* value */ T, T]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object Anon_DefaultValue {
  @scala.inline
  def apply[T](
    defaultValue: T | js.Function0[T] = null,
    onChange: (/* value */ T, /* prevValue */ T) => Unit = null,
    postState: /* value */ T => T = null,
    value: T = null
  ): Anon_DefaultValue[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (postState != null) __obj.updateDynamic("postState")(js.Any.fromFunction1(postState))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultValue[T]]
  }
}

