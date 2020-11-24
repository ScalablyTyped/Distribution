package typings.vsoNodeApi.fileContainerInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContainerItemStatus extends js.Object
@JSImport("vso-node-api/interfaces/FileContainerInterfaces", "ContainerItemStatus")
@js.native
object ContainerItemStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerItemStatus with Double] = js.native
  
  /**
    * Item is created.
    */
  @js.native
  sealed trait Created extends ContainerItemStatus
  /* 1 */ @js.native
  object Created extends TopLevel[Created with Double]
  
  /**
    * Item is a file pending for upload.
    */
  @js.native
  sealed trait PendingUpload extends ContainerItemStatus
  /* 2 */ @js.native
  object PendingUpload extends TopLevel[PendingUpload with Double]
}
