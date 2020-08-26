package typings.yeomanGenerator.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  var adapter: PromptModule = js.native
  def error(e: Error*): Unit = js.native
}

object Adapter {
  @scala.inline
  def apply(adapter: PromptModule, error: /* repeated */ Error => Unit): Adapter = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdapter(value: PromptModule): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: /* repeated */ Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
  }
  
}

