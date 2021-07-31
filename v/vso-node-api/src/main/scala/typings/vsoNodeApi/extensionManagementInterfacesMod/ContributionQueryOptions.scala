package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionQueryOptions extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionQueryOptions")
@js.native
object ContributionQueryOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionQueryOptions & Double] = js.native
  
  /**
    * Some callers may want the entire tree back without constraint evaluation being performed.
    */
  @js.native
  sealed trait IgnoreConstraints
    extends StObject
       with ContributionQueryOptions
  /* 256 */ val IgnoreConstraints: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IgnoreConstraints & Double = js.native
  
  /**
    * Include the contribution being queried as well as all contributions that target them recursively.
    */
  @js.native
  sealed trait IncludeAll
    extends StObject
       with ContributionQueryOptions
  /* 112 */ val IncludeAll: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeAll & Double = js.native
  
  /**
    * Include the contributions that directly target the contributions queried.
    */
  @js.native
  sealed trait IncludeChildren
    extends StObject
       with ContributionQueryOptions
  /* 32 */ val IncludeChildren: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeChildren & Double = js.native
  
  /**
    * Include the direct contributions that have the ids queried.
    */
  @js.native
  sealed trait IncludeSelf
    extends StObject
       with ContributionQueryOptions
  /* 16 */ val IncludeSelf: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeSelf & Double = js.native
  
  /**
    * Include the contributions from the entire sub-tree targetting the contributions queried.
    */
  @js.native
  sealed trait IncludeSubTree
    extends StObject
       with ContributionQueryOptions
  /* 96 */ val IncludeSubTree: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeSubTree & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ContributionQueryOptions
  /* 0 */ val None: typings.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.None & Double = js.native
}
