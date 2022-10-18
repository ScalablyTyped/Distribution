package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestBulkexportsV1Mod {
  
  @JSImport("twilio/lib/rest/bulkexports/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Bulkexports
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestBulkexportsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val exportConfiguration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExportConfigurationListInstance */ Any = js.native
    
    val exports: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExportListInstance */ Any = js.native
  }
}
