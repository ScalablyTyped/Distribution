package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends ModelInstance {
  def count(criteria: js.Any): WaterlinePromise[scala.Double] = js.native
  def count(criteria: js.Array[_]): WaterlinePromise[scala.Double] = js.native
  def create(params: js.Any): WaterlinePromise[_] = js.native
  def create(params: js.Any, cb: Callback[_]): WaterlinePromise[_] = js.native
  def create(params: js.Array[_]): WaterlinePromise[js.Array[_]] = js.native
  def create(params: js.Array[_], cb: Callback[_]): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Any): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Any, cb: Callback[_]): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Array[_]): WaterlinePromise[js.Array[_]] = js.native
  def destroy(criteria: js.Array[_], cb: Callback[js.Array[_]]): WaterlinePromise[js.Array[_]] = js.native
  def find(): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.Any): QueryBuilder[js.Array[_]] = js.native
  def find(criteria: js.Any, cb: Callback[js.Array[_]]): QueryBuilder[js.Array[_]] = js.native
  def findOne(): QueryBuilder[_] = js.native
  def findOne(criteria: js.Any): QueryBuilder[_] = js.native
  def findOne(criteria: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  def findOrCreate(): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any): QueryBuilder[_] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any, cb: Callback[_]): QueryBuilder[_] = js.native
  def native(cb: js.Function2[/* err */ nodeLib.Error, /* collection */ js.Any, scala.Unit]): scala.Unit = js.native
  def query(sqlQuery: java.lang.String, cb: Callback[_]): scala.Unit = js.native
  def query(sqlQuery: java.lang.String, data: js.Any, cb: Callback[_]): scala.Unit = js.native
  def stream(criteria: js.Any, writeEnd: js.Any): nodeLib.NodeJSNs.WritableStream | nodeLib.Error = js.native
  def update(criteria: js.Any, changes: js.Any): WaterlinePromise[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Any, cb: Callback[_]): WaterlinePromise[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Array[_]): WaterlinePromise[js.Array[_]] = js.native
  def update(criteria: js.Any, changes: js.Array[_], cb: Callback[js.Array[_]]): WaterlinePromise[js.Array[_]] = js.native
}

