package typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VersionControlRecursionType extends js.Object

@JSImport("vso-node-api/interfaces/TfvcInterfaces", "VersionControlRecursionType")
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
  
  /* 120 */ val Full: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlRecursionType.Full with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlRecursionType.None with Double = js.native
  /* 1 */ val OneLevel: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlRecursionType.OneLevel with Double = js.native
  /* 4 */ val OneLevelPlusNestedEmptyFolders: typings.vsoDashNodeDashApi.interfacesTfvcInterfacesMod.VersionControlRecursionType.OneLevelPlusNestedEmptyFolders with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlRecursionType with Double] = js.native
}

