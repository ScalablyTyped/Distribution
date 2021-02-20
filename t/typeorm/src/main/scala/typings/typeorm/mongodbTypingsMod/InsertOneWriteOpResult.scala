package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.Ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertOneWriteOpResult extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.Any = js.native
  
  /**
    * The total amount of documents inserted.
    */
  var insertedCount: scala.Double = js.native
  
  /**
    * The driver generated ObjectId for the insert operation.
    */
  var insertedId: ObjectID = js.native
  
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
object InsertOneWriteOpResult {
  
  @scala.inline
  def apply(
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: ObjectID,
    ops: js.Array[_],
    result: Ok
  ): InsertOneWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneWriteOpResult]
  }
  
  @scala.inline
  implicit class InsertOneWriteOpResultMutableBuilder[Self <: InsertOneWriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedId(value: ObjectID): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: js.Array[_]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: js.Any*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: Ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
