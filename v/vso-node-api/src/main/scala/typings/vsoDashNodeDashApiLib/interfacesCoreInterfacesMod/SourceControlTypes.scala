package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceControlTypes extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "SourceControlTypes")
@js.native
object SourceControlTypes extends js.Object {
  @js.native
  sealed trait Git
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.SourceControlTypes
  
  @js.native
  sealed trait Tfvc
    extends vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.SourceControlTypes
  
  /* 2 */ val Git: Git with scala.Double = js.native
  /* 1 */ val Tfvc: Tfvc with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.SourceControlTypes with scala.Double
  ] = js.native
}

