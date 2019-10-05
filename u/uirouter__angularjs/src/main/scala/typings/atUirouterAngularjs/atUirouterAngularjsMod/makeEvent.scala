package typings.atUirouterAngularjs.atUirouterAngularjsMod

import typings.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "makeEvent")
@js.native
object makeEvent extends js.Object {
  def apply(
    registry: IHookRegistry,
    transitionService: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
}

