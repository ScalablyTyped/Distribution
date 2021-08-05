package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.NModified
import typings.typeorm.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWriteOpResult extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.Any
  
  /**
    * The number of documents that matched the filter.
    */
  var matchedCount: scala.Double
  
  /**
    * The number of documents that were modified.
    */
  var modifiedCount: scala.Double
  
  /**
    * The raw result returned from MongoDB, field will vary depending on server version.
    * @param ok Is 1 if the command executed correctly.
    * @param n The total count of documents scanned.
    * @param nModified The total count of documents modified.
    */
  var result: NModified
  
  /**
    * The number of documents upserted.
    */
  var upsertedCount: scala.Double
  
  /**
    * The upserted id.
    * @param _id The upserted _id returned from the server.
    */
  var upsertedId: `7`
}
object UpdateWriteOpResult {
  
  inline def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: `7`
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
  
  extension [Self <: UpdateWriteOpResult](x: Self) {
    
    inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    inline def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    inline def setResult(value: NModified): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    inline def setUpsertedId(value: `7`): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
  }
}
