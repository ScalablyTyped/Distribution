package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValueConfig extends StObject {
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var on: js.UndefOr[EventHash] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
  
  var view: js.UndefOr[String] = js.undefined
}
object DataValueConfig {
  
  @scala.inline
  def apply(): DataValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValueConfig]
  }
  
  @scala.inline
  implicit class DataValueConfigMutableBuilder[Self <: DataValueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
