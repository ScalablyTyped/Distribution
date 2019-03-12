package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebDriver")
@js.native
object ^ extends js.Object {
  def newSession(): js.Promise[Client] = js.native
  def newSession(options: Options): js.Promise[Client] = js.native
  def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[Client] = js.native
  def newSession(options: Options, modifier: js.Function1[/* repeated */ js.Any, _], proto: js.Object): js.Promise[Client] = js.native
  def newSession(
    options: Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ java.lang.String, 
      /* fn */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ): js.Promise[Client] = js.native
}

