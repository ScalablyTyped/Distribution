package typings.tinymce.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  def add(items: js.Any): Collection
  def items(): Collection
}

object Container {
  @scala.inline
  def apply(add: js.Any => Collection, items: () => Collection): Container = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[Container]
  }
}

