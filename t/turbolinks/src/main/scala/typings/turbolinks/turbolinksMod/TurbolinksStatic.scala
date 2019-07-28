package typings.turbolinks.turbolinksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurbolinksStatic extends js.Object {
  var supported: Boolean = js.native
  def clearCache(): Unit = js.native
  def setProgressBarDelay(delayInMilliseconds: Double): Unit = js.native
  def start(): Unit = js.native
  def visit(location: String): Unit = js.native
  def visit(location: String, options: Action): Unit = js.native
}

