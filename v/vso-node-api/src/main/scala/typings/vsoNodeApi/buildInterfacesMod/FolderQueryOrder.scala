package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FolderQueryOrder extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "FolderQueryOrder")
@js.native
object FolderQueryOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderQueryOrder with Double] = js.native
  
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait FolderAscending extends FolderQueryOrder
  /* 1 */ val FolderAscending: typings.vsoNodeApi.buildInterfacesMod.FolderQueryOrder.FolderAscending with Double = js.native
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait FolderDescending extends FolderQueryOrder
  /* 2 */ val FolderDescending: typings.vsoNodeApi.buildInterfacesMod.FolderQueryOrder.FolderDescending with Double = js.native
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends FolderQueryOrder
  /* 0 */ val None: typings.vsoNodeApi.buildInterfacesMod.FolderQueryOrder.None with Double = js.native
}
