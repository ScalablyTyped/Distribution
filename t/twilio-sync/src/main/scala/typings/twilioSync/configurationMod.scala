package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  @js.native
  /**
    * @param {Object} options
    */
  class Configuration () extends js.Object {
    def this(options: js.Any) = this()
    val backoffConfig: js.Any = js.native
    val documentsUri: String = js.native
    val insightsUri: String = js.native
    val listsUri: String = js.native
    val mapsUri: String = js.native
    val sessionStorageEnabled: Boolean = js.native
    var settings: js.Any = js.native
    val streamsUri: String = js.native
    val subscriptionsUri: String = js.native
  }
  
}

