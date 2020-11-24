package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionQueryOptions extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionQueryOptions")
@js.native
object ContributionQueryOptions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionQueryOptions with Double] = js.native
  
  /**
    * Some callers may want the entire tree back without constraint evaluation being performed.
    */
  @js.native
  sealed trait IgnoreConstraints extends ContributionQueryOptions
  /* 256 */ @js.native
  object IgnoreConstraints extends TopLevel[IgnoreConstraints with Double]
  
  /**
    * Include the contribution being queried as well as all contributions that target them recursively.
    */
  @js.native
  sealed trait IncludeAll extends ContributionQueryOptions
  /* 112 */ @js.native
  object IncludeAll extends TopLevel[IncludeAll with Double]
  
  /**
    * Include the contributions that directly target the contributions queried.
    */
  @js.native
  sealed trait IncludeChildren extends ContributionQueryOptions
  /* 32 */ @js.native
  object IncludeChildren extends TopLevel[IncludeChildren with Double]
  
  /**
    * Include the direct contributions that have the ids queried.
    */
  @js.native
  sealed trait IncludeSelf extends ContributionQueryOptions
  /* 16 */ @js.native
  object IncludeSelf extends TopLevel[IncludeSelf with Double]
  
  /**
    * Include the contributions from the entire sub-tree targetting the contributions queried.
    */
  @js.native
  sealed trait IncludeSubTree extends ContributionQueryOptions
  /* 96 */ @js.native
  object IncludeSubTree extends TopLevel[IncludeSubTree with Double]
  
  @js.native
  sealed trait None extends ContributionQueryOptions
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
