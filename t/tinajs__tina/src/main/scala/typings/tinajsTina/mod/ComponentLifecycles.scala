package typings.tinajsTina.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentLifecycles extends js.Object {
  def attached(): Unit
  def created(): Unit
  def detached(): Unit
  def moved(): Unit
  def ready(): Unit
}

object ComponentLifecycles {
  @scala.inline
  def apply(
    attached: () => Unit,
    created: () => Unit,
    detached: () => Unit,
    moved: () => Unit,
    ready: () => Unit
  ): ComponentLifecycles = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[ComponentLifecycles]
  }
}

