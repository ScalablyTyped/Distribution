package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherKeyValue
  extends StObject
     with CommonParams {
  
  var value: String
}
object CipherKeyValue {
  
  @scala.inline
  def apply(value: String): CipherKeyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherKeyValue]
  }
  
  @scala.inline
  implicit class CipherKeyValueMutableBuilder[Self <: CipherKeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
