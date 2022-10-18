package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMicrovisorMod {
  
  @JSImport("twilio/lib/rest/Microvisor", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Microvisor {
    /**
      * Initialize microvisor domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Microvisor
    extends typings.twilio.libBaseDomainMod.^ {
    
    val apps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppListInstance */ Any = js.native
    
    val devices: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestMicrovisorV1Mod.^ = js.native
  }
}
