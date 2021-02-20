package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionEvent extends StObject {
  
  /**
    * Id which identifies each data point uniquely
    */
  var id: Double = js.native
  
  var properties: js.Any = js.native
  
  /**
    * Timestamp of when the event occurred
    */
  var statisticDate: Date = js.native
  
  /**
    * Version of the extension
    */
  var version: String = js.native
}
object ExtensionEvent {
  
  @scala.inline
  def apply(id: Double, properties: js.Any, statisticDate: Date, version: String): ExtensionEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], statisticDate = statisticDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEvent]
  }
  
  @scala.inline
  implicit class ExtensionEventMutableBuilder[Self <: ExtensionEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticDate(value: Date): Self = StObject.set(x, "statisticDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
