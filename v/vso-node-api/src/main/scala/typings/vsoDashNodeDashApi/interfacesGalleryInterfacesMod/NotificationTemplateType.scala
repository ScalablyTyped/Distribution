package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

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
  sealed trait CustomerContactNotification extends NotificationTemplateType
  
  /**
    * Template type for Publisher Member Notification.
    */
  @js.native
  sealed trait PublisherMemberUpdateNotification extends NotificationTemplateType
  
  /**
    * Template type for Qna Notification.
    */
  @js.native
  sealed trait QnaNotification extends NotificationTemplateType
  
  /**
    * Template type for Review Notification.
    */
  @js.native
  sealed trait ReviewNotification extends NotificationTemplateType
  
  /* 3 */ val CustomerContactNotification: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.NotificationTemplateType.CustomerContactNotification with Double = js.native
  /* 4 */ val PublisherMemberUpdateNotification: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.NotificationTemplateType.PublisherMemberUpdateNotification with Double = js.native
  /* 2 */ val QnaNotification: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.NotificationTemplateType.QnaNotification with Double = js.native
  /* 1 */ val ReviewNotification: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.NotificationTemplateType.ReviewNotification with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationTemplateType with Double] = js.native
}

