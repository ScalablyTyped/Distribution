package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var config: js.Any
  def disable(): Unit
  def enable(): Unit
  def limit(mode: Boolean): Unit
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit
}

@JSImport("webix", "Touch")
@js.native
object Touch extends TopLevel[Touch]

