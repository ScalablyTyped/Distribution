package typings.twilio

import typings.twilio.exportConfigurationMod.ExportConfigurationContext
import typings.twilio.exportConfigurationMod.ExportConfigurationListInstance
import typings.twilio.exportMod.ExportContext
import typings.twilio.exportMod.ExportListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulkexportsMod {
  
  @JSImport("twilio/lib/rest/Bulkexports", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Bulkexports {
    /**
      * Initialize bulkexports domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Bulkexports
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def exportConfiguration(sid: String): ExportConfigurationContext = js.native
    @JSName("exportConfiguration")
    val exportConfiguration_Original: ExportConfigurationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def exports(sid: String): ExportContext = js.native
    @JSName("exports")
    val exports_Original: ExportListInstance = js.native
    
    val v1: typings.twilio.bulkexportsV1Mod.^ = js.native
  }
}
