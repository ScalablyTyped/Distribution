package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libStateStateServiceMod {
  type OnInvalidCallback = js.Function3[
    /* toState */ js.UndefOr[atUirouterCoreLib.libStateTargetStateMod.TargetState], 
    /* fromState */ js.UndefOr[atUirouterCoreLib.libStateTargetStateMod.TargetState], 
    /* injector */ js.UndefOr[atUirouterCoreLib.libInterfaceMod.UIInjector], 
    atUirouterCoreLib.libTransitionInterfaceMod.HookResult
  ]
}
