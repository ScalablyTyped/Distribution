package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FolderQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "FolderQueryOrder")
@js.native
object FolderQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderQueryOrder & Double] = js.native
  
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait FolderAscending
    extends StObject
       with FolderQueryOrder
  /* 1 */ val FolderAscending: typings.vsoNodeApi.interfacesBuildInterfacesMod.FolderQueryOrder.FolderAscending & Double = js.native
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait FolderDescending
    extends StObject
       with FolderQueryOrder
  /* 2 */ val FolderDescending: typings.vsoNodeApi.interfacesBuildInterfacesMod.FolderQueryOrder.FolderDescending & Double = js.native
  
  /**
    * No order
    */
  @js.native
  sealed trait None
    extends StObject
       with FolderQueryOrder
  /* 0 */ val None: typings.vsoNodeApi.interfacesBuildInterfacesMod.FolderQueryOrder.None & Double = js.native
}
