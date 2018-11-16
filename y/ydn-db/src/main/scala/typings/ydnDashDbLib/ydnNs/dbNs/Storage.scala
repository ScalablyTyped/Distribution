package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.Storage")
@js.native
class Storage () extends DbOperator {
  def this(db_name: java.lang.String) = this()
  def this(db_name: java.lang.String, schema: ydnDashDbLib.DatabaseSchemaJson) = this()
  def this(db_name: java.lang.String, schema: ydnDashDbLib.DatabaseSchemaJson, options: ydnDashDbLib.StorageOptions) = this()
  def addEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ js.Any, scala.Unit]): js.Any = js.native
  def addEventListener(
    `type`: js.Array[EventType],
    handler: js.Function1[/* event */ js.Any, scala.Unit],
    capture: scala.Boolean
  ): js.Any = js.native
  def addEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, scala.Unit]): js.Any = js.native
  def addEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, scala.Unit], capture: scala.Boolean): js.Any = js.native
  def branch(
    thread: Policy,
    isSerial: scala.Boolean,
    scope: js.Array[java.lang.String],
    mode: TransactionMode,
    maxRequest: scala.Double
  ): DbOperator = js.native
  def close(): js.Any = js.native
  def getName(callback: js.Any): java.lang.String = js.native
  def getSchema(callback: js.Any): ydnDashDbLib.DatabaseSchemaJson = js.native
  def getType(): java.lang.String = js.native
  def onReady(): js.Any = js.native
  def onReady(Error: js.Any): js.Any = js.native
  def removeEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ js.Any, scala.Unit]): js.Any = js.native
  def removeEventListener(
    `type`: js.Array[EventType],
    handler: js.Function1[/* event */ js.Any, scala.Unit],
    capture: scala.Boolean
  ): js.Any = js.native
  def removeEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, scala.Unit]): js.Any = js.native
  def removeEventListener(`type`: EventType, handler: js.Function1[/* event */ js.Any, scala.Unit], capture: scala.Boolean): js.Any = js.native
  def run(
    callback: js.Function1[/* iStorage */ this.type, scala.Unit],
    store_names: js.Array[java.lang.String],
    mode: TransactionMode
  ): Request = js.native
  def search(catalog_name: java.lang.String, query: java.lang.String): Request = js.native
  def search(catalog_name: java.lang.String, query: java.lang.String, limit: scala.Double): Request = js.native
  def search(
    catalog_name: java.lang.String,
    query: java.lang.String,
    limit: scala.Double,
    threshold: scala.Double
  ): Request = js.native
  def setName(name: java.lang.String): js.Any = js.native
  def transaction(
    callback: js.Function1[/* tx */ js.Any, scala.Unit],
    store_names: js.Array[java.lang.String],
    mode: TransactionMode,
    completed_handler: js.Function2[/* type */ java.lang.String, /* e */ js.UndefOr[stdLib.Error], scala.Unit]
  ): js.Any = js.native
}

