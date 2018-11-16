package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Full
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType
  
  /**
       * Only return the specified item.
       */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType
  
  /**
       * Return the specified item and its direct children.
       */
  @js.native
  sealed trait OneLevel
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType
  
  /**
       * Return the specified item and its direct children, as well as recursive chains of nested child folders that only contain a single folder.
       */
  @js.native
  sealed trait OneLevelPlusNestedEmptyFolders
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType
  
  /* 120 */ val Full: Full with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val OneLevel: OneLevel with scala.Double = js.native
  /* 4 */ val OneLevelPlusNestedEmptyFolders: OneLevelPlusNestedEmptyFolders with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.VersionControlRecursionType with scala.Double
  ] = js.native
}

