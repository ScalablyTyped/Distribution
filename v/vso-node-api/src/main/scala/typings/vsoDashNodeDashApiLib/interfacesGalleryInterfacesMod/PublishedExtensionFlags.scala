package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PublishedExtensionFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublishedExtensionFlags")
@js.native
object PublishedExtensionFlags extends js.Object {
  /**
       * BuiltIn Extension are available to all Tenants. An explicit registration is not required. This attribute is reserved and can't be supplied by Extension Developers.  BuiltIn extensions are by definition Public. There is no need to set the public flag for extensions marked BuiltIn.
       */
  @js.native
  sealed trait BuiltIn
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The Disabled flag for an extension means the extension can't be changed and won't be used by consumers. The disabled flag is managed by the service and can't be supplied by the Extension Developers.
       */
  @js.native
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The Locked flag indicates that extension has been locked from Marketplace. Further updates/acquisitions are not allowed on the extension until this is present. This should be used along with making the extension private/unpublished.
       */
  @js.native
  sealed trait Locked
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * This extension has multiple versions active at one time and version discovery should be done usig the defined "Version Discovery" protocol to determine the version available to a specific user or tenant.  @TODO: Link to Version Discovery Protocol.
       */
  @js.native
  sealed trait MultiVersion
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * No flags exist for this extension.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The Paid flag indicates that the commerce can be enabled for this extension. Publisher needs to setup Offer/Pricing plan in Azure. If Paid flag is set and a corresponding Offer is not available, the extension will automatically be marked as Preview. If the publisher intends to make the extension Paid in the future, it is mandatory to set the Preview flag. This is currently available only for VSTS extensions only.
       */
  @js.native
  sealed trait Paid
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The Preview flag indicates that the extension is still under preview (not yet of "release" quality). These extensions may be decorated differently in the gallery and may have different policies applied to them.
       */
  @js.native
  sealed trait Preview
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * This extension registration is public, making its visibilty open to the public. This means all tenants have the ability to install this extension. Without this flag the extension will be private and will need to be shared with the tenants that can install it.
       */
  @js.native
  sealed trait Public
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The system flag is reserved, and cant be used by publishers.
       */
  @js.native
  sealed trait System
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The Trial flag indicates that the extension is in Trial version. The flag is right now being used only with respec to Visual Studio extensions.
       */
  @js.native
  sealed trait Trial
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
       */
  @js.native
  sealed trait Trusted
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * The Unpublished flag indicates that the extension can't be installed/downloaded. Users who have installed such an extension can continue to use the extension.
       */
  @js.native
  sealed trait Unpublished
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /**
       * This extension has been validated by the service. The extension meets the requirements specified. This attribute is reserved and can't be supplied by the Extension Developers. Validation is a process that ensures that all contributions are well formed. They meet the requirements defined by the contribution type they are extending. Note this attribute will be updated asynchronously as the extension is validated by the developer of the contribution type. There will be restricted access to the extension while this process is performed.
       */
  @js.native
  sealed trait Validated
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags
  
  /* 2 */ val BuiltIn: BuiltIn with scala.Double = js.native
  /* 1 */ val Disabled: Disabled with scala.Double = js.native
  /* 16384 */ val Locked: Locked with scala.Double = js.native
  /* 512 */ val MultiVersion: MultiVersion with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val Paid: Paid with scala.Double = js.native
  /* 2048 */ val Preview: Preview with scala.Double = js.native
  /* 256 */ val Public: Public with scala.Double = js.native
  /* 1024 */ val System: System with scala.Double = js.native
  /* 8192 */ val Trial: Trial with scala.Double = js.native
  /* 8 */ val Trusted: Trusted with scala.Double = js.native
  /* 4096 */ val Unpublished: Unpublished with scala.Double = js.native
  /* 4 */ val Validated: Validated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.PublishedExtensionFlags with scala.Double
  ] = js.native
}

