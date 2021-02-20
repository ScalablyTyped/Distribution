package typings.typeorm.typingsMod

import typings.typeorm.anon.IdObjectID
import typings.typeorm.anon.NModified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWriteOpResult extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.Any = js.native
  
  /**
    * The number of documents that matched the filter.
    */
  var matchedCount: scala.Double = js.native
  
  /**
    * The number of documents that were modified.
    */
  var modifiedCount: scala.Double = js.native
  
  /**
    * The raw result returned from MongoDB, field will vary depending on server version.
    * @param ok Is 1 if the command executed correctly.
    * @param n The total count of documents scanned.
    * @param nModified The total count of documents modified.
    */
  var result: NModified = js.native
  
  /**
    * The number of documents upserted.
    */
  var upsertedCount: scala.Double = js.native
  
  /**
    * The upserted id.
    * @param _id The upserted _id returned from the server.
    */
  var upsertedId: IdObjectID = js.native
}
object UpdateWriteOpResult {
  
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: IdObjectID
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
  
  @scala.inline
  implicit class UpdateWriteOpResultMutableBuilder[Self <: UpdateWriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: NModified): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedId(value: IdObjectID): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
  }
}
