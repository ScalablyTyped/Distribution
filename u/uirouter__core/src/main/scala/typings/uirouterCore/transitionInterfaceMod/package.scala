package typings.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionInterfaceMod {
  type HookFn = typings.uirouterCore.transitionInterfaceMod.TransitionHookFn | typings.uirouterCore.transitionInterfaceMod.TransitionStateHookFn | typings.uirouterCore.transitionInterfaceMod.TransitionCreateHookFn
  type HookMatchCriterion = java.lang.String | typings.uirouterCore.transitionInterfaceMod.IStateMatch | scala.Boolean
  type HookResult = scala.Boolean | typings.uirouterCore.targetStateMod.TargetState | scala.Unit | (js.Promise[scala.Boolean | typings.uirouterCore.targetStateMod.TargetState | scala.Unit])
  type IHookRegistration = js.Function3[
    /* matchCriteria */ typings.uirouterCore.transitionInterfaceMod.HookMatchCriteria, 
    /* callback */ typings.uirouterCore.transitionInterfaceMod.HookFn, 
    /* options */ js.UndefOr[typings.uirouterCore.transitionInterfaceMod.HookRegOptions], 
    js.Function
  ]
  type IStateMatch = typings.uirouterCore.commonCommonMod.PredicateBinary[
    typings.uirouterCore.stateObjectMod.StateObject, 
    typings.uirouterCore.transitionTransitionMod.Transition
  ]
  type RegisteredHooks = org.scalablytyped.runtime.StringDictionary[js.Array[typings.uirouterCore.hookRegistryMod.RegisteredHook]]
  type TransitionCreateHookFn = js.Function1[
    /* transition */ typings.uirouterCore.transitionTransitionMod.Transition, 
    scala.Unit
  ]
  type TransitionHookFn = js.Function1[
    /* transition */ typings.uirouterCore.transitionTransitionMod.Transition, 
    typings.uirouterCore.transitionInterfaceMod.HookResult
  ]
  type TransitionStateHookFn = js.Function2[
    /* transition */ typings.uirouterCore.transitionTransitionMod.Transition, 
    /* state */ typings.uirouterCore.stateInterfaceMod.StateDeclaration, 
    typings.uirouterCore.transitionInterfaceMod.HookResult
  ]
}
