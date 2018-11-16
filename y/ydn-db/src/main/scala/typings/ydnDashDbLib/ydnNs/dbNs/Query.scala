package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.Query")
@js.native
class Query () extends js.Object {
  def count(): Request = js.native
  def list(): Request = js.native
  def list(limit: scala.Double): Request = js.native
  def open(
    callback: js.Function1[/* ICursor */ js.Any, scala.Unit],
    Iterator: js.Any,
    TransactionMode: js.Any
  ): Request = js.native
  def order(field_name: java.lang.String): Query = js.native
  def order(field_name: java.lang.String, descending: scala.Boolean): Query = js.native
  def order(field_names: js.Array[java.lang.String]): Query = js.native
  def order(field_names: js.Array[java.lang.String], descending: scala.Boolean): Query = js.native
  def patch(Object: js.Any): Request = js.native
  def patch(field_name: java.lang.String, value: js.Any): Request = js.native
  def patch(field_names: js.Array[java.lang.String], value: js.Array[_]): Request = js.native
  def reverse(): Query = js.native
  def where(field_name: java.lang.String, op: Op, value: js.Any): js.Any = js.native
  def where(field_name: java.lang.String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
}

