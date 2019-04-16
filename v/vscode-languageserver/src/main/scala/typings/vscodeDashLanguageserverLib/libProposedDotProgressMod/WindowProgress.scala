package typings
package vscodeDashLanguageserverLib.libProposedDotProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowProgress extends js.Object {
  def createProgress(title: java.lang.String): Progress = js.native
  def createProgress(title: java.lang.String, percentage: scala.Double): Progress = js.native
  def createProgress(title: java.lang.String, percentage: scala.Double, message: java.lang.String): Progress = js.native
  def createProgress(
    title: java.lang.String,
    percentage: scala.Double,
    message: java.lang.String,
    cancellable: scala.Boolean
  ): Progress = js.native
}

