package typings.uirouterAngularjs.mod

import typings.uirouterCore.transitionInterfaceMod.HookFn
import typings.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.transitionInterfaceMod.HookRegOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends typings.uirouterCore.mod.RegisteredHook {
  def this(
    tranSvc: typings.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
  ) = this()
  def this(
    tranSvc: typings.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
    options: HookRegOptions
  ) = this()
}
