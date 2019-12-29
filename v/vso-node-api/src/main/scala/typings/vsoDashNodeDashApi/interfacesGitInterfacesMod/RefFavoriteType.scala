package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RefFavoriteType with Double] = js.native
  /* 1 */ @js.native
  object Folder extends TopLevel[Folder with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 2 */ @js.native
  object Ref extends TopLevel[Ref with Double]
  
}

