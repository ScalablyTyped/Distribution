package typings.ydnDb.ydn.db

import typings.std.Error
import typings.ydnDb.DatabaseSchemaJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends DbOperator {
  def addEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  def addEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ js.Any, Unit], capture: Boolean): js.Any = js.native
  def addEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  def addEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, Unit], capture: Boolean): js.Any = js.native
  def branch(
    thread: Policy,
    isSerial: Boolean,
    scope: js.Array[String],
    mode: TransactionMode,
    maxRequest: Double
  ): DbOperator = js.native
  def close(): js.Any = js.native
  def getName(callback: js.Any): String = js.native
  def getSchema(callback: js.Any): DatabaseSchemaJson = js.native
  def getType(): String = js.native
  def onReady(): js.Any = js.native
  def onReady(Error: js.Any): js.Any = js.native
  def removeEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  def removeEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ js.Any, Unit], capture: Boolean): js.Any = js.native
  def removeEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  def removeEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, Unit], capture: Boolean): js.Any = js.native
  def run(
    callback: js.Function1[/* iStorage */ this.type, Unit],
    store_names: js.Array[String],
    mode: TransactionMode
  ): Request = js.native
  def search(catalog_name: String, query: String): Request = js.native
  def search(catalog_name: String, query: String, limit: Double): Request = js.native
  def search(catalog_name: String, query: String, limit: Double, threshold: Double): Request = js.native
  def setName(name: String): js.Any = js.native
  def transaction(
    callback: js.Function1[/* tx */ js.Any, Unit],
    store_names: js.Array[String],
    mode: TransactionMode,
    completed_handler: js.Function2[/* type */ String, /* e */ js.UndefOr[Error], Unit]
  ): js.Any = js.native
}

