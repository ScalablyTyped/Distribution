package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionQueryFlags")
@js.native
object ExtensionQueryFlags extends js.Object {
  /**
    * AllAttributes is designed to be a mask that defines all sub-elements of the extension should be returned.  NOTE: This is not actually All flags. This is now locked to the set defined since changing this enum would be a breaking change and would change the behavior of anyone using it. Try not to use this value when making calls to the service, instead be explicit about the options required.
    */
  @js.native
  sealed trait AllAttributes
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Excluding non-validated extensions will remove any extension versions that either are in the process of being validated or have failed validation.
    */
  @js.native
  sealed trait ExcludeNonValidated
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Include the base uri for assets of this extension
    */
  @js.native
  sealed trait IncludeAssetUri
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Include the Categories and Tags that were added to the extension definition.
    */
  @js.native
  sealed trait IncludeCategoryAndTags
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * IncludeFiles will return information about which files were found within the extension that were stored independant of the manifest. When asking for files, versions will be included as well since files are returned as a property of the versions.  These files can be retrieved using the path to the file without requiring the entire manifest be downloaded.
    */
  @js.native
  sealed trait IncludeFiles
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Include the set of installation targets the extension has requested.
    */
  @js.native
  sealed trait IncludeInstallationTargets
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * When retrieving versions from a query, only include the latest version of the extensions that matched. This is useful when the caller doesn't need all the published versions. It will save a significant size in the returned payload.
    */
  @js.native
  sealed trait IncludeLatestVersionOnly
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * This flag is used to get Lcid values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal
    */
  @js.native
  sealed trait IncludeLcids
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * This flag is used to get all the metadata values associated with the extension. This is not applicable to VSTS or VSCode extensions and usage is only internal.
    */
  @js.native
  sealed trait IncludeMetadata
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * This flag is used to indicate to return very small data for extension reruired by VS IDE. This flag is only compatible when querying is done by VS IDE
    */
  @js.native
  sealed trait IncludeMinimalPayloadForVsIde
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Include the details about which accounts the extension has been shared with if the extesion is a private extension.
    */
  @js.native
  sealed trait IncludeSharedAccounts
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Include the statistics associated with this extension
    */
  @js.native
  sealed trait IncludeStatistics
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * Include properties associated with versions of the extension
    */
  @js.native
  sealed trait IncludeVersionProperties
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * IncludeVersions will return version information for extensions returned
    */
  @js.native
  sealed trait IncludeVersions
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * None is used to retrieve only the basic extension details.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /**
    * This flag switches the asset uri to use GetAssetByName instead of CDN When this is used, values of base asset uri and base asset uri fallback are switched When this is used, source of asset files are pointed to Gallery service always even if CDN is available
    */
  @js.native
  sealed trait UseFallbackAssetUri
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags
  
  /* 479 */ val AllAttributes: AllAttributes with scala.Double = js.native
  /* 32 */ val ExcludeNonValidated: ExcludeNonValidated with scala.Double = js.native
  /* 128 */ val IncludeAssetUri: IncludeAssetUri with scala.Double = js.native
  /* 4 */ val IncludeCategoryAndTags: IncludeCategoryAndTags with scala.Double = js.native
  /* 2 */ val IncludeFiles: IncludeFiles with scala.Double = js.native
  /* 64 */ val IncludeInstallationTargets: IncludeInstallationTargets with scala.Double = js.native
  /* 512 */ val IncludeLatestVersionOnly: IncludeLatestVersionOnly with scala.Double = js.native
  /* 8192 */ val IncludeLcids: IncludeLcids with scala.Double = js.native
  /* 2048 */ val IncludeMetadata: IncludeMetadata with scala.Double = js.native
  /* 4096 */ val IncludeMinimalPayloadForVsIde: IncludeMinimalPayloadForVsIde with scala.Double = js.native
  /* 8 */ val IncludeSharedAccounts: IncludeSharedAccounts with scala.Double = js.native
  /* 256 */ val IncludeStatistics: IncludeStatistics with scala.Double = js.native
  /* 16 */ val IncludeVersionProperties: IncludeVersionProperties with scala.Double = js.native
  /* 1 */ val IncludeVersions: IncludeVersions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1024 */ val UseFallbackAssetUri: UseFallbackAssetUri with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFlags with scala.Double
  ] = js.native
}

