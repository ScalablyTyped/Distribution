package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the state of the DIAL app. */
@JSGlobal("Windows.Media.DialProtocol.DialAppStateDetails")
@js.native
abstract class DialAppStateDetails () extends js.Object {
  /** Gets the entire XML response that is provided by the app when state of the app was requested. */
  var fullXml: java.lang.String = js.native
  /** Gets the state of the application at the time the GetAppStateAsync was completed. */
  var state: DialAppState = js.native
}

