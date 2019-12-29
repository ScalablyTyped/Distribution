package typings.unstatedDashNext.unstatedDashNextMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[Value, State] extends js.Object {
  var Provider: ComponentType[ContainerProviderProps[State]]
  def useContainer(): Value
}

object Container {
  @scala.inline
  def apply[Value, State](Provider: ComponentType[ContainerProviderProps[State]], useContainer: () => Value): Container[Value, State] = {
    val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = js.Any.fromFunction0(useContainer))
  
    __obj.asInstanceOf[Container[Value, State]]
  }
}

