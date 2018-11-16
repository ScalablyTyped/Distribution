package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait Admin
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to create new Publishers at the root of the namespace.
       */
  @js.native
  sealed trait CreatePublisher
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to delete any extension.
       */
  @js.native
  sealed trait DeleteExtension
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to delete the publisher.
       */
  @js.native
  sealed trait DeletePublisher
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights edit the publisher settings.
       */
  @js.native
  sealed trait EditSettings
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to assign permissions on the publisher.
       */
  @js.native
  sealed trait ManagePermissions
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * PrivateRead is another form of read designed to allow higher privilege accessors the ability to read private extensions.
       */
  @js.native
  sealed trait PrivateRead
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to create new Extensions within a publisher.
       */
  @js.native
  sealed trait PublishExtension
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to read Publishers and Extensions.
       */
  @js.native
  sealed trait Read
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * TrustedPartner gives the bearer the rights to publish a extensions with restricted capabilities.
       */
  @js.native
  sealed trait TrustedPartner
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to update, delete, and share Extensions (but not the ability to create them).
       */
  @js.native
  sealed trait UpdateExtension
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /**
       * This gives the bearer the rights to see all permissions on the publisher.
       */
  @js.native
  sealed trait ViewPermissions
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions
  
  /* 16 */ val Admin: Admin with scala.Double = js.native
  /* 4 */ val CreatePublisher: CreatePublisher with scala.Double = js.native
  /* 128 */ val DeleteExtension: DeleteExtension with scala.Double = js.native
  /* 2048 */ val DeletePublisher: DeletePublisher with scala.Double = js.native
  /* 256 */ val EditSettings: EditSettings with scala.Double = js.native
  /* 1024 */ val ManagePermissions: ManagePermissions with scala.Double = js.native
  /* 64 */ val PrivateRead: PrivateRead with scala.Double = js.native
  /* 8 */ val PublishExtension: PublishExtension with scala.Double = js.native
  /* 1 */ val Read: Read with scala.Double = js.native
  /* 32 */ val TrustedPartner: TrustedPartner with scala.Double = js.native
  /* 2 */ val UpdateExtension: UpdateExtension with scala.Double = js.native
  /* 512 */ val ViewPermissions: ViewPermissions with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublisherPermissions with scala.Double
  ] = js.native
}

