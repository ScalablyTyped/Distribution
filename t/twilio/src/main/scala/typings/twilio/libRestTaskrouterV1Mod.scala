package typings.twilio

import typings.twilio.libRestTaskrouterBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTaskrouterV1Mod {
  
  @JSImport("twilio/lib/rest/taskrouter/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Taskrouter
      *
      * @param domain - The Twilio (Twilio.Taskrouter) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** workspaces - { Twilio.Taskrouter.V1.WorkspaceListInstance } resource */
    /* protected */ var _workspaces: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceListInstance */ Any
      ] = js.native
    
    /** Getter for workspaces resource */
    def workspaces: Any = js.native
  }
}
