package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  var events: vegaDashTypingsLib.typesSpecOnDashEventsMod.Events | js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.EventListener]
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Events {
  @scala.inline
  def apply(
    events: vegaDashTypingsLib.typesSpecOnDashEventsMod.Events | js.Array[vegaDashTypingsLib.typesSpecOnDashEventsMod.EventListener],
    force: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Events = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[Anon_Events]
  }
}

