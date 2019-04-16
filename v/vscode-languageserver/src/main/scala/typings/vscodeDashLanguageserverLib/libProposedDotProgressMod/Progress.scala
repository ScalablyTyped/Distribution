package typings
package vscodeDashLanguageserverLib.libProposedDotProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  val token: vscodeDashJsonrpcLib.libCancellationMod.CancellationToken = js.native
  def done(): scala.Unit = js.native
  def report(message: java.lang.String): scala.Unit = js.native
  def report(percentage: scala.Double): scala.Unit = js.native
  def report(percentage: scala.Double, message: java.lang.String): scala.Unit = js.native
}

