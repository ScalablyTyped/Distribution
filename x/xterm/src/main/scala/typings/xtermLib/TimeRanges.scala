package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimeRanges extends js.Object {
  val length: scala.Double
  def end(index: scala.Double): scala.Double
  def start(index: scala.Double): scala.Double
}

@JSGlobal("TimeRanges")
@js.native
object TimeRanges
  extends ScalablyTyped.runtime.Instantiable0[TimeRanges]

