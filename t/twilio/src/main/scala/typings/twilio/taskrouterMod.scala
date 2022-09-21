package typings.twilio

import typings.twilio.workspaceMod.WorkspaceContext
import typings.twilio.workspaceMod.WorkspaceListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskrouterMod {
  
  @JSImport("twilio/lib/rest/Taskrouter", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Taskrouter {
    /**
      * Initialize taskrouter domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Taskrouter
    extends typings.twilio.domainMod.^ {
    
    val v1: typings.twilio.taskrouterV1Mod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def workspaces(sid: String): WorkspaceContext = js.native
    @JSName("workspaces")
    val workspaces_Original: WorkspaceListInstance = js.native
  }
}
