package typings.stubby.mod

import typings.node.httpMod.Server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stubby", "Stubby")
@js.native
class Stubby () extends js.Object {
  var adminPortal: Server = js.native
  var endpoints: Endpoints = js.native
  var stubsPortal: Server = js.native
  var tlsPortal: typings.node.tlsMod.Server = js.native
  /** Simulates a DELETE request to the admin portal, with the callback receiving the resultant data. */
  def delete(id: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  /** Simulates a GET request to the admin portal, with the callback receiving the resultant data. */
  def get(callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoints */ Endpoints, Unit]): Unit = js.native
  def get(id: String, callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
  /** Simulates a POST request to the admin portal, with the callback receiving the resultant data. */
  def post(data: Endpoint, callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
  /** Simulates a PUT request to the admin portal, with the callback receiving the resultant data. */
  def put(id: String, data: Endpoint, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  /** Starts stubby's stubs and admin portals. Executes `callback` afterward. */
  def start(): Unit = js.native
  def start(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def start(options: StubbyOptions): Unit = js.native
  def start(options: StubbyOptions, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  /** Closes the connections and ports being used by stubby's stubs and admin portals. Executes callback afterward. */
  def stop(): Unit = js.native
  def stop(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

