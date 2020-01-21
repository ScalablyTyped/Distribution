package typings.uirouterAngularjs

import typings.uirouterAngularjs.uirouterAngularjsStrings.onEnter
import typings.uirouterAngularjs.uirouterAngularjsStrings.onExit
import typings.uirouterAngularjs.uirouterAngularjsStrings.onRetain
import typings.uirouterCore.mod.StateObject
import typings.uirouterCore.stateBuilderMod.BuilderFunction
import typings.uirouterCore.transitionInterfaceMod.TransitionStateHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
@js.native
object onEnterExitRetainMod extends js.Object {
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onEnter(hookName: onEnter): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onExit(hookName: onExit): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onRetain(hookName: onRetain): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
}

