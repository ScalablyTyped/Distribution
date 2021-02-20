package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationTemplateType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "NotificationTemplateType")
@js.native
object NotificationTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationTemplateType with Double] = js.native
  
  /**
    * Template type for Customer Contact Notification.
    */
  @js.native
  sealed trait CustomerContactNotification extends NotificationTemplateType
  /* 3 */ val CustomerContactNotification: typings.vsoNodeApi.galleryInterfacesMod.NotificationTemplateType.CustomerContactNotification with Double = js.native
  
  /**
    * Template type for Publisher Member Notification.
    */
  @js.native
  sealed trait PublisherMemberUpdateNotification extends NotificationTemplateType
  /* 4 */ val PublisherMemberUpdateNotification: typings.vsoNodeApi.galleryInterfacesMod.NotificationTemplateType.PublisherMemberUpdateNotification with Double = js.native
  
  /**
    * Template type for Qna Notification.
    */
  @js.native
  sealed trait QnaNotification extends NotificationTemplateType
  /* 2 */ val QnaNotification: typings.vsoNodeApi.galleryInterfacesMod.NotificationTemplateType.QnaNotification with Double = js.native
  
  /**
    * Template type for Review Notification.
    */
  @js.native
  sealed trait ReviewNotification extends NotificationTemplateType
  /* 1 */ val ReviewNotification: typings.vsoNodeApi.galleryInterfacesMod.NotificationTemplateType.ReviewNotification with Double = js.native
}
