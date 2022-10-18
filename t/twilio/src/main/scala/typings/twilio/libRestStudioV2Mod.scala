package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioV2Mod {
  
  @JSImport("twilio/lib/rest/studio/V2", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V2 {
    /**
      * Initialize the V2 version of Studio
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestStudioMod.^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.^ {
    
    val flowValidate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowValidateListInstance */ Any = js.native
    
    val flows: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlowListInstance */ Any = js.native
  }
}
