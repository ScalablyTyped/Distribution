package typings
package viewporterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewporter extends js.Object {
  var ACTIVE: scala.Boolean
  var READY: scala.Boolean
  var forceDetection: scala.Boolean
  var preventPageScroll: scala.Boolean
  def change(callback: stdLib.EventListener): scala.Unit
  def isLandscape(): scala.Boolean
  def ready(callback: stdLib.EventListener): scala.Unit
  def refresh(): scala.Unit
}

object Viewporter {
  @scala.inline
  def apply(
    ACTIVE: scala.Boolean,
    READY: scala.Boolean,
    change: js.Function1[stdLib.EventListener, scala.Unit],
    forceDetection: scala.Boolean,
    isLandscape: js.Function0[scala.Boolean],
    preventPageScroll: scala.Boolean,
    ready: js.Function1[stdLib.EventListener, scala.Unit],
    refresh: js.Function0[scala.Unit]
  ): Viewporter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACTIVE")(ACTIVE)
    __obj.updateDynamic("READY")(READY)
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("forceDetection")(forceDetection)
    __obj.updateDynamic("isLandscape")(isLandscape)
    __obj.updateDynamic("preventPageScroll")(preventPageScroll)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("refresh")(refresh)
    __obj.asInstanceOf[Viewporter]
  }
}

