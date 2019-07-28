package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionQueryFilterType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionQueryFilterType")
@js.native
object ExtensionQueryFilterType extends js.Object {
  /**
    * The catgeory is unlike other filters. It is AND'd with the other filters instead of being a seperate query.
    */
  @js.native
  sealed trait Category extends ExtensionQueryFilterType
  
  /**
    * Certain contribution types may be indexed to allow for query by type. User defined types can't be indexed at the moment.
    */
  @js.native
  sealed trait ContributionType extends ExtensionQueryFilterType
  
  /**
    * The Values are an ExtensionName or fragment that is used to match other extension names.
    */
  @js.native
  sealed trait DisplayName extends ExtensionQueryFilterType
  
  /**
    * When retrieving extensions from a query, exclude the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be excluded. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This only acts as a restrictive filter after. In case of having a particular flag in both IncludeWithFlags and ExcludeWithFlags, excludeFlags will remove the included extensions giving empty result for that flag.
    */
  @js.native
  sealed trait ExcludeWithFlags extends ExtensionQueryFilterType
  
  /**
    * Query for featured extensions, no value is allowed when using the query type.
    */
  @js.native
  sealed trait Featured extends ExtensionQueryFilterType
  
  /**
    * Query for extensions that are featured in their own category, The filterValue for this is name of category of extensions.
    */
  @js.native
  sealed trait FeaturedInCategory extends ExtensionQueryFilterType
  
  /**
    * Retrieve a set of extensions based on their id's. The values should be the extension id's encoded as strings.
    */
  @js.native
  sealed trait Id extends ExtensionQueryFilterType
  
  /**
    * When retrieving extensions from a query, include the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be included. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This only acts as a restrictive filter after. In case of having a particular flag in both IncludeWithFlags and ExcludeWithFlags, excludeFlags will remove the included extensions giving empty result for that flag. In case of multiple flags given in IncludeWithFlags in ORed fashion, extensions having any of the given flags will be included.
    */
  @js.native
  sealed trait IncludeWithFlags extends ExtensionQueryFilterType
  
  /**
    * The InstallationTarget for an extension defines the target consumer for the extension. This may be something like VS, VSOnline, or VSCode
    */
  @js.native
  sealed trait InstallationTarget extends ExtensionQueryFilterType
  
  /**
    * Filter to provide the version of the installation target. This filter will be used along with InstallationTarget filter. The value should be a valid version string. Currently supported only if search text is provided.
    */
  @js.native
  sealed trait InstallationTargetVersion extends ExtensionQueryFilterType
  
  /**
    * Filter type for specifying a range of installation target version. The filter will be used along with InstallationTarget filter. The value should be a pair of well formed version values separated by hyphen(-). Currently supported only if search text is provided.
    */
  @js.native
  sealed trait InstallationTargetVersionRange extends ExtensionQueryFilterType
  
  /**
    * Fitler the extensions based on the LCID values applicable. Any extensions which are not having any LCID values will also be filtered. This is currenlty only supported for VS extensions.
    */
  @js.native
  sealed trait Lcid extends ExtensionQueryFilterType
  
  /**
    * Retrieve an set extension based on the name based identifier. This differs from the internal id (which is being deprecated).
    */
  @js.native
  sealed trait Name extends ExtensionQueryFilterType
  
  /**
    * The Filter is one or more tokens that define what scope to return private extensions for.
    */
  @js.native
  sealed trait Private extends ExtensionQueryFilterType
  
  /**
    * The SearchText provided by the user to search for extensions
    */
  @js.native
  sealed trait SearchText extends ExtensionQueryFilterType
  
  /**
    * The values are used as tags. All tags are treated as "OR" conditions with each other. There may be some value put on the number of matched tags from the query.
    */
  @js.native
  sealed trait Tag extends ExtensionQueryFilterType
  
  /**
    * Filter type for specifying metadata key and value to be used for filtering.
    */
  @js.native
  sealed trait VsixMetadata extends ExtensionQueryFilterType
  
  /* 5 */ val Category: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Category with Double = js.native
  /* 6 */ val ContributionType: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.ContributionType with Double = js.native
  /* 2 */ val DisplayName: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.DisplayName with Double = js.native
  /* 12 */ val ExcludeWithFlags: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.ExcludeWithFlags with Double = js.native
  /* 9 */ val Featured: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Featured with Double = js.native
  /* 11 */ val FeaturedInCategory: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.FeaturedInCategory with Double = js.native
  /* 4 */ val Id: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Id with Double = js.native
  /* 13 */ val IncludeWithFlags: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.IncludeWithFlags with Double = js.native
  /* 8 */ val InstallationTarget: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.InstallationTarget with Double = js.native
  /* 15 */ val InstallationTargetVersion: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.InstallationTargetVersion with Double = js.native
  /* 16 */ val InstallationTargetVersionRange: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.InstallationTargetVersionRange with Double = js.native
  /* 14 */ val Lcid: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Lcid with Double = js.native
  /* 7 */ val Name: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Name with Double = js.native
  /* 3 */ val Private: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Private with Double = js.native
  /* 10 */ val SearchText: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.SearchText with Double = js.native
  /* 1 */ val Tag: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.Tag with Double = js.native
  /* 17 */ val VsixMetadata: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionQueryFilterType.VsixMetadata with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionQueryFilterType with Double] = js.native
}

