package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getWorkspace` operation. */
@JSImport("watson-developer-cloud/assistant/v1", "GetWorkspaceConstants")
@js.native
object GetWorkspaceConstants extends js.Object {
  
  @js.native
  sealed trait Sort extends js.Object
  /** Indicates how the returned workspace data will be sorted. This parameter is valid only if **export**=`true`. Specify `sort=stable` to sort all workspace objects by unique identifier, in ascending alphabetical order. */
  @js.native
  object Sort extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait STABLE extends Sort
    /* "stable" */ @js.native
    object STABLE extends TopLevel[STABLE with String]
  }
}
