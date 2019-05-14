package typings
package styleDashValueDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueType extends js.Object {
  var createTransformer: js.UndefOr[js.Function1[/* template */ java.lang.String, Transformer]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var getAnimatableNone: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.undefined
  var transform: js.UndefOr[Transformer] = js.undefined
  def parse(v: js.Any): js.Any
  def test(v: js.Any): scala.Boolean
}

object ValueType {
  @scala.inline
  def apply(
    parse: js.Any => js.Any,
    test: js.Any => scala.Boolean,
    createTransformer: /* template */ java.lang.String => Transformer = null,
    default: js.Any = null,
    getAnimatableNone: /* v */ js.Any => _ = null,
    transform: Transformer = null
  ): ValueType = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    if (createTransformer != null) __obj.updateDynamic("createTransformer")(js.Any.fromFunction1(createTransformer))
    if (default != null) __obj.updateDynamic("default")(default)
    if (getAnimatableNone != null) __obj.updateDynamic("getAnimatableNone")(js.Any.fromFunction1(getAnimatableNone))
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[ValueType]
  }
}

