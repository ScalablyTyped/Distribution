package typings.webdriverio

import typings.webdriverio.WebdriverIO.Config
import typings.webdriverio.WebdriverIO.RemoteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Browser commands that should not be wrapper with promise
/* Inlined std.Pick<webdriverio.WebdriverIO.Browser, 'addCommand' | 'overwriteCommand' | 'options' | 'config'> */
@js.native
trait BrowserStatic extends js.Object {
  @JSName("addCommand")
  var addCommand_Original: js.Function3[
    /* name */ String, 
    /* func */ js.Function, 
    /* attachToElement */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  var config: Config = js.native
  var options: RemoteOptions = js.native
  @JSName("overwriteCommand")
  var overwriteCommand_Original: js.Function3[
    /* name */ String, 
    /* func */ js.Function2[/* origCommand */ js.Function, /* repeated */ js.Any, _], 
    /* attachToElement */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  def addCommand(name: String, func: js.Function): Unit = js.native
  def addCommand(name: String, func: js.Function, attachToElement: Boolean): Unit = js.native
  def overwriteCommand(name: String, func: js.Function2[/* origCommand */ js.Function, /* repeated */ js.Any, _]): Unit = js.native
  def overwriteCommand(
    name: String,
    func: js.Function2[/* origCommand */ js.Function, /* repeated */ js.Any, _],
    attachToElement: Boolean
  ): Unit = js.native
}

