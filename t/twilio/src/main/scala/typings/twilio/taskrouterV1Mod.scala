package typings.twilio

import typings.twilio.workspaceMod.WorkspaceContext
import typings.twilio.workspaceMod.WorkspaceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskrouterV1Mod {
  
  @JSImport("twilio/lib/rest/taskrouter/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Taskrouter
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.taskrouterMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def workspaces(sid: String): WorkspaceContext = js.native
    @JSName("workspaces")
    val workspaces_Original: WorkspaceListInstance = js.native
  }
}
