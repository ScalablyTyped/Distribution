package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
  
  /* 1 */ val Ascending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.FolderPathQueryOrder.Ascending with Double = js.native
  /* 2 */ val Descending: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.FolderPathQueryOrder.Descending with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.FolderPathQueryOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderPathQueryOrder with Double] = js.native
}

