package typings.typeorm.typingsMod

import typings.typeorm.anon.Ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertWriteOpResult extends js.Object {
  
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
  implicit class InsertWriteOpResultOps[Self <: InsertWriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection(value: js.Any): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = this.set("insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIdsVarargs(value: ObjectID*): Self = this.set("insertedIds", js.Array(value :_*))
    
    @scala.inline
    def setInsertedIds(value: js.Array[ObjectID]): Self = this.set("insertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: js.Any*): Self = this.set("ops", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: js.Array[_]): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: Ok): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
