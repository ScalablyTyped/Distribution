package typings.wordpressPlugins.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/plugins", "withPluginContext")
@js.native
object withPluginContext extends js.Object {
  def apply[CP, OP](mapContextToProps: js.Function2[/* context */ PluginContext, /* props */ OP, CP]): js.Function1[/* Component */ ComponentType[CP with OP], ComponentType[OP]] = js.native
}

