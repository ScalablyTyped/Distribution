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
    destroy: stdLib.Element => scala.Unit,
    init: () => stdLib.Element,
    `type`: java.lang.String,
    update: (Widget, stdLib.Element) => scala.Unit
  ): Widget = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Widget]
  }
}

