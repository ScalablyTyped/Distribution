package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublisherPermissions extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherPermissions")
@js.native
object PublisherPermissions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherPermissions with Double] = js.native
  
  /**
    * Admin gives the bearer the rights to manage restricted attributes of Publishers and Extensions.
    */
  @js.native
  sealed trait Admin extends PublisherPermissions
  /* 16 */ val Admin: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.Admin with Double = js.native
  
  /**
    * This gives the bearer the rights to create new Publishers at the root of the namespace.
    */
  @js.native
  sealed trait CreatePublisher extends PublisherPermissions
  /* 4 */ val CreatePublisher: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.CreatePublisher with Double = js.native
  
  /**
    * This gives the bearer the rights to delete any extension.
    */
  @js.native
  sealed trait DeleteExtension extends PublisherPermissions
  /* 128 */ val DeleteExtension: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.DeleteExtension with Double = js.native
  
  /**
    * This gives the bearer the rights to delete the publisher.
    */
  @js.native
  sealed trait DeletePublisher extends PublisherPermissions
  /* 2048 */ val DeletePublisher: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.DeletePublisher with Double = js.native
  
  /**
    * This gives the bearer the rights edit the publisher settings.
    */
  @js.native
  sealed trait EditSettings extends PublisherPermissions
  /* 256 */ val EditSettings: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.EditSettings with Double = js.native
  
  /**
    * This gives the bearer the rights to assign permissions on the publisher.
    */
  @js.native
  sealed trait ManagePermissions extends PublisherPermissions
  /* 1024 */ val ManagePermissions: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.ManagePermissions with Double = js.native
  
  /**
    * PrivateRead is another form of read designed to allow higher privilege accessors the ability to read private extensions.
    */
  @js.native
  sealed trait PrivateRead extends PublisherPermissions
  /* 64 */ val PrivateRead: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.PrivateRead with Double = js.native
  
  /**
    * This gives the bearer the rights to create new Extensions within a publisher.
    */
  @js.native
  sealed trait PublishExtension extends PublisherPermissions
  /* 8 */ val PublishExtension: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.PublishExtension with Double = js.native
  
  /**
    * This gives the bearer the rights to read Publishers and Extensions.
    */
  @js.native
  sealed trait Read extends PublisherPermissions
  /* 1 */ val Read: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.Read with Double = js.native
  
  /**
    * TrustedPartner gives the bearer the rights to publish a extensions with restricted capabilities.
    */
  @js.native
  sealed trait TrustedPartner extends PublisherPermissions
  /* 32 */ val TrustedPartner: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.TrustedPartner with Double = js.native
  
  /**
    * This gives the bearer the rights to update, delete, and share Extensions (but not the ability to create them).
    */
  @js.native
  sealed trait UpdateExtension extends PublisherPermissions
  /* 2 */ val UpdateExtension: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.UpdateExtension with Double = js.native
  
  /**
    * This gives the bearer the rights to see all permissions on the publisher.
    */
  @js.native
  sealed trait ViewPermissions extends PublisherPermissions
  /* 512 */ val ViewPermissions: typings.vsoNodeApi.galleryInterfacesMod.PublisherPermissions.ViewPermissions with Double = js.native
}
