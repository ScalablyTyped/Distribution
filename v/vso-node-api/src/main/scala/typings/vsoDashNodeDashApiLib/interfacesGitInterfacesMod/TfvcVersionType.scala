package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TfvcVersionType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "TfvcVersionType")
@js.native
object TfvcVersionType extends js.Object {
  @js.native
  sealed trait Change
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait Changeset
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait Date
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait Latest
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait MergeSource
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait Shelveset
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  @js.native
  sealed trait Tip
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType
  
  /* 3 */ val Change: Change with scala.Double = js.native
  /* 1 */ val Changeset: Changeset with scala.Double = js.native
  /* 4 */ val Date: Date with scala.Double = js.native
  /* 5 */ val Latest: Latest with scala.Double = js.native
  /* 7 */ val MergeSource: MergeSource with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Shelveset: Shelveset with scala.Double = js.native
  /* 6 */ val Tip: Tip with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.TfvcVersionType with scala.Double
  ] = js.native
}

