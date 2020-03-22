package typings.webdriverio

import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.WebdriverIO.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Element commands that should not be wrapper with promise
/* Inlined std.Pick<webdriverio.WebdriverIO.Element, 'addCommand' | 'selector' | 'elementId' | 'element-6066-11e4-a52e-4f735466cecf' | 'ELEMENT' | 'index' | 'parent'> */
@js.native
trait ElementStatic extends js.Object {
  var ELEMENT: js.UndefOr[String] = js.native
  @JSName("addCommand")
  var addCommand_Original: js.Function2[/* name */ String, /* func */ js.Function, Unit] = js.native
  var `element-6066-11e4-a52e-4f735466cecf`: js.UndefOr[String] = js.native
  var elementId: String = js.native
  var index: js.UndefOr[Double] = js.native
  var parent: Element | BrowserObject = js.native
  var selector: String = js.native
  def addCommand(name: String, func: js.Function): Unit = js.native
}

