package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
  sealed trait Ascending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FolderPathQueryOrder
  
  /**
       * Order by folder name and path descending.
       */
  @js.native
  sealed trait Descending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FolderPathQueryOrder
  
  /**
       * No order
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FolderPathQueryOrder
  
  /* 1 */ val Ascending: Ascending with scala.Double = js.native
  /* 2 */ val Descending: Descending with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.FolderPathQueryOrder with scala.Double
  ] = js.native
}

