package typings
package verrorLib.verrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cause: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
  var constructorOpt: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var info: js.UndefOr[Info] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cause: stdLib.Error = null,
    constructorOpt: /* repeated */ js.Any => scala.Unit = null,
    info: Info = null,
    name: java.lang.String = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(js.Any.fromFunction1(constructorOpt))
    if (info != null) __obj.updateDynamic("info")(info)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Options]
  }
}

