package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasState extends js.Object {
  def restore(): scala.Unit
  def save(): scala.Unit
}

object CanvasState {
  @scala.inline
  def apply(restore: js.Function0[scala.Unit], save: js.Function0[scala.Unit]): CanvasState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("restore")(restore)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[CanvasState]
  }
}

