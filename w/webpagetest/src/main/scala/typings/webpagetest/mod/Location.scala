package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends StObject {
  
  var Browsers: String = js.native
  
  var Label: String = js.native
  
  var PendingTests: StringDictionary[Double] = js.native
  
  var id: String = js.native
  
  var labelShort: String = js.native
  
  var location: String = js.native
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
