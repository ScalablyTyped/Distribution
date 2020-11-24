package typings.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonValue extends js.Object {
  
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
  implicit class IJsonValueOps[Self <: IJsonValue] (val x: Self) extends AnyVal {
    
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
    def setGetArray(value: () => JsonArray): Self = this.set("getArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoolean(value: () => Boolean): Self = this.set("getBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumber(value: () => Double): Self = this.set("getNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: () => JsonObject): Self = this.set("getObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = this.set("getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStringify(value: () => String): Self = this.set("stringify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueType(value: JsonValueType): Self = this.set("valueType", value.asInstanceOf[js.Any])
  }
}
