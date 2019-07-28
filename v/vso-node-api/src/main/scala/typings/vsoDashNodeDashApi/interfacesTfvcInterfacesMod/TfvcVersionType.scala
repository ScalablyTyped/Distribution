package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionType extends js.Object

@JSImport("vso-node-api/interfaces/TfvcInterfaces", "TfvcVersionType")
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
  
  /* 3 */ val Change: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Change with Double = js.native
  /* 1 */ val Changeset: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Changeset with Double = js.native
  /* 4 */ val Date: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Date with Double = js.native
  /* 5 */ val Latest: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Latest with Double = js.native
  /* 7 */ val MergeSource: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.MergeSource with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.None with Double = js.native
  /* 2 */ val Shelveset: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Shelveset with Double = js.native
  /* 6 */ val Tip: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.TfvcVersionType.Tip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TfvcVersionType with Double] = js.native
}

