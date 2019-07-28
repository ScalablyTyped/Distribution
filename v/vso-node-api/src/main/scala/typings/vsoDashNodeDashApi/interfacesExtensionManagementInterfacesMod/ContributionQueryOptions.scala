package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContributionQueryOptions extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionQueryOptions")
@js.native
object ContributionQueryOptions extends js.Object {
  /**
    * Some callers may want the entire tree back without constraint evaluation being performed.
    */
  @js.native
  sealed trait IgnoreConstraints extends ContributionQueryOptions
  
  /**
    * Include the contribution being queried as well as all contributions that target them recursively.
    */
  @js.native
  sealed trait IncludeAll extends ContributionQueryOptions
  
  /**
    * Include the contributions that directly target the contributions queried.
    */
  @js.native
  sealed trait IncludeChildren extends ContributionQueryOptions
  
  /**
    * Include the direct contributions that have the ids queried.
    */
  @js.native
  sealed trait IncludeSelf extends ContributionQueryOptions
  
  /**
    * Include the contributions from the entire sub-tree targetting the contributions queried.
    */
  @js.native
  sealed trait IncludeSubTree extends ContributionQueryOptions
  
  @js.native
  sealed trait None extends ContributionQueryOptions
  
  /* 256 */ val IgnoreConstraints: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IgnoreConstraints with Double = js.native
  /* 112 */ val IncludeAll: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeAll with Double = js.native
  /* 32 */ val IncludeChildren: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeChildren with Double = js.native
  /* 16 */ val IncludeSelf: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeSelf with Double = js.native
  /* 96 */ val IncludeSubTree: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeSubTree with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionQueryOptions with Double] = js.native
}

