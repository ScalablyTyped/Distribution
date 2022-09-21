package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The configuration for a Datastore (MongoDb, Postgres, etc.) */
trait DatastoreConfig extends StObject {
  
  var adapter: String
}
object DatastoreConfig {
  
  inline def apply(adapter: String): DatastoreConfig = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreConfig]
  }
  
  extension [Self <: DatastoreConfig](x: Self) {
    
    inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
  }
}
