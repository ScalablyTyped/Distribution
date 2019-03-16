package typings
package turbolinksLib.turbolinksMod.TurbolinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurbolinksStatic extends js.Object {
  var supported: scala.Boolean = js.native
  def clearCache(): scala.Unit = js.native
  def setProgressBarDelay(delayInMilliseconds: scala.Double): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def visit(location: java.lang.String): scala.Unit = js.native
  def visit(location: java.lang.String, options: Action): scala.Unit = js.native
}

