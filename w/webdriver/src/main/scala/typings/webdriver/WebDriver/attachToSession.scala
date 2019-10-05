package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebDriver.attachToSession")
@js.native
object attachToSession extends js.Object {
  def apply(options: AttachSessionOptions): js.Promise[Client] = js.native
  def apply(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
  def apply(options: AttachSessionOptions, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
  def apply(
    options: AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[/* commandName */ String, /* fn */ js.Function1[/* repeated */ js.Any, _], _]
  ): js.Promise[Client] = js.native
}

