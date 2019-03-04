package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarker extends IDisposable {
  val id: scala.Double
  val isDisposed: scala.Boolean
  val line: scala.Double
}

object IMarker {
  @scala.inline
  def apply(dispose: js.Function0[scala.Unit], id: scala.Double, isDisposed: scala.Boolean, line: scala.Double): IMarker = {
    val __obj = js.Dynamic.literal(dispose = dispose, id = id, isDisposed = isDisposed, line = line)
  
    __obj.asInstanceOf[IMarker]
  }
}

