package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Array that is only intended to be pushed to, never read. */
@js.native
trait Push[T] extends js.Object {
  def push(values: T*): Unit = js.native
}

object Push {
  @scala.inline
  def apply[T](push: /* repeated */ T => Unit): Push[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push[T]]
  }
  @scala.inline
  implicit class PushOps[Self <: Push[_], T] (val x: Self with Push[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPush(value: /* repeated */ T => Unit): Self = this.set("push", js.Any.fromFunction1(value))
  }
  
}

