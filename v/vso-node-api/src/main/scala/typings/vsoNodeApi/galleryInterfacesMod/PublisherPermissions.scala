package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublisherPermissions extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherPermissions")
@js.native
object PublisherPermissions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherPermissions with Double] = js.native
  
  /**
    * Admin gives the bearer the rights to manage restricted attributes of Publishers and Extensions.
    */
  @js.native
  sealed trait Admin extends PublisherPermissions
  /* 16 */ @js.native
  object Admin extends TopLevel[Admin with Double]
  
  /**
    * This gives the bearer the rights to create new Publishers at the root of the namespace.
    */
  @js.native
  sealed trait CreatePublisher extends PublisherPermissions
  /* 4 */ @js.native
  object CreatePublisher extends TopLevel[CreatePublisher with Double]
  
  /**
    * This gives the bearer the rights to delete any extension.
    */
  @js.native
  sealed trait DeleteExtension extends PublisherPermissions
  /* 128 */ @js.native
  object DeleteExtension extends TopLevel[DeleteExtension with Double]
  
  /**
    * This gives the bearer the rights to delete the publisher.
    */
  @js.native
  sealed trait DeletePublisher extends PublisherPermissions
  /* 2048 */ @js.native
  object DeletePublisher extends TopLevel[DeletePublisher with Double]
  
  /**
    * This gives the bearer the rights edit the publisher settings.
    */
  @js.native
  sealed trait EditSettings extends PublisherPermissions
  /* 256 */ @js.native
  object EditSettings extends TopLevel[EditSettings with Double]
  
  /**
    * This gives the bearer the rights to assign permissions on the publisher.
    */
  @js.native
  sealed trait ManagePermissions extends PublisherPermissions
  /* 1024 */ @js.native
  object ManagePermissions extends TopLevel[ManagePermissions with Double]
  
  /**
    * PrivateRead is another form of read designed to allow higher privilege accessors the ability to read private extensions.
    */
  @js.native
  sealed trait PrivateRead extends PublisherPermissions
  /* 64 */ @js.native
  object PrivateRead extends TopLevel[PrivateRead with Double]
  
  /**
    * This gives the bearer the rights to create new Extensions within a publisher.
    */
  @js.native
  sealed trait PublishExtension extends PublisherPermissions
  /* 8 */ @js.native
  object PublishExtension extends TopLevel[PublishExtension with Double]
  
  /**
    * This gives the bearer the rights to read Publishers and Extensions.
    */
  @js.native
  sealed trait Read extends PublisherPermissions
  /* 1 */ @js.native
  object Read extends TopLevel[Read with Double]
  
  /**
    * TrustedPartner gives the bearer the rights to publish a extensions with restricted capabilities.
    */
  @js.native
  sealed trait TrustedPartner extends PublisherPermissions
  /* 32 */ @js.native
  object TrustedPartner extends TopLevel[TrustedPartner with Double]
  
  /**
    * This gives the bearer the rights to update, delete, and share Extensions (but not the ability to create them).
    */
  @js.native
  sealed trait UpdateExtension extends PublisherPermissions
  /* 2 */ @js.native
  object UpdateExtension extends TopLevel[UpdateExtension with Double]
  
  /**
    * This gives the bearer the rights to see all permissions on the publisher.
    */
  @js.native
  sealed trait ViewPermissions extends PublisherPermissions
  /* 512 */ @js.native
  object ViewPermissions extends TopLevel[ViewPermissions with Double]
}
