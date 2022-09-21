package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An DatastoreConfig thats been Initalized */
trait DatastoreConfigInstance
  extends StObject
     with DatastoreConfig {
  
  var identity: String
}
object DatastoreConfigInstance {
  
  inline def apply(adapter: String, identity: String): DatastoreConfigInstance = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatastoreConfigInstance]
  }
  
  extension [Self <: DatastoreConfigInstance](x: Self) {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
  }
}
