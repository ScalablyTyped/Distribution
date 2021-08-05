package typings.uirouterAngularjs

import typings.uirouterAngularjs.uirouterAngularjsStrings.onEnter
import typings.uirouterAngularjs.uirouterAngularjsStrings.onExit
import typings.uirouterAngularjs.uirouterAngularjsStrings.onRetain
import typings.uirouterCore.mod.StateObject
import typings.uirouterCore.transitionInterfaceMod.TransitionStateHookFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEnterExitRetainMod {
  
  @JSImport("@uirouter/angularjs/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStateHookBuilder_onEnter(hookName: onEnter): js.Function1[/* stateObject */ StateObject, TransitionStateHookFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateHookBuilder")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stateObject */ StateObject, TransitionStateHookFn]]
  
  inline def getStateHookBuilder_onExit(hookName: onExit): js.Function1[/* stateObject */ StateObject, TransitionStateHookFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateHookBuilder")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stateObject */ StateObject, TransitionStateHookFn]]
  
  inline def getStateHookBuilder_onRetain(hookName: onRetain): js.Function1[/* stateObject */ StateObject, TransitionStateHookFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateHookBuilder")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stateObject */ StateObject, TransitionStateHookFn]]
}
