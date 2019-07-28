package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends js.Object {
  @js.native
  sealed trait Change extends TfvcVersionType
  
  @js.native
  sealed trait Changeset extends TfvcVersionType
  
  @js.native
  sealed trait Date extends TfvcVersionType
  
  @js.native
  sealed trait Latest extends TfvcVersionType
  
  @js.native
  sealed trait MergeSource extends TfvcVersionType
  
  @js.native
  sealed trait None extends TfvcVersionType
  
  @js.native
  sealed trait Shelveset extends TfvcVersionType
  
  @js.native
  sealed trait Tip extends TfvcVersionType
  
  /* 3 */ val Change: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Change with Double = js.native
  /* 1 */ val Changeset: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Changeset with Double = js.native
  /* 4 */ val Date: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Date with Double = js.native
  /* 5 */ val Latest: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Latest with Double = js.native
  /* 7 */ val MergeSource: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.MergeSource with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.None with Double = js.native
  /* 2 */ val Shelveset: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Shelveset with Double = js.native
  /* 6 */ val Tip: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.TfvcVersionType.Tip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
}

