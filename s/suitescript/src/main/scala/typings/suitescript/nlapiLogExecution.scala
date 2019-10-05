package typings.suitescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("nlapiLogExecution")
@js.native
object nlapiLogExecution extends js.Object {
  /**
    * Create an entry in the script execution log (note that execution log entries are automatically purged after 30 days).
    *
    * @param {string} type    log type: debug|audit|error|emergency
    * @param {string} title log title (up to 90 characters supported)
    * @param {string} [details] log details (up to 3000 characters supported)
    * @return {void}
    *
    * @since 2008.1
    * @param type
    * @param title
    * @param details?
    * @return
    */
  def apply(`type`: String, title: String): js.Any = js.native
  def apply(`type`: String, title: String, details: String): js.Any = js.native
}

