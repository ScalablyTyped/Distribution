package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.QnAItemStatus.None with Double = js.native
  /* 2 */ val PublisherCreated: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.QnAItemStatus.PublisherCreated with Double = js.native
  /* 1 */ val UserEditable: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.QnAItemStatus.UserEditable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QnAItemStatus with Double] = js.native
}

