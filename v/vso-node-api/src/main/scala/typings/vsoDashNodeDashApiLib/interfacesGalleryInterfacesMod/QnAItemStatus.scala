package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QnAItemStatus extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "QnAItemStatus")
@js.native
object QnAItemStatus extends js.Object {
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.QnAItemStatus
  
  /**
       * The PublisherCreated flag indicates whether the item has been created by extension publisher.
       */
  @js.native
  sealed trait PublisherCreated
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.QnAItemStatus
  
  /**
       * The UserEditable flag indicates whether the item is editable by the logged in user.
       */
  @js.native
  sealed trait UserEditable
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.QnAItemStatus
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val PublisherCreated: PublisherCreated with scala.Double = js.native
  /* 1 */ val UserEditable: UserEditable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.QnAItemStatus with scala.Double
  ] = js.native
}

