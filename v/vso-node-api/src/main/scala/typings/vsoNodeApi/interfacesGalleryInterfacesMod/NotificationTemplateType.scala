package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationTemplateType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "NotificationTemplateType")
@js.native
object NotificationTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationTemplateType & Double] = js.native
  
  /**
    * Template type for Customer Contact Notification.
    */
  @js.native
  sealed trait CustomerContactNotification
    extends StObject
       with NotificationTemplateType
  /* 3 */ val CustomerContactNotification: typings.vsoNodeApi.interfacesGalleryInterfacesMod.NotificationTemplateType.CustomerContactNotification & Double = js.native
  
  /**
    * Template type for Publisher Member Notification.
    */
  @js.native
  sealed trait PublisherMemberUpdateNotification
    extends StObject
       with NotificationTemplateType
  /* 4 */ val PublisherMemberUpdateNotification: typings.vsoNodeApi.interfacesGalleryInterfacesMod.NotificationTemplateType.PublisherMemberUpdateNotification & Double = js.native
  
  /**
    * Template type for Qna Notification.
    */
  @js.native
  sealed trait QnaNotification
    extends StObject
       with NotificationTemplateType
  /* 2 */ val QnaNotification: typings.vsoNodeApi.interfacesGalleryInterfacesMod.NotificationTemplateType.QnaNotification & Double = js.native
  
  /**
    * Template type for Review Notification.
    */
  @js.native
  sealed trait ReviewNotification
    extends StObject
       with NotificationTemplateType
  /* 1 */ val ReviewNotification: typings.vsoNodeApi.interfacesGalleryInterfacesMod.NotificationTemplateType.ReviewNotification & Double = js.native
}
