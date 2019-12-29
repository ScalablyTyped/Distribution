package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VersionControlRecursionType extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlRecursionType")
@js.native
object VersionControlRecursionType extends js.Object {
  /**
    * Return specified item and all descendants
    */
  @js.native
  sealed trait Full extends VersionControlRecursionType
  
  /**
    * Only return the specified item.
    */
  @js.native
  sealed trait None extends VersionControlRecursionType
  
  /**
    * Return the specified item and its direct children.
    */
  @js.native
  sealed trait OneLevel extends VersionControlRecursionType
  
  /**
    * Return the specified item and its direct children, as well as recursive chains of nested child folders that only contain a single folder.
    */
  @js.native
  sealed trait OneLevelPlusNestedEmptyFolders extends VersionControlRecursionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlRecursionType with Double] = js.native
  /* 120 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object OneLevel extends TopLevel[OneLevel with Double]
  
  /* 4 */ @js.native
  object OneLevelPlusNestedEmptyFolders extends TopLevel[OneLevelPlusNestedEmptyFolders with Double]
  
}

