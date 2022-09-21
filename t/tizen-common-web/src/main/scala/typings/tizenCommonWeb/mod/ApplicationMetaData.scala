package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationMetaData extends StObject {
  
  /**
    * An attribute to store the key of the application meta data
    */
  val key: String
  
  /**
    * An attribute to store the value of the application meta data
    */
  val value: String
}
object ApplicationMetaData {
  
  inline def apply(key: String, value: String): ApplicationMetaData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetaData]
  }
  
  extension [Self <: ApplicationMetaData](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
