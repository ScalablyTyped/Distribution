package typings.ydnDb.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbOperator extends js.Object {
  def add(store_name: String, value: js.Any): Request = js.native
  def add(store_name: String, value: js.Any, key: js.Any): Request = js.native
  def clear(store_name: String): Request = js.native
  def clear(store_name: String, key_or_key_range: js.Any): Request = js.native
  def clear(store_names: js.Array[String]): Request = js.native
  def count(store_name: String): Request = js.native
  def count(store_name: String, index_name: String, key_range: js.Any): Request = js.native
  def count(store_name: String, key_range: js.Any): Request = js.native
  def count(store_names: js.Array[String]): Request = js.native
  def executeSql(sql: String): Request = js.native
  def executeSql(sql: String, params: js.Array[_]): Request = js.native
  def from(store_name: String): Query = js.native
  def from(store_name: String, op: Op, value: js.Any): Query = js.native
  def from(store_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): Query = js.native
  def get(store_name: String, key: js.Any): Request = js.native
  def keys(iter: Iterator): Request = js.native
  def keys(iter: Iterator, limit: Double): Request = js.native
  def keys(store_name: String): Request = js.native
  def keys(store_name: String, index_name: String): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.UndefOr[scala.Nothing], limit: Double): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: Double
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.Object): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: Double
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.Object, limit: Double): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.Object, limit: Double, offset: Double): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double
  ): Request = js.native
  def keys(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.UndefOr[scala.Nothing], limit: Double): Request = js.native
  def keys(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.UndefOr[scala.Nothing], limit: Double, offset: Double): Request = js.native
  def keys(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.Object): Request = js.native
  def keys(
    store_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: js.UndefOr[scala.Nothing], offset: Double): Request = js.native
  def keys(
    store_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double): Request = js.native
  def keys(
    store_name: String,
    key_range: js.Object,
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double, offset: Double): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double, offset: Double, reverse: Boolean): Request = js.native
  def keys(store_name: String, limit: Boolean): Request = js.native
  def keys(store_name: String, limit: Boolean, offset: Double): Request = js.native
  def open(next_callback: js.Function1[/* cursor */ ICursor, _], iterator: Iterator, mode: TransactionMode): Request = js.native
  def put(store_name: String, value: js.Any): Request = js.native
  def put(store_name: String, value: js.Any, key: js.Any): Request = js.native
  def put(store_name: String, value: js.Array[_]): Request = js.native
  def put(store_name: String, value: js.Array[_], key: js.Array[_]): Request = js.native
  def remove(store_name: String, id_or_key_range: js.Any): Request = js.native
  def remove(store_name: String, index_name: String, id_or_key_range: js.Any): Request = js.native
  def scan(
    solver: js.Function2[/* keys */ js.Array[_], /* values */ js.Array[_], _],
    iterators: js.Array[Iterator]
  ): Request = js.native
  def values(): Request = js.native
  def values(iter: Iterator): Request = js.native
  def values(iter: Iterator, limit: Double): Request = js.native
  def values(keys: js.Array[_]): Request = js.native
  def values(store_name: String): Request = js.native
  def values(store_name: String, ids: js.Array[_]): Request = js.native
  def values(store_name: String, index_name: String): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.UndefOr[scala.Nothing], limit: Double): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: Double
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.Object): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: Double
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.Object, limit: Double): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.Object, limit: Double, offset: Double): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double
  ): Request = js.native
  def values(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.UndefOr[scala.Nothing], limit: Double): Request = js.native
  def values(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.UndefOr[scala.Nothing], limit: Double, offset: Double): Request = js.native
  def values(
    store_name: String,
    key_range: js.UndefOr[scala.Nothing],
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.Object): Request = js.native
  def values(
    store_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: js.UndefOr[scala.Nothing], offset: Double): Request = js.native
  def values(
    store_name: String,
    key_range: js.Object,
    limit: js.UndefOr[scala.Nothing],
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double): Request = js.native
  def values(
    store_name: String,
    key_range: js.Object,
    limit: Double,
    offset: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double, offset: Double): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double, offset: Double, reverse: Boolean): Request = js.native
}

