package typings.workboxPrecaching

import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPrecacheInstallReportPluginMod {
  
  /**
    * A plugin, designed to be used with PrecacheController, to determine the
    * of assets that were updated (or not updated) during the install event.
    *
    * @private
    */
  @JSImport("workbox-precaching/utils/PrecacheInstallReportPlugin", "PrecacheInstallReportPlugin")
  @js.native
  open class PrecacheInstallReportPlugin ()
    extends StObject
       with WorkboxPlugin {
    
    var notUpdatedURLs: js.Array[String] = js.native
    
    var updatedURLs: js.Array[String] = js.native
  }
}
