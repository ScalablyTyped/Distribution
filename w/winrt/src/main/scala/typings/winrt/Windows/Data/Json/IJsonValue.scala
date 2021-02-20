package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonValue extends StObject {
  
  def getArray(): JsonArray = js.native
  
  def getBoolean(): Boolean = js.native
  
  def getNumber(): Double = js.native
  
  def getObject(): JsonObject = js.native
  
  def getString(): String = js.native
  
  def stringify(): String = js.native
  
  var valueType: JsonValueType = js.native
}
object IJsonValue {
  
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getBoolean: () => Boolean,
    getNumber: () => Double,
    getObject: () => JsonObject,
    getString: () => String,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonValue]
  }
  
  @scala.inline
  implicit class IJsonValueMutableBuilder[Self <: IJsonValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetArray(value: () => JsonArray): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoolean(value: () => Boolean): Self = StObject.set(x, "getBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumber(value: () => Double): Self = StObject.set(x, "getNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: () => JsonObject): Self = StObject.set(x, "getObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStringify(value: () => String): Self = StObject.set(x, "stringify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueType(value: JsonValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
