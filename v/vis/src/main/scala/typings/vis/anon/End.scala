package typings.vis.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: Date
  
  var start: Date
}
object End {
  
  @scala.inline
  def apply(end: Date, start: Date): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
