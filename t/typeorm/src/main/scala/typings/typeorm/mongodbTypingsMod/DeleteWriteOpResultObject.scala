package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWriteOpResultObject extends StObject {
  
  /**
    * The connection object used for the operation.
    */
  var connection: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The number of documents deleted.
    */
  var deletedCount: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * The raw result returned from MongoDB, field will vary depending on server version.
    * @param ok Is 1 if the command executed correctly.
    * @param n The total count of documents deleted.
    */
  var result: N
}
object DeleteWriteOpResultObject {
  
  inline def apply(result: N): DeleteWriteOpResultObject = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWriteOpResultObject]
  }
  
  extension [Self <: DeleteWriteOpResultObject](x: Self) {
    
    inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDeletedCount(value: scala.Double): Self = StObject.set(x, "deletedCount", value.asInstanceOf[js.Any])
    
    inline def setDeletedCountUndefined: Self = StObject.set(x, "deletedCount", js.undefined)
    
    inline def setResult(value: N): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
