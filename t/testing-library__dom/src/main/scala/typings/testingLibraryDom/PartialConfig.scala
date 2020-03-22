package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@testing-library/dom.@testing-library/dom/config.Config> */
trait PartialConfig extends js.Object {
  var asyncUtilTimeout: js.UndefOr[Double] = js.undefined
  var asyncWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, _], js.Promise[_]]] = js.undefined
  var defaultHidden: js.UndefOr[Boolean] = js.undefined
  var testIdAttribute: js.UndefOr[String] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    asyncUtilTimeout: Int | Double = null,
    asyncWrapper: /* cb */ js.Function1[/* repeated */ js.Any, _] => js.Promise[_] = null,
    defaultHidden: js.UndefOr[Boolean] = js.undefined,
    testIdAttribute: String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (asyncUtilTimeout != null) __obj.updateDynamic("asyncUtilTimeout")(asyncUtilTimeout.asInstanceOf[js.Any])
    if (asyncWrapper != null) __obj.updateDynamic("asyncWrapper")(js.Any.fromFunction1(asyncWrapper))
    if (!js.isUndefined(defaultHidden)) __obj.updateDynamic("defaultHidden")(defaultHidden.asInstanceOf[js.Any])
    if (testIdAttribute != null) __obj.updateDynamic("testIdAttribute")(testIdAttribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

