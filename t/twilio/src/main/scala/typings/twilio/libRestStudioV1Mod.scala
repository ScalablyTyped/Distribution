package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioV1Mod {
  
  @JSImport("twilio/lib/rest/studio/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Studio
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestStudioMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val flows: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowListInstance */ Any = js.native
  }
}
