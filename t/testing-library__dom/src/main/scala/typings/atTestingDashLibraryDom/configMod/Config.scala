package typings.atTestingDashLibraryDom.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var asyncUtilTimeout: Double
  var testIdAttribute: String
  def asyncWrapper(cb: js.Function1[/* repeated */ js.Any, _]): js.Promise[_]
}

object Config {
  @scala.inline
  def apply(
    asyncUtilTimeout: Double,
    asyncWrapper: js.Function1[/* repeated */ js.Any, _] => js.Promise[_],
    testIdAttribute: String
  ): Config = {
    val __obj = js.Dynamic.literal(asyncUtilTimeout = asyncUtilTimeout, asyncWrapper = js.Any.fromFunction1(asyncWrapper), testIdAttribute = testIdAttribute)
  
    __obj.asInstanceOf[Config]
  }
}

