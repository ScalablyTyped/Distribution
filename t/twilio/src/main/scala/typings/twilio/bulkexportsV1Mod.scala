package typings.twilio

import typings.twilio.exportConfigurationMod.ExportConfigurationContext
import typings.twilio.exportConfigurationMod.ExportConfigurationListInstance
import typings.twilio.exportMod.ExportContext
import typings.twilio.exportMod.ExportListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulkexportsV1Mod {
  
  @JSImport("twilio/lib/rest/bulkexports/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Bulkexports
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.bulkexportsMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
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
  }
}
