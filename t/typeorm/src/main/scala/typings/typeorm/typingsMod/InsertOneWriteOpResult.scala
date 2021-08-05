package typings.typeorm.typingsMod

import typings.typeorm.anon.Ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOneWriteOpResult extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.Any
  
  /**
    * The total amount of documents inserted.
    */
  var insertedCount: scala.Double
  
  /**
    * The driver generated ObjectId for the insert operation.
    */
  var insertedId: ObjectID
  
  /**
    * All the documents inserted using insertOne/insertMany/replaceOne.
    * Documents contain the _id field if forceServerObjectId == false for insertOne/insertMany.
    */
  var ops: js.Array[js.Any]
  
  /**
    * The raw command result object returned from MongoDB (content might vary by server version).
    * @param ok Is 1 if the command executed correctly.
    * @param n The total count of documents inserted.
    */
  var result: Ok
}
object InsertOneWriteOpResult {
  
  inline def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: ObjectID,
    ops: js.Array[js.Any],
    result: Ok
  ): InsertOneWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneWriteOpResult]
  }
  
  extension [Self <: InsertOneWriteOpResult](x: Self) {
    
    inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedId(value: ObjectID): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
    
    inline def setOps(value: js.Array[js.Any]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsVarargs(value: js.Any*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    inline def setResult(value: Ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
