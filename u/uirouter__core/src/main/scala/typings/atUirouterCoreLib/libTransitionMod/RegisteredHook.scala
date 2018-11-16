package typings
package atUirouterCoreLib.libTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", "RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook {
  def this(tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService, eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType, callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn, matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria, removeHookFromRegistry: js.Function1[
      /* hook */ atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook, 
      scala.Unit
    ]) = this()
  def this(tranSvc: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService, eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType, callback: atUirouterCoreLib.libTransitionInterfaceMod.HookFn, matchCriteria: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriteria, removeHookFromRegistry: js.Function1[
      /* hook */ atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook, 
      scala.Unit
    ], options: atUirouterCoreLib.libTransitionInterfaceMod.HookRegOptions) = this()
}

