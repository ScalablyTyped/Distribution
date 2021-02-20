package typings.vis.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFormatOption extends StObject {
  
  var majorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.native
  
  var minorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.native
}
object TimelineFormatOption {
  
  @scala.inline
  def apply(): TimelineFormatOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineFormatOption]
  }
  
  @scala.inline
  implicit class TimelineFormatOptionMutableBuilder[Self <: TimelineFormatOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = StObject.set(x, "majorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorLabelsFunction3(value: (/* date */ Date, /* scale */ String, /* step */ Double) => String): Self = StObject.set(x, "majorLabels", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMajorLabelsUndefined: Self = StObject.set(x, "majorLabels", js.undefined)
    
    @scala.inline
    def setMinorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = StObject.set(x, "minorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorLabelsFunction3(value: (/* date */ Date, /* scale */ String, /* step */ Double) => String): Self = StObject.set(x, "minorLabels", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMinorLabelsUndefined: Self = StObject.set(x, "minorLabels", js.undefined)
  }
}
