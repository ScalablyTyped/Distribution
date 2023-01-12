package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountExtendedData extends StObject {
  
  /**
    * Name (key) of the account extended data item.
    *
    * @since 2.3
    */
  val key: String
  
  /**
    * Value of the account extended data item.
    */
  val value: String
}
object AccountExtendedData {
  
  inline def apply(key: String, value: String): AccountExtendedData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountExtendedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountExtendedData] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
