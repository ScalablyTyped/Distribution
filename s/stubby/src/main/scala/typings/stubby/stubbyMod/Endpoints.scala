package typings.stubby.stubbyMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def create(
    endpoint: js.Array[StubbyData],
    callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit],
    datadir: String
  ): Unit = js.native
  def create(
    endpoint: StubbyData,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit],
    datadir: String
  ): Unit = js.native
  def delete(id: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def gather(callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoints */ js.Array[Endpoint], Unit]): Unit = js.native
  def retrieve(id: String, callback: js.Function2[/* err */ js.UndefOr[Error], /* endpoint */ Endpoint, Unit]): Unit = js.native
  def update(id: String, data: StubbyData, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

