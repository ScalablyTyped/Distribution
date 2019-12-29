package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FolderPathQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "FolderPathQueryOrder")
@js.native
object FolderPathQueryOrder extends js.Object {
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait Ascending extends FolderPathQueryOrder
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait Descending extends FolderPathQueryOrder
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends FolderPathQueryOrder
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderPathQueryOrder with Double] = js.native
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 2 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

