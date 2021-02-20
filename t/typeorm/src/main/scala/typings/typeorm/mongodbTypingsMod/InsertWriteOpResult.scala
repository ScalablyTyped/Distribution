package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.Ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertWriteOpResult extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.Any = js.native
  
  /**
    * The total amount of documents inserted.
    */
  var insertedCount: scala.Double = js.native
  
  /**
    * All the generated _id's for the inserted documents.
    */
  var insertedIds: js.Array[ObjectID] = js.native
  
  /**
    * All the documents inserted using insertOne/insertMany/replaceOne.
    * Documents contain the _id field if forceServerObjectId == false for insertOne/insertMany.
    */
  var ops: js.Array[_] = js.native
  
  /**
    * The raw command result object returned from MongoDB (content might vary by server version).
    * @param ok Is 1 if the command executed correctly.
    * @param n The total count of documents inserted.
    */
  var result: Ok = js.native
}
object InsertWriteOpResult {
  
  @scala.inline
  def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: js.Array[ObjectID],
    ops: js.Array[_],
    result: Ok
  ): InsertWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedIds = insertedIds.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertWriteOpResult]
  }
  
  @scala.inline
  implicit class InsertWriteOpResultMutableBuilder[Self <: InsertWriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIds(value: js.Array[ObjectID]): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIdsVarargs(value: ObjectID*): Self = StObject.set(x, "insertedIds", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: js.Array[_]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: js.Any*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: Ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
