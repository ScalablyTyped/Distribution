package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMicrovisorV1Mod {
  
  @JSImport("twilio/lib/rest/microvisor/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Microvisor
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestMicrovisorMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val apps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppListInstance */ Any = js.native
    
    val devices: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeviceListInstance */ Any = js.native
  }
}
