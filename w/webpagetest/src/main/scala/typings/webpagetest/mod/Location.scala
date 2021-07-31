package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var Browsers: String
  
  var Label: String
  
  var PendingTests: StringDictionary[Double]
  
  var id: String
  
  var labelShort: String
  
  var location: String
}
object Location {
  
  @scala.inline
  def apply(
    Browsers: String,
    Label: String,
    PendingTests: StringDictionary[Double],
    id: String,
    labelShort: String,
    location: String
  ): Location = {
    val __obj = js.Dynamic.literal(Browsers = Browsers.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], PendingTests = PendingTests.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelShort = labelShort.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowsers(value: String): Self = StObject.set(x, "Browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelShort(value: String): Self = StObject.set(x, "labelShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingTests(value: StringDictionary[Double]): Self = StObject.set(x, "PendingTests", value.asInstanceOf[js.Any])
  }
}
