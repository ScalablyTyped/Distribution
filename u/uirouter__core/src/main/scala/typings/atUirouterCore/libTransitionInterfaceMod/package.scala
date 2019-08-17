package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransitionInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atUirouterCore.libCommonCommonMod.PredicateBinary
  import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
  import typings.atUirouterCore.libStateStateObjectMod.StateObject
  import typings.atUirouterCore.libStateTargetStateMod.TargetState
  import typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook
  import typings.atUirouterCore.libTransitionTransitionMod.Transition

  type HookFn = TransitionHookFn | TransitionStateHookFn | TransitionCreateHookFn
  type HookMatchCriterion = String | IStateMatch | Boolean
  type HookResult = Boolean | TargetState | Unit | (js.Promise[Boolean | TargetState | Unit])
  type IHookRegistration = js.Function3[
    /* matchCriteria */ HookMatchCriteria, 
    /* callback */ HookFn, 
    /* options */ js.UndefOr[HookRegOptions], 
    js.Function
  ]
  type IStateMatch = PredicateBinary[StateObject, Transition]
  type RegisteredHooks = StringDictionary[js.Array[RegisteredHook]]
  type TransitionCreateHookFn = js.Function1[/* transition */ Transition, Unit]
  type TransitionHookFn = js.Function1[/* transition */ Transition, HookResult]
  type TransitionStateHookFn = js.Function2[/* transition */ Transition, /* state */ StateDeclaration, HookResult]
}
