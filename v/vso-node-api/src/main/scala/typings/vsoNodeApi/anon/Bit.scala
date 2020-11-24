package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bit extends js.Object {
  
  var bit: scala.Double = js.native
  
  var dateTime: scala.Double = js.native
  
  var float: scala.Double = js.native
  
  var guid: scala.Double = js.native
  
  var int: scala.Double = js.native
  
  var string: scala.Double = js.native
}
object Bit {
  
  @scala.inline
  def apply(
    bit: scala.Double,
    dateTime: scala.Double,
    float: scala.Double,
    guid: scala.Double,
    int: scala.Double,
    string: scala.Double
  ): Bit = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bit]
  }
  
  @scala.inline
  implicit class BitOps[Self <: Bit] (val x: Self) extends AnyVal {
    
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
    def setBit(value: scala.Double): Self = this.set("bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: scala.Double): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat(value: scala.Double): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: scala.Double): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt(value: scala.Double): Self = this.set("int", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: scala.Double): Self = this.set("string", value.asInstanceOf[js.Any])
  }
}
