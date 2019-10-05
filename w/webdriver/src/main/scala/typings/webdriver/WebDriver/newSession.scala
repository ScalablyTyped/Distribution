package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebDriver.newSession")
@js.native
object newSession extends js.Object {
  def apply(): js.Promise[Client] = js.native
  def apply(options: Options): js.Promise[Client] = js.native
  def apply(options: Options, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
  def apply(options: Options, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
  def apply(
    options: Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
  ): js.Promise[Client] = js.native
}

