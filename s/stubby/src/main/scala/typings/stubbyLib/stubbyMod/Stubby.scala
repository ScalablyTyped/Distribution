package typings
package stubbyLib.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stubby", "Stubby")
@js.native
class Stubby () extends js.Object {
  var adminPortal: nodeLib.httpMod.Server = js.native
  var endpoints: Endpoints = js.native
  var stubsPortal: nodeLib.httpMod.Server = js.native
  var tlsPortal: nodeLib.tlsMod.Server = js.native
  /** Simulates a DELETE request to the admin portal, with the callback receiving the resultant data. */
  def delete(id: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  /** Simulates a GET request to the admin portal, with the callback receiving the resultant data. */
  def get(callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoints */ Endpoints, scala.Unit]): scala.Unit = js.native
  def get(
    id: java.lang.String,
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoint */ Endpoint, scala.Unit]
  ): scala.Unit = js.native
  /** Simulates a POST request to the admin portal, with the callback receiving the resultant data. */
  def post(
    data: Endpoint,
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoint */ Endpoint, scala.Unit]
  ): scala.Unit = js.native
  /** Simulates a PUT request to the admin portal, with the callback receiving the resultant data. */
  def put(
    id: java.lang.String,
    data: Endpoint,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  /** Starts stubby's stubs and admin portals. Executes `callback` afterward. */
  def start(): scala.Unit = js.native
  def start(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def start(options: StubbyOptions): scala.Unit = js.native
  def start(options: StubbyOptions, callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  /** Closes the connections and ports being used by stubby's stubs and admin portals. Executes callback afterward. */
  def stop(): scala.Unit = js.native
  def stop(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
}

