package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationMetaData extends StObject {
  
  /**
    * An attribute to store the key of the application meta data
    */
  val key: String = js.native
  
  /**
    * An attribute to store the value of the application meta data
    */
  val value: String = js.native
}
object ApplicationMetaData {
  
  @scala.inline
  def apply(key: String, value: String): ApplicationMetaData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetaData]
  }
  
  @scala.inline
  implicit class ApplicationMetaDataMutableBuilder[Self <: ApplicationMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
