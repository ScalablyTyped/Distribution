package typings.atTestingDashLibraryDom.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var testIdAttribute: String
  def asyncWrapper(cb: js.Function1[/* repeated */ js.Any, _]): js.Promise[_]
}

object Config {
  @scala.inline
  def apply(asyncWrapper: js.Function1[/* repeated */ js.Any, _] => js.Promise[_], testIdAttribute: String): Config = {
    val __obj = js.Dynamic.literal(asyncWrapper = js.Any.fromFunction1(asyncWrapper), testIdAttribute = testIdAttribute)
  
    __obj.asInstanceOf[Config]
  }
}

