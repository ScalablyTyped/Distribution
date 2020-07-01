package typings.testingLibraryDom.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var asyncUtilTimeout: Double
  var defaultHidden: Boolean
  var testIdAttribute: String
  var throwSuggestions: Boolean
  def asyncWrapper(cb: js.Function1[/* repeated */ js.Any, _]): js.Promise[_]
  def eventWrapper(cb: js.Function1[/* repeated */ js.Any, _]): Unit
}

object Config {
  @scala.inline
  def apply(
    asyncUtilTimeout: Double,
    asyncWrapper: js.Function1[/* repeated */ js.Any, _] => js.Promise[_],
    defaultHidden: Boolean,
    eventWrapper: js.Function1[/* repeated */ js.Any, _] => Unit,
    testIdAttribute: String,
    throwSuggestions: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(asyncUtilTimeout = asyncUtilTimeout.asInstanceOf[js.Any], asyncWrapper = js.Any.fromFunction1(asyncWrapper), defaultHidden = defaultHidden.asInstanceOf[js.Any], eventWrapper = js.Any.fromFunction1(eventWrapper), testIdAttribute = testIdAttribute.asInstanceOf[js.Any], throwSuggestions = throwSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

