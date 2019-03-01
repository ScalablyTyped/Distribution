package typings
package atTinajsTinaLib.atTinajsTinaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentLifecycles extends js.Object {
  def attached(): scala.Unit
  def created(): scala.Unit
  def detached(): scala.Unit
  def moved(): scala.Unit
  def ready(): scala.Unit
}

object ComponentLifecycles {
  @scala.inline
  def apply(
    attached: js.Function0[scala.Unit],
    created: js.Function0[scala.Unit],
    detached: js.Function0[scala.Unit],
    moved: js.Function0[scala.Unit],
    ready: js.Function0[scala.Unit]
  ): ComponentLifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(attached)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("detached")(detached)
    __obj.updateDynamic("moved")(moved)
    __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[ComponentLifecycles]
  }
}

