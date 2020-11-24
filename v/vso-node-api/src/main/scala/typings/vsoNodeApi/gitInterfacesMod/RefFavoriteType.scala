package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RefFavoriteType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "RefFavoriteType")
@js.native
object RefFavoriteType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RefFavoriteType with Double] = js.native
  
  @js.native
  sealed trait Folder extends RefFavoriteType
  /* 1 */ @js.native
  object Folder extends TopLevel[Folder with Double]
  
  @js.native
  sealed trait Invalid extends RefFavoriteType
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait Ref extends RefFavoriteType
  /* 2 */ @js.native
  object Ref extends TopLevel[Ref with Double]
}
