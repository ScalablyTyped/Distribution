package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  sealed trait IgnoreConstraints
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions
  
  /**
       * Include the contribution being queried as well as all contributions that target them recursively.
       */
  @js.native
  sealed trait IncludeAll
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions
  
  /**
       * Include the contributions that directly target the contributions queried.
       */
  @js.native
  sealed trait IncludeChildren
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions
  
  /**
       * Include the direct contributions that have the ids queried.
       */
  @js.native
  sealed trait IncludeSelf
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions
  
  /**
       * Include the contributions from the entire sub-tree targetting the contributions queried.
       */
  @js.native
  sealed trait IncludeSubTree
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions
  
  /* 256 */ val IgnoreConstraints: IgnoreConstraints with scala.Double = js.native
  /* 112 */ val IncludeAll: IncludeAll with scala.Double = js.native
  /* 32 */ val IncludeChildren: IncludeChildren with scala.Double = js.native
  /* 16 */ val IncludeSelf: IncludeSelf with scala.Double = js.native
  /* 96 */ val IncludeSubTree: IncludeSubTree with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ContributionQueryOptions with scala.Double
  ] = js.native
}

