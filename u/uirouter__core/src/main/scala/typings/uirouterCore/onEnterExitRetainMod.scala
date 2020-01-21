package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/onEnterExitRetain", JSImport.Namespace)
@js.native
object onEnterExitRetainMod extends js.Object {
  def registerOnEnterHook(transitionService: TransitionService): js.Function = js.native
  def registerOnExitHook(transitionService: TransitionService): js.Function = js.native
  def registerOnRetainHook(transitionService: TransitionService): js.Function = js.native
}

