package typings
package webdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver", JSImport.Namespace)
@js.native
object webdriverMod extends js.Object {
  def newSession(): webdriverLib.WebDriverNs.Client[scala.Unit] = js.native
  def newSession(options: webdriverLib.WebDriverNs.Options): webdriverLib.WebDriverNs.Client[scala.Unit] = js.native
  def newSession(options: webdriverLib.WebDriverNs.Options, modifier: js.Function1[/* repeated */ js.Any, _]): webdriverLib.WebDriverNs.Client[scala.Unit] = js.native
  def newSession(
    options: webdriverLib.WebDriverNs.Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object
  ): webdriverLib.WebDriverNs.Client[scala.Unit] = js.native
  def newSession(
    options: webdriverLib.WebDriverNs.Options,
    modifier: js.Function1[/* repeated */ js.Any, _],
    proto: js.Object,
    commandWrapper: js.Function2[
      /* commandName */ java.lang.String, 
      /* fn */ js.Function1[/* repeated */ js.Any, _], 
      _
    ]
  ): webdriverLib.WebDriverNs.Client[scala.Unit] = js.native
}

