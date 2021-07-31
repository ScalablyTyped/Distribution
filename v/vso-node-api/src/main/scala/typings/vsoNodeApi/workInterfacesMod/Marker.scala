package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marker extends StObject {
  
  /**
    * Color associated with the marker.
    */
  var color: String
  
  /**
    * Where the marker should be displayed on the timeline.
    */
  var date: Date
  
  /**
    * Label/title for the marker.
    */
  var label: String
}
object Marker {
  
  @scala.inline
  def apply(color: String, date: Date, label: String): Marker = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  @scala.inline
  implicit class MarkerMutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
