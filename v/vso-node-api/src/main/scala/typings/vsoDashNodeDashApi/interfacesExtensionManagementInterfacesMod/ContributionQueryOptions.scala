package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IgnoreConstraints
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeAll
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeChildren
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeSelf
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.IncludeSubTree
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionQueryOptions with Double] = js.native
  /* 256 */ @js.native
  object IgnoreConstraints extends TopLevel[IgnoreConstraints with Double]
  
  /* 112 */ @js.native
  object IncludeAll extends TopLevel[IncludeAll with Double]
  
  /* 32 */ @js.native
  object IncludeChildren extends TopLevel[IncludeChildren with Double]
  
  /* 16 */ @js.native
  object IncludeSelf extends TopLevel[IncludeSelf with Double]
  
  /* 96 */ @js.native
  object IncludeSubTree extends TopLevel[IncludeSubTree with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

