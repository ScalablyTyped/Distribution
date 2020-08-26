package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest")
@js.native
class PlayReadySecureStopServiceRequest protected ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySecureStopServiceRequest {
  /**
    * Initializes a new instance of the PlayReadySecureStopServiceRequest class to include all secure stop sessions.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(publisherCertBytes: js.Array[Double]) = this()
  /**
    * Initializes a new instance of the PlayReadySecureStopServiceRequest class for the specified secure stop session.
    * @param sessionID The secure stop session identifier.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(sessionID: String, publisherCertBytes: js.Array[Double]) = this()
}

