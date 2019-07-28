package typings.atUirouterAngularjs.atUirouterAngularjsMod

import typings.atUirouterCore.libTransitionInterfaceMod.HookFn
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typings.atUirouterCore.libTransitionInterfaceMod.HookRegOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends typings.atUirouterCore.atUirouterCoreMod.RegisteredHook {
  def this(
    tranSvc: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[
        /* hook */ typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
        Unit
      ]
  ) = this()
  def this(
    tranSvc: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[
        /* hook */ typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
        Unit
      ],
    options: HookRegOptions
  ) = this()
}

