package typings.webdriverio.WebdriverIOAsync

import typings.webdriverio.ElementAsync
import typings.webdriverio.ElementStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends ElementAsync
     with ElementStatic {
  def dragAndDrop(target: Element): js.Promise[Unit] = js.native
  def dragAndDrop(target: Element, duration: Double): js.Promise[Unit] = js.native
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
}

