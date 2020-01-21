package typings.unimodulesReactNativeAdapter

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter/build/NativeViewManagerAdapter", JSImport.Namespace)
@js.native
object nativeViewManagerAdapterMod extends js.Object {
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
}

