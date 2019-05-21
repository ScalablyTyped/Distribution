package typings
package webdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver", JSImport.Namespace)
@js.native
object webdriverMod extends js.Object {
  def attachToSession(options: webdriverLib.WebDriverNs.AttachSessionOptions): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def attachToSession(
    options: webdriverLib.WebDriverNs.AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, _]
  ): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def attachToSession(
    options: webdriverLib.WebDriverNs.AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object
  ): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def attachToSession(
    options: webdriverLib.WebDriverNs.AttachSessionOptions,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ java.lang.String, 
      /* fn */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def newSession(): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def newSession(options: webdriverLib.WebDriverNs.Options): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def newSession(options: webdriverLib.WebDriverNs.Options, modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def newSession(
    options: webdriverLib.WebDriverNs.Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object
  ): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
  def newSession(
    options: webdriverLib.WebDriverNs.Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ java.lang.String, 
      /* fn */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ): js.Promise[webdriverLib.WebDriverNs.Client] = js.native
}

