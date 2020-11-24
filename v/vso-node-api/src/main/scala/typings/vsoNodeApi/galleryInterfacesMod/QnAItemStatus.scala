package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QnAItemStatus extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "QnAItemStatus")
@js.native
object QnAItemStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QnAItemStatus with Double] = js.native
  
  @js.native
  sealed trait None extends QnAItemStatus
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * The PublisherCreated flag indicates whether the item has been created by extension publisher.
    */
  @js.native
  sealed trait PublisherCreated extends QnAItemStatus
  /* 2 */ @js.native
  object PublisherCreated extends TopLevel[PublisherCreated with Double]
  
  /**
    * The UserEditable flag indicates whether the item is editable by the logged in user.
    */
  @js.native
  sealed trait UserEditable extends QnAItemStatus
  /* 1 */ @js.native
  object UserEditable extends TopLevel[UserEditable with Double]
}
