package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectVisibility extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectVisibility")
@js.native
object ProjectVisibility extends js.Object {
  @js.native
  sealed trait Organization
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectVisibility
  
  @js.native
  sealed trait Private
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectVisibility
  
  @js.native
  sealed trait Public
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectVisibility
  
  @js.native
  sealed trait Unchanged
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectVisibility
  
  /* 1 */ val Organization: Organization with scala.Double = js.native
  /* 0 */ val Private: Private with scala.Double = js.native
  /* 2 */ val Public: Public with scala.Double = js.native
  /* -1 */ val Unchanged: Unchanged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.ProjectVisibility with scala.Double
  ] = js.native
}

