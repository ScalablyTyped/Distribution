package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
@js.native
trait HttpContentRangeHeaderValue extends js.Object {
  
  /** Gets the position at which to start sending data in the Content-Range HTTP header. */
  var firstBytePosition: Double = js.native
  
  /** Gets the position at which to stop sending data in the Content-Range HTTP header. */
  var lastBytePosition: Double = js.native
  
  /** Gets the length of the full content entity body in the Content-Range HTTP header. */
  var length: Double = js.native
  
  /** Gets or sets the value of the range units used in the Content-Range HTTP header. */
  var unit: String = js.native
}
object HttpContentRangeHeaderValue {
  
  @scala.inline
  def apply(firstBytePosition: Double, lastBytePosition: Double, length: Double, unit: String): HttpContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(firstBytePosition = firstBytePosition.asInstanceOf[js.Any], lastBytePosition = lastBytePosition.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentRangeHeaderValue]
  }
  
  @scala.inline
  implicit class HttpContentRangeHeaderValueOps[Self <: HttpContentRangeHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setFirstBytePosition(value: Double): Self = this.set("firstBytePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastBytePosition(value: Double): Self = this.set("lastBytePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
}
