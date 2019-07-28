package typings.weixinDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsType extends js.Object {
  var value: js.UndefOr[/* import warning: ImportType.apply Failed type conversion: infer T */ js.Any] = js.undefined
  def `type`(args: js.Any*): /* import warning: ImportType.apply Failed type conversion: infer T */ js.Any
}

object Anon_ArgsType {
  @scala.inline
  def apply(
    `type`: /* repeated */ js.Any => /* import warning: ImportType.apply Failed type conversion: infer T */ js.Any,
    value: /* import warning: ImportType.apply Failed type conversion: infer T */ js.Any = null
  ): Anon_ArgsType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ArgsType]
  }
}

