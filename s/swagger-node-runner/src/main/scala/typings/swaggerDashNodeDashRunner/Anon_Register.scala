package typings.swaggerDashNodeDashRunner

import typings.hapi.hapiMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Register extends js.Object {
  /**
    * Hapi plugin `register` implementation.
    * @see {@link https://hapijs.com/tutorials/plugins|Hapi Docs}
    */
  @JSName("register")
  var register_Original: Anon_Attributes = js.native
  /**
    * Registers Plugin with `onRequest` and traces `request-error` callbacks
    *             *
    * @param  server - Hapi server
    * @param  options - options for plugin (not used in the moment)
    * @param  next - callback called when register is done
    */
  /**
    * Hapi plugin `register` implementation.
    * @see {@link https://hapijs.com/tutorials/plugins|Hapi Docs}
    */
  def register(server: Server, options: js.Any, next: js.Function0[Unit]): Unit = js.native
}

