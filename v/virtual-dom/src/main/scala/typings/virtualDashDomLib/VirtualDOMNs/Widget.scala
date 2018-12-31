package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widget extends js.Object {
  var `type`: java.lang.String
  def destroy(node: stdLib.Element): scala.Unit
   // 'Widget'
  def init(): stdLib.Element
  def update(previous: Widget, domNode: stdLib.Element): scala.Unit
}

