package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RefFavoriteType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "RefFavoriteType")
@js.native
object RefFavoriteType extends js.Object {
  @js.native
  sealed trait Folder extends RefFavoriteType
  
  @js.native
  sealed trait Invalid extends RefFavoriteType
  
  @js.native
  sealed trait Ref extends RefFavoriteType
  
  /* 1 */ val Folder: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.RefFavoriteType.Folder with Double = js.native
  /* 0 */ val Invalid: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.RefFavoriteType.Invalid with Double = js.native
  /* 2 */ val Ref: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.RefFavoriteType.Ref with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RefFavoriteType with Double] = js.native
}

