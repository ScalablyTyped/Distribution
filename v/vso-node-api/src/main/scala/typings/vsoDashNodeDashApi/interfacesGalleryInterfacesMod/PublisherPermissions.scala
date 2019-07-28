package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PublisherPermissions extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublisherPermissions")
@js.native
object PublisherPermissions extends js.Object {
  /**
    * Admin gives the bearer the rights to manage restricted attributes of Publishers and Extensions.
    */
  @js.native
  sealed trait Admin extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to create new Publishers at the root of the namespace.
    */
  @js.native
  sealed trait CreatePublisher extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to delete any extension.
    */
  @js.native
  sealed trait DeleteExtension extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to delete the publisher.
    */
  @js.native
  sealed trait DeletePublisher extends PublisherPermissions
  
  /**
    * This gives the bearer the rights edit the publisher settings.
    */
  @js.native
  sealed trait EditSettings extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to assign permissions on the publisher.
    */
  @js.native
  sealed trait ManagePermissions extends PublisherPermissions
  
  /**
    * PrivateRead is another form of read designed to allow higher privilege accessors the ability to read private extensions.
    */
  @js.native
  sealed trait PrivateRead extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to create new Extensions within a publisher.
    */
  @js.native
  sealed trait PublishExtension extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to read Publishers and Extensions.
    */
  @js.native
  sealed trait Read extends PublisherPermissions
  
  /**
    * TrustedPartner gives the bearer the rights to publish a extensions with restricted capabilities.
    */
  @js.native
  sealed trait TrustedPartner extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to update, delete, and share Extensions (but not the ability to create them).
    */
  @js.native
  sealed trait UpdateExtension extends PublisherPermissions
  
  /**
    * This gives the bearer the rights to see all permissions on the publisher.
    */
  @js.native
  sealed trait ViewPermissions extends PublisherPermissions
  
  /* 16 */ val Admin: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.Admin with Double = js.native
  /* 4 */ val CreatePublisher: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.CreatePublisher with Double = js.native
  /* 128 */ val DeleteExtension: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.DeleteExtension with Double = js.native
  /* 2048 */ val DeletePublisher: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.DeletePublisher with Double = js.native
  /* 256 */ val EditSettings: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.EditSettings with Double = js.native
  /* 1024 */ val ManagePermissions: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.ManagePermissions with Double = js.native
  /* 64 */ val PrivateRead: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.PrivateRead with Double = js.native
  /* 8 */ val PublishExtension: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.PublishExtension with Double = js.native
  /* 1 */ val Read: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.Read with Double = js.native
  /* 32 */ val TrustedPartner: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.TrustedPartner with Double = js.native
  /* 2 */ val UpdateExtension: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.UpdateExtension with Double = js.native
  /* 512 */ val ViewPermissions: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.PublisherPermissions.ViewPermissions with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublisherPermissions with Double] = js.native
}

