package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlRecursionType extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlRecursionType")
@js.native
object VersionControlRecursionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlRecursionType with Double] = js.native
  
  /**
    * Return specified item and all descendants
    */
  @js.native
  sealed trait Full extends VersionControlRecursionType
  /* 120 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /**
    * Only return the specified item.
    */
  @js.native
  sealed trait None extends VersionControlRecursionType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Return the specified item and its direct children.
    */
  @js.native
  sealed trait OneLevel extends VersionControlRecursionType
  /* 1 */ @js.native
  object OneLevel extends TopLevel[OneLevel with Double]
  
  /**
    * Return the specified item and its direct children, as well as recursive chains of nested child folders that only contain a single folder.
    */
  @js.native
  sealed trait OneLevelPlusNestedEmptyFolders extends VersionControlRecursionType
  /* 4 */ @js.native
  object OneLevelPlusNestedEmptyFolders extends TopLevel[OneLevelPlusNestedEmptyFolders with Double]
}
