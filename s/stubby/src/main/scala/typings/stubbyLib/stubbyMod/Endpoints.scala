package typings
package stubbyLib.stubbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoints extends js.Object {
  def create(
    endpoint: js.Array[StubbyData],
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoint */ Endpoint, scala.Unit],
    datadir: java.lang.String
  ): scala.Unit = js.native
  def create(
    endpoint: StubbyData,
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoint */ Endpoint, scala.Unit],
    datadir: java.lang.String
  ): scala.Unit = js.native
  def delete(id: java.lang.String, callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def gather(
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoints */ js.Array[Endpoint], scala.Unit]
  ): scala.Unit = js.native
  def retrieve(
    id: java.lang.String,
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error], /* endpoint */ Endpoint, scala.Unit]
  ): scala.Unit = js.native
  def update(
    id: java.lang.String,
    data: StubbyData,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

