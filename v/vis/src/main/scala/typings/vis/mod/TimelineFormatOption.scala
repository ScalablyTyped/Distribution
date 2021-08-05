package typings.vis.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineFormatOption extends StObject {
  
  var majorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.undefined
  
  var minorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.undefined
}
object TimelineFormatOption {
  
  inline def apply(): TimelineFormatOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineFormatOption]
  }
  
  extension [Self <: TimelineFormatOption](x: Self) {
    
    inline def setMajorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = StObject.set(x, "majorLabels", value.asInstanceOf[js.Any])
    
    inline def setMajorLabelsFunction3(value: (/* date */ Date, /* scale */ String, /* step */ Double) => String): Self = StObject.set(x, "majorLabels", js.Any.fromFunction3(value))
    
    inline def setMajorLabelsUndefined: Self = StObject.set(x, "majorLabels", js.undefined)
    
    inline def setMinorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = StObject.set(x, "minorLabels", value.asInstanceOf[js.Any])
    
    inline def setMinorLabelsFunction3(value: (/* date */ Date, /* scale */ String, /* step */ Double) => String): Self = StObject.set(x, "minorLabels", js.Any.fromFunction3(value))
    
    inline def setMinorLabelsUndefined: Self = StObject.set(x, "minorLabels", js.undefined)
  }
}
