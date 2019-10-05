package typings.atWordpressData.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "createRegistrySelector")
@js.native
object createRegistrySelector extends js.Object {
  def apply[S /* <: js.Function1[/* key */ String, SelectorMap] */, T](registrySelector: js.Function1[/* select */ S, js.Function2[/* state */ _, /* repeated */ _, T]]): S = js.native
}

