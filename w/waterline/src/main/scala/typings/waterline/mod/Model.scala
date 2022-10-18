package typings.waterline.mod

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model
  extends StObject
     with ModelInstance {
  
  def count(criteria: js.Array[Any]): WaterlinePromise[Double] = js.native
  def count(criteria: Any): WaterlinePromise[Double] = js.native
  
  def create(params: js.Array[Any]): CRUDBuilder[js.Array[Any]] = js.native
  def create(params: js.Array[Any], cb: Callback[Any]): CRUDBuilder[js.Array[Any]] = js.native
  def create(params: Any): CRUDBuilder[Any] = js.native
  def create(params: Any, cb: Callback[Any]): CRUDBuilder[Any] = js.native
  
  def createEach(params: js.Array[Any]): CRUDBuilder[js.Array[Any]] = js.native
  def createEach(params: js.Array[Any], cb: Callback[Any]): CRUDBuilder[js.Array[Any]] = js.native
  
  def destroy(criteria: js.Array[Any]): CRUDBuilder[js.Array[Any]] = js.native
  def destroy(criteria: js.Array[Any], cb: Callback[js.Array[Any]]): CRUDBuilder[js.Array[Any]] = js.native
  def destroy(criteria: Any): CRUDBuilder[js.Array[Any]] = js.native
  def destroy(criteria: Any, cb: Callback[Any]): CRUDBuilder[js.Array[Any]] = js.native
  
  def destroyOne(criteria: Any): CRUDBuilder[Any] = js.native
  def destroyOne(criteria: Any, cb: Callback[Any]): CRUDBuilder[Any] = js.native
  
  def find(): QueryBuilder[js.Array[Any]] = js.native
  def find(criteria: Any): QueryBuilder[js.Array[Any]] = js.native
  def find(criteria: Any, cb: Callback[js.Array[Any]]): QueryBuilder[js.Array[Any]] = js.native
  def find(criteria: Unit, cb: Callback[js.Array[Any]]): QueryBuilder[js.Array[Any]] = js.native
  
  def findOne(): QueryBuilder[Any] = js.native
  def findOne(criteria: Any): QueryBuilder[Any] = js.native
  def findOne(criteria: Any, cb: Callback[Any]): QueryBuilder[Any] = js.native
  def findOne(criteria: Unit, cb: Callback[Any]): QueryBuilder[Any] = js.native
  
  def findOrCreate(): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Any): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Any, values: Any): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Any, values: Any, cb: Callback[Any]): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Any, values: Unit, cb: Callback[Any]): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Unit, values: Any): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Unit, values: Any, cb: Callback[Any]): QueryBuilder[Any] = js.native
  def findOrCreate(criteria: Unit, values: Unit, cb: Callback[Any]): QueryBuilder[Any] = js.native
  
  def native(cb: js.Function2[/* err */ js.Error, /* collection */ Any, Unit]): Unit = js.native
  
  def query(sqlQuery: String, cb: Callback[Any]): Unit = js.native
  def query(sqlQuery: String, data: Any, cb: Callback[Any]): Unit = js.native
  
  def stream(criteria: Any, writeEnd: Any): WritableStream | js.Error = js.native
  
  def update(criteria: Any): UpdateBuilder[Any] = js.native
  def update(criteria: Any, changes: js.Array[Any]): UpdateBuilder[js.Array[Any]] = js.native
  def update(criteria: Any, changes: js.Array[Any], cb: Callback[js.Array[Any]]): UpdateBuilder[js.Array[Any]] = js.native
  def update(criteria: Any, changes: Any): UpdateBuilder[Any] = js.native
  def update(criteria: Any, changes: Any, cb: Callback[Any]): UpdateBuilder[Any] = js.native
  def update(criteria: Any, changes: Unit, cb: Callback[Any | js.Array[Any]]): UpdateBuilder[Any] = js.native
  
  def updateOne(criteria: Any): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Any): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Any, cb: Unit, meta: Any): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Any, cb: Callback[Any]): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Any, cb: Callback[Any], meta: Any): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Unit, cb: Unit, meta: Any): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Unit, cb: Callback[Any]): UpdateBuilder[Any] = js.native
  def updateOne(criteria: Any, changes: Unit, cb: Callback[Any], meta: Any): UpdateBuilder[Any] = js.native
}
