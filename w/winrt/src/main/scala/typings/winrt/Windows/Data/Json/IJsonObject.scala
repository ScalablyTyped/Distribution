package typings.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonObject extends IJsonValue {
  
  def getNamedArray(name: String): JsonArray = js.native
  
  def getNamedBoolean(name: String): Boolean = js.native
  
  def getNamedNumber(name: String): Double = js.native
  
  def getNamedObject(name: String): JsonObject = js.native
  
  def getNamedString(name: String): String = js.native
  
  def getNamedValue(name: String): JsonValue = js.native
  
  def setNamedValue(name: String, value: IJsonValue): Unit = js.native
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
  implicit class IJsonObjectOps[Self <: IJsonObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetNamedArray(value: String => JsonArray): Self = this.set("getNamedArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedBoolean(value: String => Boolean): Self = this.set("getNamedBoolean", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedNumber(value: String => Double): Self = this.set("getNamedNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedObject(value: String => JsonObject): Self = this.set("getNamedObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedString(value: String => String): Self = this.set("getNamedString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedValue(value: String => JsonValue): Self = this.set("getNamedValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNamedValue(value: (String, IJsonValue) => Unit): Self = this.set("setNamedValue", js.Any.fromFunction2(value))
  }
}
