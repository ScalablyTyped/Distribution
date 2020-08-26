package typings.wouter.preactMod

import typings.preact.mod.VNode
import typings.wouter.useLocationMod.BaseLocationHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact", "Redirect")
@js.native
object Redirect extends js.Object {
  def apply[H /* <: BaseLocationHook */](props: RedirectProps[H]): VNode[_] | Null = js.native
}

