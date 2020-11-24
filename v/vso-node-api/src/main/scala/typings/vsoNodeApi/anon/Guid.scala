package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guid extends js.Object {
  
  var boolean: scala.Double = js.native
  
  var dateTime: scala.Double = js.native
  
  var double: scala.Double = js.native
  
  var guid: scala.Double = js.native
  
  var history: scala.Double = js.native
  
  var html: scala.Double = js.native
  
  var identity: scala.Double = js.native
  
  var integer: scala.Double = js.native
  
  var picklistDouble: scala.Double = js.native
  
  var picklistInteger: scala.Double = js.native
  
  var picklistString: scala.Double = js.native
  
  var plainText: scala.Double = js.native
  
  var string: scala.Double = js.native
  
  var treePath: scala.Double = js.native
}
object Guid {
  
  @scala.inline
  def apply(
    boolean: scala.Double,
    dateTime: scala.Double,
    double: scala.Double,
    guid: scala.Double,
    history: scala.Double,
    html: scala.Double,
    identity: scala.Double,
    integer: scala.Double,
    picklistDouble: scala.Double,
    picklistInteger: scala.Double,
    picklistString: scala.Double,
    plainText: scala.Double,
    string: scala.Double,
    treePath: scala.Double
  ): Guid = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], picklistDouble = picklistDouble.asInstanceOf[js.Any], picklistInteger = picklistInteger.asInstanceOf[js.Any], picklistString = picklistString.asInstanceOf[js.Any], plainText = plainText.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], treePath = treePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
  
  @scala.inline
  implicit class GuidOps[Self <: Guid] (val x: Self) extends AnyVal {
    
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
    def setBoolean(value: scala.Double): Self = this.set("boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: scala.Double): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDouble(value: scala.Double): Self = this.set("double", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: scala.Double): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: scala.Double): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: scala.Double): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: scala.Double): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteger(value: scala.Double): Self = this.set("integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicklistDouble(value: scala.Double): Self = this.set("picklistDouble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicklistInteger(value: scala.Double): Self = this.set("picklistInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicklistString(value: scala.Double): Self = this.set("picklistString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainText(value: scala.Double): Self = this.set("plainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreePath(value: scala.Double): Self = this.set("treePath", value.asInstanceOf[js.Any])
  }
}
