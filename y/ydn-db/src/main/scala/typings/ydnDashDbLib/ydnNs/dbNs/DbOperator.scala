package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.DbOperator")
@js.native
class DbOperator () extends js.Object {
  def add(store_name: java.lang.String, value: js.Any): Request = js.native
  def add(store_name: java.lang.String, value: js.Any, key: js.Any): Request = js.native
  def clear(store_name: java.lang.String): Request = js.native
  def clear(store_name: java.lang.String, key_or_key_range: js.Any): Request = js.native
  def clear(store_names: js.Array[java.lang.String]): Request = js.native
  def count(store_name: java.lang.String): Request = js.native
  def count(store_name: java.lang.String, index_name: java.lang.String, key_range: js.Any): Request = js.native
  def count(store_name: java.lang.String, key_range: js.Any): Request = js.native
  def count(store_names: js.Array[java.lang.String]): Request = js.native
  def executeSql(sql: java.lang.String): Request = js.native
  def executeSql(sql: java.lang.String, params: js.Array[_]): Request = js.native
  def from(store_name: java.lang.String): Query = js.native
  def from(store_name: java.lang.String, op: Op, value: js.Any): Query = js.native
  def from(store_name: java.lang.String, op: Op, value: js.Any, op2: Op, value2: js.Any): Query = js.native
  def get(store_name: java.lang.String, key: js.Any): Request = js.native
  def keys(iter: Iterator): Request = js.native
  def keys(iter: Iterator, limit: scala.Double): Request = js.native
  def keys(store_name: java.lang.String): Request = js.native
  def keys(store_name: java.lang.String, index_name: java.lang.String): Request = js.native
  def keys(store_name: java.lang.String, index_name: java.lang.String, key_range: js.Object): Request = js.native
  def keys(
    store_name: java.lang.String,
    index_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double
  ): Request = js.native
  def keys(
    store_name: java.lang.String,
    index_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double,
    offset: scala.Double
  ): Request = js.native
  def keys(
    store_name: java.lang.String,
    index_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double,
    offset: scala.Double,
    reverse: scala.Boolean
  ): Request = js.native
  def keys(store_name: java.lang.String, key_range: js.Object): Request = js.native
  def keys(store_name: java.lang.String, key_range: js.Object, limit: scala.Double): Request = js.native
  def keys(store_name: java.lang.String, key_range: js.Object, limit: scala.Double, offset: scala.Double): Request = js.native
  def keys(
    store_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double,
    offset: scala.Double,
    reverse: scala.Boolean
  ): Request = js.native
  def keys(store_name: java.lang.String, limit: scala.Boolean): Request = js.native
  def keys(store_name: java.lang.String, limit: scala.Boolean, offset: scala.Double): Request = js.native
  def open(next_callback: js.Function1[/* cursor */ ICursor, _], iterator: Iterator, mode: TransactionMode): Request = js.native
  def put(store_name: java.lang.String, value: js.Any): Request = js.native
  def put(store_name: java.lang.String, value: js.Any, key: js.Any): Request = js.native
  def put(store_name: java.lang.String, value: js.Array[_]): Request = js.native
  def put(store_name: java.lang.String, value: js.Array[_], key: js.Array[_]): Request = js.native
  def remove(store_name: java.lang.String, id_or_key_range: js.Any): Request = js.native
  def remove(store_name: java.lang.String, index_name: java.lang.String, id_or_key_range: js.Any): Request = js.native
  def scan(
    solver: js.Function2[/* keys */ js.Array[_], /* values */ js.Array[_], _],
    iterators: js.Array[Iterator]
  ): Request = js.native
  def values(): Request = js.native
  def values(iter: Iterator): Request = js.native
  def values(iter: Iterator, limit: scala.Double): Request = js.native
  def values(keys: js.Array[_]): Request = js.native
  def values(store_name: java.lang.String): Request = js.native
  def values(store_name: java.lang.String, ids: js.Array[_]): Request = js.native
  def values(store_name: java.lang.String, index_name: java.lang.String): Request = js.native
  def values(store_name: java.lang.String, index_name: java.lang.String, key_range: js.Object): Request = js.native
  def values(
    store_name: java.lang.String,
    index_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double
  ): Request = js.native
  def values(
    store_name: java.lang.String,
    index_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double,
    offset: scala.Double
  ): Request = js.native
  def values(
    store_name: java.lang.String,
    index_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double,
    offset: scala.Double,
    reverse: scala.Boolean
  ): Request = js.native
  def values(store_name: java.lang.String, key_range: js.Object): Request = js.native
  def values(store_name: java.lang.String, key_range: js.Object, limit: scala.Double): Request = js.native
  def values(store_name: java.lang.String, key_range: js.Object, limit: scala.Double, offset: scala.Double): Request = js.native
  def values(
    store_name: java.lang.String,
    key_range: js.Object,
    limit: scala.Double,
    offset: scala.Double,
    reverse: scala.Boolean
  ): Request = js.native
}

