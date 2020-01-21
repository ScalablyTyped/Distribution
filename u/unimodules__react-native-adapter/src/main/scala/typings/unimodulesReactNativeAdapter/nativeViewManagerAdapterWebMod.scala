package typings.unimodulesReactNativeAdapter

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter/build/NativeViewManagerAdapter.web", JSImport.Namespace)
@js.native
object nativeViewManagerAdapterWebMod extends js.Object {
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
}

