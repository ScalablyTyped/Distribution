package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends js.Object {
  
  var array: scala.Double = js.native
  
  var boolean: scala.Double = js.native
  
  var dateTime: scala.Double = js.native
  
  var dictionary: scala.Double = js.native
  
  var double: scala.Double = js.native
  
  var guid: scala.Double = js.native
  
  var integer: scala.Double = js.native
  
  var `object`: scala.Double = js.native
  
  var string: scala.Double = js.native
  
  var unknown: scala.Double = js.native
  
  var uri: scala.Double = js.native
}
object Array {
  
  @scala.inline
  def apply(
    array: scala.Double,
    boolean: scala.Double,
    dateTime: scala.Double,
    dictionary: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    integer: scala.Double,
    `object`: scala.Double,
    string: scala.Double,
    unknown: scala.Double,
    uri: scala.Double
  ): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayOps[Self <: Array] (val x: Self) extends AnyVal {
    
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
    def setArray(value: scala.Double): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolean(value: scala.Double): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: scala.Double): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionary(value: scala.Double): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: scala.Double): Self = this.set("double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: scala.Double): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteger(value: scala.Double): Self = this.set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: scala.Double): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown(value: scala.Double): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: scala.Double): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
