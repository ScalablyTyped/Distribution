package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotificationTemplateType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "NotificationTemplateType")
@js.native
object NotificationTemplateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotificationTemplateType with Double] = js.native
  
  /**
    * Template type for Customer Contact Notification.
    */
  @js.native
  sealed trait CustomerContactNotification extends NotificationTemplateType
  /* 3 */ @js.native
  object CustomerContactNotification extends TopLevel[CustomerContactNotification with Double]
  
  /**
    * Template type for Publisher Member Notification.
    */
  @js.native
  sealed trait PublisherMemberUpdateNotification extends NotificationTemplateType
  /* 4 */ @js.native
  object PublisherMemberUpdateNotification extends TopLevel[PublisherMemberUpdateNotification with Double]
  
  /**
    * Template type for Qna Notification.
    */
  @js.native
  sealed trait QnaNotification extends NotificationTemplateType
  /* 2 */ @js.native
  object QnaNotification extends TopLevel[QnaNotification with Double]
  
  /**
    * Template type for Review Notification.
    */
  @js.native
  sealed trait ReviewNotification extends NotificationTemplateType
  /* 1 */ @js.native
  object ReviewNotification extends TopLevel[ReviewNotification with Double]
}
