package typings.testingLibraryDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@testing-library/dom.@testing-library/dom/types/config.Config> */
trait PartialConfig extends js.Object {
  var asyncUtilTimeout: js.UndefOr[Double] = js.undefined
  var asyncWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, _], js.Promise[_]]] = js.undefined
  var defaultHidden: js.UndefOr[Boolean] = js.undefined
  var eventWrapper: js.UndefOr[js.Function1[/* cb */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.undefined
  var testIdAttribute: js.UndefOr[String] = js.undefined
  var throwSuggestions: js.UndefOr[Boolean] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    asyncUtilTimeout: js.UndefOr[Double] = js.undefined,
    asyncWrapper: /* cb */ js.Function1[/* repeated */ js.Any, _] => js.Promise[_] = null,
    defaultHidden: js.UndefOr[Boolean] = js.undefined,
    eventWrapper: /* cb */ js.Function1[/* repeated */ js.Any, _] => Unit = null,
    testIdAttribute: String = null,
    throwSuggestions: js.UndefOr[Boolean] = js.undefined
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(asyncUtilTimeout)) __obj.updateDynamic("asyncUtilTimeout")(asyncUtilTimeout.get.asInstanceOf[js.Any])
    if (asyncWrapper != null) __obj.updateDynamic("asyncWrapper")(js.Any.fromFunction1(asyncWrapper))
    if (!js.isUndefined(defaultHidden)) __obj.updateDynamic("defaultHidden")(defaultHidden.get.asInstanceOf[js.Any])
    if (eventWrapper != null) __obj.updateDynamic("eventWrapper")(js.Any.fromFunction1(eventWrapper))
    if (testIdAttribute != null) __obj.updateDynamic("testIdAttribute")(testIdAttribute.asInstanceOf[js.Any])
    if (!js.isUndefined(throwSuggestions)) __obj.updateDynamic("throwSuggestions")(throwSuggestions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

