package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the result, in the form of a response message, from the PlayReady-ND messenger. */
trait INDSendResult extends js.Object {
  /** Gets the response message from a messenger. */
  var response: Double
}

object INDSendResult {
  @scala.inline
  def apply(response: Double): INDSendResult = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INDSendResult]
  }
}

