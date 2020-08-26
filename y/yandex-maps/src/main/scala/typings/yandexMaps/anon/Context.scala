package typings.yandexMaps.anon

import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IEventWorkflowController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: js.UndefOr[js.Object] = js.native
  var controllers: js.UndefOr[js.Array[IEventWorkflowController]] = js.native
  var parent: js.UndefOr[IEventManager] = js.native
}

object Context {
  @scala.inline
  def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setContext(value: js.Object): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setControllersVarargs(value: IEventWorkflowController*): Self = this.set("controllers", js.Array(value :_*))
    @scala.inline
    def setControllers(value: js.Array[IEventWorkflowController]): Self = this.set("controllers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllers: Self = this.set("controllers", js.undefined)
    @scala.inline
    def setParent(value: IEventManager): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

