package typings.unstatedNext.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container[Value, State] extends js.Object {
  var Provider: ComponentType[ContainerProviderProps[State]] = js.native
  def useContainer(): Value = js.native
}

object Container {
  @scala.inline
  def apply[Value, State](Provider: ComponentType[ContainerProviderProps[State]], useContainer: () => Value): Container[Value, State] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = js.Any.fromFunction0(useContainer))
    __obj.asInstanceOf[Container[Value, State]]
  }
  @scala.inline
  implicit class ContainerOps[Self <: Container[_, _], Value, State] (val x: Self with (Container[Value, State])) extends AnyVal {
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
    def setProvider(value: ComponentType[ContainerProviderProps[State]]): Self = this.set("Provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseContainer(value: () => Value): Self = this.set("useContainer", js.Any.fromFunction0(value))
  }
  
}

