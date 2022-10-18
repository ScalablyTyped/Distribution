package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlRecursionType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlRecursionType")
@js.native
object VersionControlRecursionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlRecursionType & Double] = js.native
  
  /**
    * Return specified item and all descendants
    */
  @js.native
  sealed trait Full
    extends StObject
       with VersionControlRecursionType
  /* 120 */ val Full: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlRecursionType.Full & Double = js.native
  
  /**
    * Only return the specified item.
    */
  @js.native
  sealed trait None
    extends StObject
       with VersionControlRecursionType
  /* 0 */ val None: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlRecursionType.None & Double = js.native
  
  /**
    * Return the specified item and its direct children.
    */
  @js.native
  sealed trait OneLevel
    extends StObject
       with VersionControlRecursionType
  /* 1 */ val OneLevel: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlRecursionType.OneLevel & Double = js.native
  
  /**
    * Return the specified item and its direct children, as well as recursive chains of nested child folders that only contain a single folder.
    */
  @js.native
  sealed trait OneLevelPlusNestedEmptyFolders
    extends StObject
       with VersionControlRecursionType
  /* 4 */ val OneLevelPlusNestedEmptyFolders: typings.vsoNodeApi.interfacesGitInterfacesMod.VersionControlRecursionType.OneLevelPlusNestedEmptyFolders & Double = js.native
}
