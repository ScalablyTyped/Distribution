package typings.atUirouterAngularjs

import typings.atUirouterAngularjs.atUirouterAngularjsStrings.onEnter
import typings.atUirouterAngularjs.atUirouterAngularjsStrings.onExit
import typings.atUirouterAngularjs.atUirouterAngularjsStrings.onRetain
import typings.atUirouterCore.atUirouterCoreMod.StateObject
import typings.atUirouterCore.libStateStateBuilderMod.BuilderFunction
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionStateHookFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
@js.native
object libStatebuildersOnEnterExitRetainMod extends js.Object {
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onEnter(hookName: onEnter): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onExit(hookName: onExit): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
  @JSName("getStateHookBuilder")
  def getStateHookBuilder_onRetain(hookName: onRetain): js.Function2[/* stateObject */ StateObject, /* parentFn */ BuilderFunction, TransitionStateHookFn] = js.native
}

