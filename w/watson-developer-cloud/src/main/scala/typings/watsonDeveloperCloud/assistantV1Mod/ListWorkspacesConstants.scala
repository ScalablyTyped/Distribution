package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listWorkspaces` operation. */
object ListWorkspacesConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** The attribute by which returned workspaces will be sorted. To reverse the sort order, prefix the value with a minus sign (`-`). */
  @JSImport("watson-developer-cloud/assistant/v1", "ListWorkspacesConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort & String] = js.native
    
    @js.native
    sealed trait NAME
      extends StObject
         with Sort
    /* "name" */ val NAME: typings.watsonDeveloperCloud.assistantV1Mod.ListWorkspacesConstants.Sort.NAME & String = js.native
    
    @js.native
    sealed trait UPDATED
      extends StObject
         with Sort
    /* "updated" */ val UPDATED: typings.watsonDeveloperCloud.assistantV1Mod.ListWorkspacesConstants.Sort.UPDATED & String = js.native
  }
}
