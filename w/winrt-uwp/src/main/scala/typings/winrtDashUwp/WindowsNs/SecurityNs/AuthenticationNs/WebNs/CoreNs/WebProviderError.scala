package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.WebNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
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
  def this(errorCode: Double, errorMessage: String) = this()
  /** Gets the error code. */
  var errorCode: Double = js.native
  /** Gets the error message. */
  var errorMessage: String = js.native
  /** Gets the error properties. */
  var properties: IMap[String, String] = js.native
}

