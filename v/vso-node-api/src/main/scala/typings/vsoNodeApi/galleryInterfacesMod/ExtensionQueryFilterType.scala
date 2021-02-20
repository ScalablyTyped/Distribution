package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionQueryFilterType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionQueryFilterType")
@js.native
object ExtensionQueryFilterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionQueryFilterType with Double] = js.native
  
  /**
    * The catgeory is unlike other filters. It is AND'd with the other filters instead of being a seperate query.
    */
  @js.native
  sealed trait Category extends ExtensionQueryFilterType
  /* 5 */ val Category: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Category with Double = js.native
  
  /**
    * Certain contribution types may be indexed to allow for query by type. User defined types can't be indexed at the moment.
    */
  @js.native
  sealed trait ContributionType extends ExtensionQueryFilterType
  /* 6 */ val ContributionType: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.ContributionType with Double = js.native
  
  /**
    * The Values are an ExtensionName or fragment that is used to match other extension names.
    */
  @js.native
  sealed trait DisplayName extends ExtensionQueryFilterType
  /* 2 */ val DisplayName: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.DisplayName with Double = js.native
  
  /**
    * When retrieving extensions from a query, exclude the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be excluded. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This only acts as a restrictive filter after. In case of having a particular flag in both IncludeWithFlags and ExcludeWithFlags, excludeFlags will remove the included extensions giving empty result for that flag.
    */
  @js.native
  sealed trait ExcludeWithFlags extends ExtensionQueryFilterType
  /* 12 */ val ExcludeWithFlags: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.ExcludeWithFlags with Double = js.native
  
  /**
    * Query for featured extensions, no value is allowed when using the query type.
    */
  @js.native
  sealed trait Featured extends ExtensionQueryFilterType
  /* 9 */ val Featured: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Featured with Double = js.native
  
  /**
    * Query for extensions that are featured in their own category, The filterValue for this is name of category of extensions.
    */
  @js.native
  sealed trait FeaturedInCategory extends ExtensionQueryFilterType
  /* 11 */ val FeaturedInCategory: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.FeaturedInCategory with Double = js.native
  
  /**
    * Retrieve a set of extensions based on their id's. The values should be the extension id's encoded as strings.
    */
  @js.native
  sealed trait Id extends ExtensionQueryFilterType
  /* 4 */ val Id: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Id with Double = js.native
  
  /**
    * When retrieving extensions from a query, include the extensions which are having the given flags. The value specified for this filter should be a string representing the integer values of the flags to be included. In case of mulitple flags to be specified, a logical OR of the interger values should be given as value for this filter This should be at most one filter of this type. This only acts as a restrictive filter after. In case of having a particular flag in both IncludeWithFlags and ExcludeWithFlags, excludeFlags will remove the included extensions giving empty result for that flag. In case of multiple flags given in IncludeWithFlags in ORed fashion, extensions having any of the given flags will be included.
    */
  @js.native
  sealed trait IncludeWithFlags extends ExtensionQueryFilterType
  /* 13 */ val IncludeWithFlags: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.IncludeWithFlags with Double = js.native
  
  /**
    * The InstallationTarget for an extension defines the target consumer for the extension. This may be something like VS, VSOnline, or VSCode
    */
  @js.native
  sealed trait InstallationTarget extends ExtensionQueryFilterType
  /* 8 */ val InstallationTarget: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.InstallationTarget with Double = js.native
  
  /**
    * Filter to provide the version of the installation target. This filter will be used along with InstallationTarget filter. The value should be a valid version string. Currently supported only if search text is provided.
    */
  @js.native
  sealed trait InstallationTargetVersion extends ExtensionQueryFilterType
  /* 15 */ val InstallationTargetVersion: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.InstallationTargetVersion with Double = js.native
  
  /**
    * Filter type for specifying a range of installation target version. The filter will be used along with InstallationTarget filter. The value should be a pair of well formed version values separated by hyphen(-). Currently supported only if search text is provided.
    */
  @js.native
  sealed trait InstallationTargetVersionRange extends ExtensionQueryFilterType
  /* 16 */ val InstallationTargetVersionRange: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.InstallationTargetVersionRange with Double = js.native
  
  /**
    * Fitler the extensions based on the LCID values applicable. Any extensions which are not having any LCID values will also be filtered. This is currenlty only supported for VS extensions.
    */
  @js.native
  sealed trait Lcid extends ExtensionQueryFilterType
  /* 14 */ val Lcid: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Lcid with Double = js.native
  
  /**
    * Retrieve an set extension based on the name based identifier. This differs from the internal id (which is being deprecated).
    */
  @js.native
  sealed trait Name extends ExtensionQueryFilterType
  /* 7 */ val Name: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Name with Double = js.native
  
  /**
    * The Filter is one or more tokens that define what scope to return private extensions for.
    */
  @js.native
  sealed trait Private extends ExtensionQueryFilterType
  /* 3 */ val Private: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Private with Double = js.native
  
  /**
    * The SearchText provided by the user to search for extensions
    */
  @js.native
  sealed trait SearchText extends ExtensionQueryFilterType
  /* 10 */ val SearchText: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.SearchText with Double = js.native
  
  /**
    * The values are used as tags. All tags are treated as "OR" conditions with each other. There may be some value put on the number of matched tags from the query.
    */
  @js.native
  sealed trait Tag extends ExtensionQueryFilterType
  /* 1 */ val Tag: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.Tag with Double = js.native
  
  /**
    * Filter type for specifying metadata key and value to be used for filtering.
    */
  @js.native
  sealed trait VsixMetadata extends ExtensionQueryFilterType
  /* 17 */ val VsixMetadata: typings.vsoNodeApi.galleryInterfacesMod.ExtensionQueryFilterType.VsixMetadata with Double = js.native
}
