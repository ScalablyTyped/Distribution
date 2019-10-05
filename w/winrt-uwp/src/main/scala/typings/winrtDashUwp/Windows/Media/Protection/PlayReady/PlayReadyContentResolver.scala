package typings.winrtDashUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Receives multiple service request objects that are necessary to enable the playback ability for a given content header. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentResolver")
@js.native
abstract class PlayReadyContentResolver () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyContentResolver")
@js.native
object PlayReadyContentResolver extends js.Object {
  /**
    * Proactively initiates the service request chain for a given content header.
    * @param contentHeader Content header for the content the app wants to resolve all necessary service request operations.
    * @return The first service request operation required to resolve the content.
    */
  def serviceRequest(contentHeader: PlayReadyContentHeader): IPlayReadyServiceRequest = js.native
}

