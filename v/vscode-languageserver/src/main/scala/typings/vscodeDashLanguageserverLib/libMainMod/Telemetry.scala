package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Telemetry extends Remote {
  /**
       * Log the given data to telemetry.
       *
       * @param data The data to log. Must be a JSON serializable object.
       */
  def logEvent(data: js.Any): scala.Unit
}

