package typings.winrtUwp.Windows.Web.Http.Headers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
trait HttpContentRangeHeaderValue extends StObject {
  
  /** Gets the position at which to start sending data in the Content-Range HTTP header. */
  var firstBytePosition: Double
  
  /** Gets the position at which to stop sending data in the Content-Range HTTP header. */
  var lastBytePosition: Double
  
  /** Gets the length of the full content entity body in the Content-Range HTTP header. */
  var length: Double
  
  /** Gets or sets the value of the range units used in the Content-Range HTTP header. */
  var unit: String
}
object HttpContentRangeHeaderValue {
  
  @scala.inline
  def apply(firstBytePosition: Double, lastBytePosition: Double, length: Double, unit: String): HttpContentRangeHeaderValue = {
    val __obj = js.Dynamic.literal(firstBytePosition = firstBytePosition.asInstanceOf[js.Any], lastBytePosition = lastBytePosition.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentRangeHeaderValue]
  }
  
  @scala.inline
  implicit class HttpContentRangeHeaderValueMutableBuilder[Self <: HttpContentRangeHeaderValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstBytePosition(value: Double): Self = StObject.set(x, "firstBytePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastBytePosition(value: Double): Self = StObject.set(x, "lastBytePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
