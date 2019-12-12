package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder.FolderAscending
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder.FolderDescending
import typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.FolderQueryOrder.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderQueryOrder with Double] = js.native
  /* 1 */ @js.native
  object FolderAscending extends TopLevel[FolderAscending with Double]
  
  /* 2 */ @js.native
  object FolderDescending extends TopLevel[FolderDescending with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

