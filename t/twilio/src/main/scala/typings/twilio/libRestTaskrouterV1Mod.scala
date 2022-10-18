package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTaskrouterV1Mod {
  
  @JSImport("twilio/lib/rest/taskrouter/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Taskrouter
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestTaskrouterMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val workspaces: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WorkspaceListInstance */ Any = js.native
  }
}
