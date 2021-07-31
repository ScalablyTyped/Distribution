package typings.waterline.mod

import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model
  extends StObject
     with ModelInstance {
  
  def count(criteria: js.Any): WaterlinePromise[Double] = js.native
  def count(criteria: js.Array[js.Any]): WaterlinePromise[Double] = js.native
  
  def create(params: js.Any): CRUDBuilder[js.Any] = js.native
  def create(params: js.Any, cb: Callback[js.Any]): CRUDBuilder[js.Any] = js.native
  def create(params: js.Array[js.Any]): CRUDBuilder[js.Array[js.Any]] = js.native
  def create(params: js.Array[js.Any], cb: Callback[js.Any]): CRUDBuilder[js.Array[js.Any]] = js.native
  
  def createEach(params: js.Array[js.Any]): CRUDBuilder[js.Array[js.Any]] = js.native
  def createEach(params: js.Array[js.Any], cb: Callback[js.Any]): CRUDBuilder[js.Array[js.Any]] = js.native
  
  def destroy(criteria: js.Any): CRUDBuilder[js.Array[js.Any]] = js.native
  def destroy(criteria: js.Any, cb: Callback[js.Any]): CRUDBuilder[js.Array[js.Any]] = js.native
  def destroy(criteria: js.Array[js.Any]): CRUDBuilder[js.Array[js.Any]] = js.native
  def destroy(criteria: js.Array[js.Any], cb: Callback[js.Array[js.Any]]): CRUDBuilder[js.Array[js.Any]] = js.native
  
  def destroyOne(criteria: js.Any): CRUDBuilder[js.Any] = js.native
  def destroyOne(criteria: js.Any, cb: Callback[js.Any]): CRUDBuilder[js.Any] = js.native
  
  def find(): QueryBuilder[js.Array[js.Any]] = js.native
  def find(criteria: js.Any): QueryBuilder[js.Array[js.Any]] = js.native
  def find(criteria: js.Any, cb: Callback[js.Array[js.Any]]): QueryBuilder[js.Array[js.Any]] = js.native
  def find(criteria: Unit, cb: Callback[js.Array[js.Any]]): QueryBuilder[js.Array[js.Any]] = js.native
  
  def findOne(): QueryBuilder[js.Any] = js.native
  def findOne(criteria: js.Any): QueryBuilder[js.Any] = js.native
  def findOne(criteria: js.Any, cb: Callback[js.Any]): QueryBuilder[js.Any] = js.native
  def findOne(criteria: Unit, cb: Callback[js.Any]): QueryBuilder[js.Any] = js.native
  
  def findOrCreate(): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: js.Any): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: js.Any, values: js.Any, cb: Callback[js.Any]): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: js.Any, values: Unit, cb: Callback[js.Any]): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: Unit, values: js.Any): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: Unit, values: js.Any, cb: Callback[js.Any]): QueryBuilder[js.Any] = js.native
  def findOrCreate(criteria: Unit, values: Unit, cb: Callback[js.Any]): QueryBuilder[js.Any] = js.native
  
  def native(cb: js.Function2[/* err */ Error, /* collection */ js.Any, Unit]): Unit = js.native
  
  def query(sqlQuery: String, cb: Callback[js.Any]): Unit = js.native
  def query(sqlQuery: String, data: js.Any, cb: Callback[js.Any]): Unit = js.native
  
  def stream(criteria: js.Any, writeEnd: js.Any): WritableStream | Error = js.native
  
  def update(criteria: js.Any): UpdateBuilder[js.Any] = js.native
  def update(criteria: js.Any, changes: js.Any): UpdateBuilder[js.Any] = js.native
  def update(criteria: js.Any, changes: js.Any, cb: Callback[js.Any]): UpdateBuilder[js.Any] = js.native
  def update(criteria: js.Any, changes: js.Array[js.Any]): UpdateBuilder[js.Array[js.Any]] = js.native
  def update(criteria: js.Any, changes: js.Array[js.Any], cb: Callback[js.Array[js.Any]]): UpdateBuilder[js.Array[js.Any]] = js.native
  def update(criteria: js.Any, changes: Unit, cb: Callback[js.Any | js.Array[js.Any]]): UpdateBuilder[js.Any] = js.native
  
  def updateOne(criteria: js.Any): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: js.Any): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: js.Any, cb: Unit, meta: js.Any): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: js.Any, cb: Callback[js.Any]): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: js.Any, cb: Callback[js.Any], meta: js.Any): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: Unit, cb: Unit, meta: js.Any): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: Unit, cb: Callback[js.Any]): UpdateBuilder[js.Any] = js.native
  def updateOne(criteria: js.Any, changes: Unit, cb: Callback[js.Any], meta: js.Any): UpdateBuilder[js.Any] = js.native
}
