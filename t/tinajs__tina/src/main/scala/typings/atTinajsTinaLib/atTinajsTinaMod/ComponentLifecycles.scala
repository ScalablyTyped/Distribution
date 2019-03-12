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
    attached: () => scala.Unit,
    created: () => scala.Unit,
    detached: () => scala.Unit,
    moved: () => scala.Unit,
    ready: () => scala.Unit
  ): ComponentLifecycles = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
  
    __obj.asInstanceOf[ComponentLifecycles]
  }
}

