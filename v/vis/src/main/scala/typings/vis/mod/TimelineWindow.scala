package typings.vis.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineWindow extends StObject {
  
  var end: Date
  
  var start: Date
}
object TimelineWindow {
  
  inline def apply(end: Date, start: Date): TimelineWindow = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineWindow]
  }
  
  extension [Self <: TimelineWindow](x: Self) {
    
    inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
