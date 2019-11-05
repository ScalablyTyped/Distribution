package typings.vanillaDashSwipe.libTypesMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventHandler extends js.Object {
  def apply(e: Event, deltaX: Double, deltaY: Double, absX: Double, absY: Double, duration: Double): Unit = js.native
}

