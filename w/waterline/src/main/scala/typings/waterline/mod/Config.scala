package typings.waterline.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Waterline Configration */
trait Config extends StObject {
  
  /** A set of adapters to configure */
  var adapters: StringDictionary[Adapter]
  
  /** A set of datastores to configure */
  var datastores: StringDictionary[DatastoreConfig]
}
object Config {
  
  inline def apply(adapters: StringDictionary[Adapter], datastores: StringDictionary[DatastoreConfig]): Config = {
    val __obj = js.Dynamic.literal(adapters = adapters.asInstanceOf[js.Any], datastores = datastores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setAdapters(value: StringDictionary[Adapter]): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
    
    inline def setDatastores(value: StringDictionary[DatastoreConfig]): Self = StObject.set(x, "datastores", value.asInstanceOf[js.Any])
  }
}
