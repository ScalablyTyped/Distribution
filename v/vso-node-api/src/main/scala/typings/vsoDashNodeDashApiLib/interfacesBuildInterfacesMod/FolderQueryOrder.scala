package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
  sealed trait FolderAscending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.FolderQueryOrder
  
  /**
       * Order by folder name and path descending.
       */
  @js.native
  sealed trait FolderDescending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.FolderQueryOrder
  
  /**
       * No order
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.FolderQueryOrder
  
  /* 1 */ val FolderAscending: FolderAscending with scala.Double = js.native
  /* 2 */ val FolderDescending: FolderDescending with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.FolderQueryOrder with scala.Double
  ] = js.native
}

