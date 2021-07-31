package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonObject
  extends StObject
     with IJsonValue {
  
  def getNamedArray(name: String): JsonArray
  
  def getNamedBoolean(name: String): Boolean
  
  def getNamedNumber(name: String): Double
  
  def getNamedObject(name: String): JsonObject
  
  def getNamedString(name: String): String
  
  def getNamedValue(name: String): JsonValue
  
  def setNamedValue(name: String, value: IJsonValue): Unit
}
object IJsonObject {
  
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getBoolean: () => Boolean,
    getNamedArray: String => JsonArray,
    getNamedBoolean: String => Boolean,
    getNamedNumber: String => Double,
    getNamedObject: String => JsonObject,
    getNamedString: String => String,
    getNamedValue: String => JsonValue,
    getNumber: () => Double,
    getObject: () => JsonObject,
    getString: () => String,
    setNamedValue: (String, IJsonValue) => Unit,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonObject = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNamedArray = js.Any.fromFunction1(getNamedArray), getNamedBoolean = js.Any.fromFunction1(getNamedBoolean), getNamedNumber = js.Any.fromFunction1(getNamedNumber), getNamedObject = js.Any.fromFunction1(getNamedObject), getNamedString = js.Any.fromFunction1(getNamedString), getNamedValue = js.Any.fromFunction1(getNamedValue), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), setNamedValue = js.Any.fromFunction2(setNamedValue), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonObject]
  }
  
  @scala.inline
  implicit class IJsonObjectMutableBuilder[Self <: IJsonObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNamedArray(value: String => JsonArray): Self = StObject.set(x, "getNamedArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedBoolean(value: String => Boolean): Self = StObject.set(x, "getNamedBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedNumber(value: String => Double): Self = StObject.set(x, "getNamedNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedObject(value: String => JsonObject): Self = StObject.set(x, "getNamedObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedString(value: String => String): Self = StObject.set(x, "getNamedString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedValue(value: String => JsonValue): Self = StObject.set(x, "getNamedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNamedValue(value: (String, IJsonValue) => Unit): Self = StObject.set(x, "setNamedValue", js.Any.fromFunction2(value))
  }
}
