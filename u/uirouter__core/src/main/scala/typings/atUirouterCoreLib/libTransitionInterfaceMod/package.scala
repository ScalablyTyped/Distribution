package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransitionInterfaceMod {
  type HookFn = TransitionHookFn | TransitionStateHookFn | TransitionCreateHookFn
  type HookMatchCriterion = java.lang.String | IStateMatch | scala.Boolean
  type HookResult = scala.Boolean | atUirouterCoreLib.libStateTargetStateMod.TargetState | scala.Unit | (js.Promise[
    scala.Boolean | atUirouterCoreLib.libStateTargetStateMod.TargetState | scala.Unit
  ])
  type IHookRegistration = js.Function3[
    /* matchCriteria */ HookMatchCriteria, 
    /* callback */ HookFn, 
    /* options */ js.UndefOr[HookRegOptions], 
    js.Function
  ]
  type IStateMatch = atUirouterCoreLib.libCommonCommonMod.PredicateBinary[
    atUirouterCoreLib.libStateStateObjectMod.StateObject, 
    atUirouterCoreLib.libTransitionTransitionMod.Transition
  ]
  type TransitionCreateHookFn = js.Function1[
    /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
    scala.Unit
  ]
  type TransitionHookFn = js.Function1[
    /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
    HookResult
  ]
  type TransitionStateHookFn = js.Function2[
    /* transition */ atUirouterCoreLib.libTransitionTransitionMod.Transition, 
    /* state */ atUirouterCoreLib.libStateInterfaceMod.StateDeclaration, 
    HookResult
  ]
}
