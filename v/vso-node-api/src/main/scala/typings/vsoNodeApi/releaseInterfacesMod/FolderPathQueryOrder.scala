package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FolderPathQueryOrder extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "FolderPathQueryOrder")
@js.native
object FolderPathQueryOrder extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FolderPathQueryOrder with Double] = js.native
  
  /**
    * Order by folder name and path ascending.
    */
  @js.native
  sealed trait Ascending extends FolderPathQueryOrder
  /* 1 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /**
    * Order by folder name and path descending.
    */
  @js.native
  sealed trait Descending extends FolderPathQueryOrder
  /* 2 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
  /**
    * No order
    */
  @js.native
  sealed trait None extends FolderPathQueryOrder
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
