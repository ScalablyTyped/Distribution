package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error from a web account provider. */
@JSGlobal("Windows.Security.Authentication.Web.Core.WebProviderError")
@js.native
class WebProviderError protected () extends js.Object {
  /**
                           * Initializes a new instance of the WebProviderError class.
                           * @param errorCode The error code.
                           * @param errorMessage The error message.
                           */
  def this(errorCode: scala.Double, errorMessage: java.lang.String) = this()
  /** Gets the error code. */
  var errorCode: scala.Double = js.native
  /** Gets the error message. */
  var errorMessage: java.lang.String = js.native
  /** Gets the error properties. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, java.lang.String] = js.native
}

