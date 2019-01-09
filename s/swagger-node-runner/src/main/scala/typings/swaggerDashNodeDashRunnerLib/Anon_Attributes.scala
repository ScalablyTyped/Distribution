package typings
package swaggerDashNodeDashRunnerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attributes extends js.Object {
  /** Object attached to `register` function to provide hapi with some additional information about the plugin */
  var attributes: Anon_Name = js.native
  /**
    * Registers Plugin with `onRequest` and traces `request-error` callbacks
    *             *
    * @param  server - Hapi server
    * @param  options - options for plugin (not used in the moment)
    * @param  next - callback called when register is done
    */
  def apply(server: hapiLib.hapiMod.Server, options: js.Any, next: js.Function0[scala.Unit]): scala.Unit = js.native
}

