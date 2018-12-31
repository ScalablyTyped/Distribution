package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  sealed trait Category
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Certain contribution types may be indexed to allow for query by type. User defined types can't be indexed at the moment.
    */
  @js.native
  sealed trait ContributionType
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * The Values are an ExtensionName or fragment that is used to match other extension names.
    */
  @js.native
  sealed trait DisplayName
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * When retrieving extensions from a query, exclude the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be excluded. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This only acts as a restrictive filter after. In case of having a particular flag in both IncludeWithFlags and ExcludeWithFlags, excludeFlags will remove the included extensions giving empty result for that flag.
    */
  @js.native
  sealed trait ExcludeWithFlags
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Query for featured extensions, no value is allowed when using the query type.
    */
  @js.native
  sealed trait Featured
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Query for extensions that are featured in their own category, The filterValue for this is name of category of extensions.
    */
  @js.native
  sealed trait FeaturedInCategory
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Retrieve a set of extensions based on their id's. The values should be the extension id's encoded as strings.
    */
  @js.native
  sealed trait Id
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * When retrieving extensions from a query, include the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be included. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This only acts as a restrictive filter after. In case of having a particular flag in both IncludeWithFlags and ExcludeWithFlags, excludeFlags will remove the included extensions giving empty result for that flag. In case of multiple flags given in IncludeWithFlags in ORed fashion, extensions having any of the given flags will be included.
    */
  @js.native
  sealed trait IncludeWithFlags
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * The InstallationTarget for an extension defines the target consumer for the extension. This may be something like VS, VSOnline, or VSCode
    */
  @js.native
  sealed trait InstallationTarget
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Filter to provide the version of the installation target. This filter will be used along with InstallationTarget filter. The value should be a valid version string. Currently supported only if search text is provided.
    */
  @js.native
  sealed trait InstallationTargetVersion
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Filter type for specifying a range of installation target version. The filter will be used along with InstallationTarget filter. The value should be a pair of well formed version values separated by hyphen(-). Currently supported only if search text is provided.
    */
  @js.native
  sealed trait InstallationTargetVersionRange
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Fitler the extensions based on the LCID values applicable. Any extensions which are not having any LCID values will also be filtered. This is currenlty only supported for VS extensions.
    */
  @js.native
  sealed trait Lcid
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Retrieve an set extension based on the name based identifier. This differs from the internal id (which is being deprecated).
    */
  @js.native
  sealed trait Name
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * The Filter is one or more tokens that define what scope to return private extensions for.
    */
  @js.native
  sealed trait Private
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * The SearchText provided by the user to search for extensions
    */
  @js.native
  sealed trait SearchText
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * The values are used as tags. All tags are treated as "OR" conditions with each other. There may be some value put on the number of matched tags from the query.
    */
  @js.native
  sealed trait Tag
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /**
    * Filter type for specifying metadata key and value to be used for filtering.
    */
  @js.native
  sealed trait VsixMetadata
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType
  
  /* 5 */ val Category: Category with scala.Double = js.native
  /* 6 */ val ContributionType: ContributionType with scala.Double = js.native
  /* 2 */ val DisplayName: DisplayName with scala.Double = js.native
  /* 12 */ val ExcludeWithFlags: ExcludeWithFlags with scala.Double = js.native
  /* 9 */ val Featured: Featured with scala.Double = js.native
  /* 11 */ val FeaturedInCategory: FeaturedInCategory with scala.Double = js.native
  /* 4 */ val Id: Id with scala.Double = js.native
  /* 13 */ val IncludeWithFlags: IncludeWithFlags with scala.Double = js.native
  /* 8 */ val InstallationTarget: InstallationTarget with scala.Double = js.native
  /* 15 */ val InstallationTargetVersion: InstallationTargetVersion with scala.Double = js.native
  /* 16 */ val InstallationTargetVersionRange: InstallationTargetVersionRange with scala.Double = js.native
  /* 14 */ val Lcid: Lcid with scala.Double = js.native
  /* 7 */ val Name: Name with scala.Double = js.native
  /* 3 */ val Private: Private with scala.Double = js.native
  /* 10 */ val SearchText: SearchText with scala.Double = js.native
  /* 1 */ val Tag: Tag with scala.Double = js.native
  /* 17 */ val VsixMetadata: VsixMetadata with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionQueryFilterType with scala.Double
  ] = js.native
}

