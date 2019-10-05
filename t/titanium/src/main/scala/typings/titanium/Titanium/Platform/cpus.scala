package typings.titanium.Titanium.Platform

import typings.titanium.CPU
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Titanium.Platform.cpus")
@js.native
object cpus extends js.Object {
  /**
  		 * Returns an array of basic cpu information for all logical processors
  		 */
  def apply(): js.Array[CPU] = js.native
}

