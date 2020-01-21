package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QnAItemStatus extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "QnAItemStatus")
@js.native
object QnAItemStatus extends js.Object {
  @js.native
  sealed trait None extends QnAItemStatus
  
  /**
    * The PublisherCreated flag indicates whether the item has been created by extension publisher.
    */
  @js.native
  sealed trait PublisherCreated extends QnAItemStatus
  
  /**
    * The UserEditable flag indicates whether the item is editable by the logged in user.
    */
  @js.native
  sealed trait UserEditable extends QnAItemStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QnAItemStatus with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object PublisherCreated extends TopLevel[PublisherCreated with Double]
  
  /* 1 */ @js.native
  object UserEditable extends TopLevel[UserEditable with Double]
  
}

