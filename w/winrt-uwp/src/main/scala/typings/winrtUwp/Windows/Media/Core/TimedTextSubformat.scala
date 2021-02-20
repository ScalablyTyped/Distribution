package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
@js.native
trait TimedTextSubformat extends StObject {
  
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  var length: Double = js.native
  
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  var startIndex: Double = js.native
  
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  var subformatStyle: TimedTextStyle = js.native
}
object TimedTextSubformat {
  
  @scala.inline
  def apply(length: Double, startIndex: Double, subformatStyle: TimedTextStyle): TimedTextSubformat = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], subformatStyle = subformatStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSubformat]
  }
  
  @scala.inline
  implicit class TimedTextSubformatMutableBuilder[Self <: TimedTextSubformat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubformatStyle(value: TimedTextStyle): Self = StObject.set(x, "subformatStyle", value.asInstanceOf[js.Any])
  }
}
