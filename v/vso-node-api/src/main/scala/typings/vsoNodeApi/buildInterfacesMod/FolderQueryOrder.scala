package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FolderQueryOrder extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "FolderQueryOrder")
@js.native
object FolderQueryOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderQueryOrder with Double] = js.native
  
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait FolderAscending extends FolderQueryOrder
  /* 1 */ @js.native
  object FolderAscending extends TopLevel[FolderAscending with Double]
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait FolderDescending extends FolderQueryOrder
  /* 2 */ @js.native
  object FolderDescending extends TopLevel[FolderDescending with Double]
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends FolderQueryOrder
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
