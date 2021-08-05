package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
trait TimedTextSubformat extends StObject {
  
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  var length: Double
  
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  var startIndex: Double
  
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  var subformatStyle: TimedTextStyle
}
object TimedTextSubformat {
  
  inline def apply(length: Double, startIndex: Double, subformatStyle: TimedTextStyle): TimedTextSubformat = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], subformatStyle = subformatStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSubformat]
  }
  
  extension [Self <: TimedTextSubformat](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setSubformatStyle(value: TimedTextStyle): Self = StObject.set(x, "subformatStyle", value.asInstanceOf[js.Any])
  }
}
