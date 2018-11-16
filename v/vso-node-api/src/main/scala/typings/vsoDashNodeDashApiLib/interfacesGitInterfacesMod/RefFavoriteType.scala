package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RefFavoriteType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "RefFavoriteType")
@js.native
object RefFavoriteType extends js.Object {
  @js.native
  sealed trait Folder
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.RefFavoriteType
  
  @js.native
  sealed trait Invalid
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.RefFavoriteType
  
  @js.native
  sealed trait Ref
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.RefFavoriteType
  
  /* 1 */ val Folder: Folder with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 2 */ val Ref: Ref with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.RefFavoriteType with scala.Double
  ] = js.native
}

