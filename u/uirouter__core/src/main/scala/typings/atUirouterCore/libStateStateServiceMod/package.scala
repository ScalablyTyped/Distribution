package typings.atUirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStateStateServiceMod {
  import typings.atUirouterCore.libInterfaceMod.UIInjector
  import typings.atUirouterCore.libStateTargetStateMod.TargetState
  import typings.atUirouterCore.libTransitionInterfaceMod.HookResult

  type OnInvalidCallback = js.Function3[
    /* toState */ js.UndefOr[TargetState], 
    /* fromState */ js.UndefOr[TargetState], 
    /* injector */ js.UndefOr[UIInjector], 
    HookResult
  ]
}
