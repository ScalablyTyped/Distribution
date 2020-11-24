package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.NModified
import typings.typeorm.anon.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWriteOpResult extends js.Object {
  
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
  var upsertedId: `7` = js.native
}
object UpdateWriteOpResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class UpdateWriteOpResultOps[Self <: UpdateWriteOpResult] (val x: Self) extends AnyVal {
    
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
    def setMatchedCount(value: scala.Double): Self = this.set("matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = this.set("modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: NModified): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = this.set("upsertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedId(value: `7`): Self = this.set("upsertedId", value.asInstanceOf[js.Any])
  }
}
