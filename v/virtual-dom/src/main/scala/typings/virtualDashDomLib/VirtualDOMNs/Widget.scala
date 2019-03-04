package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends VTree {
  var `type`: java.lang.String
  def destroy(node: stdLib.Element): scala.Unit
   // 'Widget'
  def init(): stdLib.Element
  def update(previous: Widget, domNode: stdLib.Element): scala.Unit
}

object Widget {
  @scala.inline
  def apply(
    destroy: js.Function1[stdLib.Element, scala.Unit],
    init: js.Function0[stdLib.Element],
    `type`: java.lang.String,
    update: js.Function2[Widget, stdLib.Element, scala.Unit]
  ): Widget = {
    val __obj = js.Dynamic.literal(destroy = destroy, init = init, update = update)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Widget]
  }
}

