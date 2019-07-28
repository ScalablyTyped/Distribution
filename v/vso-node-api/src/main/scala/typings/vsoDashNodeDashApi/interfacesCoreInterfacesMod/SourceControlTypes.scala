package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SourceControlTypes extends js.Object

@JSImport("vso-node-api/interfaces/CoreInterfaces", "SourceControlTypes")
@js.native
object SourceControlTypes extends js.Object {
  @js.native
  sealed trait Git extends SourceControlTypes
  
  @js.native
  sealed trait Tfvc extends SourceControlTypes
  
  /* 2 */ val Git: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.SourceControlTypes.Git with Double = js.native
  /* 1 */ val Tfvc: typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.SourceControlTypes.Tfvc with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SourceControlTypes with Double] = js.native
}

