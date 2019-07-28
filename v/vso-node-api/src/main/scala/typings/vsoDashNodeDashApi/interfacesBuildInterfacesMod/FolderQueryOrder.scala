package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FolderQueryOrder extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "FolderQueryOrder")
@js.native
object FolderQueryOrder extends js.Object {
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait FolderAscending extends FolderQueryOrder
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait FolderDescending extends FolderQueryOrder
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends FolderQueryOrder
  
  /* 1 */ val FolderAscending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder.FolderAscending with Double = js.native
  /* 2 */ val FolderDescending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder.FolderDescending with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderQueryOrder with Double] = js.native
}

