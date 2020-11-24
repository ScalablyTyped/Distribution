package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PublishedExtensionFlags extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "PublishedExtensionFlags")
@js.native
object PublishedExtensionFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PublishedExtensionFlags with Double] = js.native
  
  /**
    * BuiltIn Extension are available to all Tenants. An explicit registration is not required. This attribute is reserved and can't be supplied by Extension Developers.  BuiltIn extensions are by definition Public. There is no need to set the public flag for extensions marked BuiltIn.
    */
  @js.native
  sealed trait BuiltIn extends PublishedExtensionFlags
  /* 2 */ @js.native
  object BuiltIn extends TopLevel[BuiltIn with Double]
  
  /**
    * The Disabled flag for an extension means the extension can't be changed and won't be used by consumers. The disabled flag is managed by the service and can't be supplied by the Extension Developers.
    */
  @js.native
  sealed trait Disabled extends PublishedExtensionFlags
  /* 1 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /**
    * The Locked flag indicates that extension has been locked from Marketplace. Further updates/acquisitions are not allowed on the extension until this is present. This should be used along with making the extension private/unpublished.
    */
  @js.native
  sealed trait Locked extends PublishedExtensionFlags
  /* 16384 */ @js.native
  object Locked extends TopLevel[Locked with Double]
  
  /**
    * This extension has multiple versions active at one time and version discovery should be done usig the defined "Version Discovery" protocol to determine the version available to a specific user or tenant.  @TODO: Link to Version Discovery Protocol.
    */
  @js.native
  sealed trait MultiVersion extends PublishedExtensionFlags
  /* 512 */ @js.native
  object MultiVersion extends TopLevel[MultiVersion with Double]
  
  /**
    * No flags exist for this extension.
    */
  @js.native
  sealed trait None extends PublishedExtensionFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * The Paid flag indicates that the commerce can be enabled for this extension. Publisher needs to setup Offer/Pricing plan in Azure. If Paid flag is set and a corresponding Offer is not available, the extension will automatically be marked as Preview. If the publisher intends to make the extension Paid in the future, it is mandatory to set the Preview flag. This is currently available only for VSTS extensions only.
    */
  @js.native
  sealed trait Paid extends PublishedExtensionFlags
  /* 16 */ @js.native
  object Paid extends TopLevel[Paid with Double]
  
  /**
    * The Preview flag indicates that the extension is still under preview (not yet of "release" quality). These extensions may be decorated differently in the gallery and may have different policies applied to them.
    */
  @js.native
  sealed trait Preview extends PublishedExtensionFlags
  /* 2048 */ @js.native
  object Preview extends TopLevel[Preview with Double]
  
  /**
    * This extension registration is public, making its visibilty open to the public. This means all tenants have the ability to install this extension. Without this flag the extension will be private and will need to be shared with the tenants that can install it.
    */
  @js.native
  sealed trait Public extends PublishedExtensionFlags
  /* 256 */ @js.native
  object Public extends TopLevel[Public with Double]
  
  /**
    * The system flag is reserved, and cant be used by publishers.
    */
  @js.native
  sealed trait System extends PublishedExtensionFlags
  /* 1024 */ @js.native
  object System extends TopLevel[System with Double]
  
  /**
    * The Trial flag indicates that the extension is in Trial version. The flag is right now being used only with respec to Visual Studio extensions.
    */
  @js.native
  sealed trait Trial extends PublishedExtensionFlags
  /* 8192 */ @js.native
  object Trial extends TopLevel[Trial with Double]
  
  /**
    * Trusted extensions are ones that are given special capabilities. These tend to come from Microsoft and can't be published by the general public.  Note: BuiltIn extensions are always trusted.
    */
  @js.native
  sealed trait Trusted extends PublishedExtensionFlags
  /* 8 */ @js.native
  object Trusted extends TopLevel[Trusted with Double]
  
  /**
    * The Unpublished flag indicates that the extension can't be installed/downloaded. Users who have installed such an extension can continue to use the extension.
    */
  @js.native
  sealed trait Unpublished extends PublishedExtensionFlags
  /* 4096 */ @js.native
  object Unpublished extends TopLevel[Unpublished with Double]
  
  /**
    * This extension has been validated by the service. The extension meets the requirements specified. This attribute is reserved and can't be supplied by the Extension Developers. Validation is a process that ensures that all contributions are well formed. They meet the requirements defined by the contribution type they are extending. Note this attribute will be updated asynchronously as the extension is validated by the developer of the contribution type. There will be restricted access to the extension while this process is performed.
    */
  @js.native
  sealed trait Validated extends PublishedExtensionFlags
  /* 4 */ @js.native
  object Validated extends TopLevel[Validated with Double]
}
