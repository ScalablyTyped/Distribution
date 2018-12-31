package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NotificationTemplateType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "NotificationTemplateType")
@js.native
object NotificationTemplateType extends js.Object {
  /**
    * Template type for Customer Contact Notification.
    */
  @js.native
  sealed trait CustomerContactNotification
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.NotificationTemplateType
  
  /**
    * Template type for Publisher Member Notification.
    */
  @js.native
  sealed trait PublisherMemberUpdateNotification
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.NotificationTemplateType
  
  /**
    * Template type for Qna Notification.
    */
  @js.native
  sealed trait QnaNotification
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.NotificationTemplateType
  
  /**
    * Template type for Review Notification.
    */
  @js.native
  sealed trait ReviewNotification
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.NotificationTemplateType
  
  /* 3 */ val CustomerContactNotification: CustomerContactNotification with scala.Double = js.native
  /* 4 */ val PublisherMemberUpdateNotification: PublisherMemberUpdateNotification with scala.Double = js.native
  /* 2 */ val QnaNotification: QnaNotification with scala.Double = js.native
  /* 1 */ val ReviewNotification: ReviewNotification with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.NotificationTemplateType with scala.Double
  ] = js.native
}

