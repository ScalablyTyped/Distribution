package typings.twilio

import typings.twilio.libRestBulkexportsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestBulkexportsV1Mod {
  
  @JSImport("twilio/lib/rest/bulkexports/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Bulkexports
      *
      * @param domain - The Twilio (Twilio.Bulkexports) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** exportConfiguration - { Twilio.Bulkexports.V1.ExportConfigurationListInstance } resource */
    /* protected */ var _exportConfiguration: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExportConfigurationListInstance */ Any
      ] = js.native
    
    /** exports - { Twilio.Bulkexports.V1.ExportListInstance } resource */
    /* protected */ var _exports: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExportListInstance */ Any
      ] = js.native
    
    /** Getter for exportConfiguration resource */
    def exportConfiguration: Any = js.native
    
    /** Getter for exports resource */
    def exports: Any = js.native
  }
}
