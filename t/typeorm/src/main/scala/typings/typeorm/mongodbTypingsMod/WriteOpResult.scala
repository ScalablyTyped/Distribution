package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteOpResult extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.Any
  
  /**
    * All the documents inserted using insertOne/insertMany/replaceOne.
    * Documents contain the _id field if forceServerObjectId == false for insertOne/insertMany.
    */
  var ops: js.Array[js.Any]
  
  /**
    * The command result object.
    */
  var result: js.Any
}
object WriteOpResult {
  
  @scala.inline
  def apply(connection: js.Any, ops: js.Array[js.Any], result: js.Any): WriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOpResult]
  }
  
  @scala.inline
  implicit class WriteOpResultMutableBuilder[Self <: WriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: js.Array[js.Any]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: js.Any*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
