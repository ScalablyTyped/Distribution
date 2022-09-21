package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbOperator extends StObject {
  
  def add(store_name: String, value: Any): Request = js.native
  def add(store_name: String, value: Any, key: Any): Request = js.native
  
  def clear(store_name: String): Request = js.native
  def clear(store_name: String, key_or_key_range: Any): Request = js.native
  def clear(store_names: js.Array[String]): Request = js.native
  
  def count(store_name: String): Request = js.native
  def count(store_name: String, index_name: String, key_range: Any): Request = js.native
  def count(store_name: String, key_range: Any): Request = js.native
  def count(store_names: js.Array[String]): Request = js.native
  
  def executeSql(sql: String): Request = js.native
  def executeSql(sql: String, params: js.Array[Any]): Request = js.native
  
  def from(store_name: String): Query = js.native
  def from(store_name: String, op: Op, value: Any): Query = js.native
  def from(store_name: String, op: Op, value: Any, op2: Op, value2: Any): Query = js.native
  
  def get(store_name: String, key: Any): Request = js.native
  
  def keys(iter: Iterator): Request = js.native
  def keys(iter: Iterator, limit: Double): Request = js.native
  def keys(store_name: String): Request = js.native
  def keys(store_name: String, index_name: String): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.Object): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.Object, limit: Double): Request = js.native
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
    index_name: String,
    key_range: js.Object,
    limit: Double,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: js.Object, limit: Unit, offset: Double): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Unit,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Unit,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: Unit, limit: Double): Request = js.native
  def keys(store_name: String, index_name: String, key_range: Unit, limit: Double, offset: Double): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Double,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, index_name: String, key_range: Unit, limit: Unit, offset: Double): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Unit,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def keys(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Unit,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def keys(store_name: String, key_range: js.Object): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double, offset: Double): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double, offset: Double, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Double, offset: Unit, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Unit, offset: Double): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Unit, offset: Double, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: js.Object, limit: Unit, offset: Unit, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Double): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Double, offset: Double): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Double, offset: Double, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Double, offset: Unit, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Unit, offset: Double): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Unit, offset: Double, reverse: Boolean): Request = js.native
  def keys(store_name: String, key_range: Unit, limit: Unit, offset: Unit, reverse: Boolean): Request = js.native
  def keys(store_name: String, limit: Boolean): Request = js.native
  def keys(store_name: String, limit: Boolean, offset: Double): Request = js.native
  
  def open(next_callback: js.Function1[/* cursor */ ICursor, Any], iterator: Iterator, mode: TransactionMode): Request = js.native
  
  def put(store_name: String, value: js.Array[Any]): Request = js.native
  def put(store_name: String, value: js.Array[Any], key: js.Array[Any]): Request = js.native
  def put(store_name: String, value: Any): Request = js.native
  def put(store_name: String, value: Any, key: Any): Request = js.native
  
  def remove(store_name: String, id_or_key_range: Any): Request = js.native
  def remove(store_name: String, index_name: String, id_or_key_range: Any): Request = js.native
  
  def scan(
    solver: js.Function2[/* keys */ js.Array[Any], /* values */ js.Array[Any], Any],
    iterators: js.Array[Iterator]
  ): Request = js.native
  
  def values(): Request = js.native
  def values(iter: Iterator): Request = js.native
  def values(iter: Iterator, limit: Double): Request = js.native
  def values(keys: js.Array[Any]): Request = js.native
  def values(store_name: String): Request = js.native
  def values(store_name: String, ids: js.Array[Any]): Request = js.native
  def values(store_name: String, index_name: String): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.Object): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.Object, limit: Double): Request = js.native
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
    index_name: String,
    key_range: js.Object,
    limit: Double,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: js.Object, limit: Unit, offset: Double): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Unit,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: js.Object,
    limit: Unit,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: Unit, limit: Double): Request = js.native
  def values(store_name: String, index_name: String, key_range: Unit, limit: Double, offset: Double): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Double,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Double,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, index_name: String, key_range: Unit, limit: Unit, offset: Double): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Unit,
    offset: Double,
    reverse: Boolean
  ): Request = js.native
  def values(
    store_name: String,
    index_name: String,
    key_range: Unit,
    limit: Unit,
    offset: Unit,
    reverse: Boolean
  ): Request = js.native
  def values(store_name: String, key_range: js.Object): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double, offset: Double): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double, offset: Double, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Double, offset: Unit, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Unit, offset: Double): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Unit, offset: Double, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: js.Object, limit: Unit, offset: Unit, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Double): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Double, offset: Double): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Double, offset: Double, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Double, offset: Unit, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Unit, offset: Double): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Unit, offset: Double, reverse: Boolean): Request = js.native
  def values(store_name: String, key_range: Unit, limit: Unit, offset: Unit, reverse: Boolean): Request = js.native
}
